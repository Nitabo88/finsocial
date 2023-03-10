package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.models.builders.CredencialesBDBuilder.con;
import static co.com.red5g.finsonet.questions.CiudadDepartamento.ciudadDepartamento;
import static co.com.red5g.finsonet.questions.LugarYFechaNacimiento.lugarYFechaNacimiento;
import static co.com.red5g.finsonet.questions.NombreCompleto.nombreCompleto;
import static co.com.red5g.finsonet.questions.SolicitudCreditoPdf.tipoCliente;
import static co.com.red5g.finsonet.questions.TotalIngresos.totalIngresos;
import static co.com.red5g.finsonet.questions.UrlSoportes.obtenerUrlDelPdf;
import static co.com.red5g.finsonet.tasks.Obtiene.NUMERO_FILAS;
import static co.com.red5g.utils.conexionbd.QueriesFinsonet.SQL_ANALITICA_FILTRO;
import static co.com.red5g.utils.conexionbd.QueriesFinsonet.SQL_ASEGURABILIDAD;
import static co.com.red5g.utils.conexionbd.QueriesFinsonet.SQL_CIUDAD_RESIDENCIA;
import static co.com.red5g.utils.conexionbd.QueriesFinsonet.SQL_FORMULARIO_SOLICITUD;
import static co.com.red5g.utils.conexionbd.QueriesFinsonet.SQL_LINEA_CREDITO;
import static co.com.red5g.utils.conexionbd.QueriesFinsonet.SQL_LUGAR_EXPEDICION;
import static co.com.red5g.utils.conexionbd.QueriesFinsonet.SQL_LUGAR_NACIMIENTO;
import static co.com.red5g.utils.pdf.EstructurasPDFFinsocial.boletinCostos;
import static co.com.red5g.utils.pdf.EstructurasPDFFinsocial.desafiliacion;
import static co.com.red5g.utils.pdf.EstructurasPDFFinsocial.estadoCivil;
import static co.com.red5g.utils.pdf.EstructurasPDFFinsocial.formularioActival;
import static co.com.red5g.utils.pdf.EstructurasPDFFinsocial.ocupacion;
import static co.com.red5g.utils.pdf.EstructurasPDFFinsocial.pagareCoophumana;
import static co.com.red5g.utils.pdf.EstructurasPDFFinsocial.pagareFinsocial;
import static co.com.red5g.utils.pdf.EstructurasPDFFinsocial.seguroVidaSura;
import static co.com.red5g.utils.pdf.EstructurasPDFFinsocial.segurosVidaMundial;
import static co.com.red5g.utils.pdf.EstructurasPDFFinsocial.solicitudAfiliacionCoperativa;
import static co.com.red5g.utils.pdf.EstructurasPDFFinsocial.solicitudCredito;
import static co.com.red5g.utils.pdf.EstructurasPDFFinsocial.valorCapital;
import static co.com.red5g.utils.pdf.EstructurasPDFFinsocial.valorCapitalSura;
import static co.com.red5g.utils.string.UtileriaFechas.edad;
import static co.com.red5g.utils.string.UtileriaFechas.fechaPdfDdMmYyyy;
import static co.com.red5g.utils.string.UtileriaFechas.fechaPdfFormatoLinea;
import static co.com.red5g.utils.string.UtileriaFechas.fechaPdfFormatoSlash;
import static co.com.red5g.utils.string.UtileriaFechas.fechaPdfSolicitud;
import static co.com.red5g.utils.string.UtileriaFechas.fechaPdfYyyyMmDd;
import static co.com.red5g.utils.string.UtileriasMoneda.formatoMoneda;
import static co.com.red5g.utils.string.UtileriasMoneda.formatoMonedaSinPesos;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

import co.com.red5g.finsonet.questions.factories.LaInformacion;
import co.com.red5g.finsonet.tasks.Obtiene;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class SoportesTesoreriaFinsoamigoStepDefinition {

  @Dado("^que (.*) esta en el pdf de (.*) del cr??dito (.*)$")
  public void ingresarUrlPdf(String actor, String url, String numeroCredito) {
    String urlPdf = theActorCalled(actor).asksFor(obtenerUrlDelPdf(url, numeroCredito));
    theActorInTheSpotlight().wasAbleTo(Ingresa.alPDF(urlPdf, numeroCredito));
  }

  @Cuando("^el asesor obtiene la informaci??n del pdf$")
  public void obtenerInformacionPdf() {
    theActorInTheSpotlight().attemptsTo(Obtiene.laInformacionDelPdf());
  }

  @Entonces("^el asesor deber?? ver que la informaci??n del Formato Seguro de Vida Mundial corresponde a la de BD$")
  public void verificarSegurosVidaMundial() {
    theActorInTheSpotlight().should(
        seeThat("Ciudad", LaInformacion.delPdf(segurosVidaMundial("Ciudad Solicitud")), containsString("barranquilla")),
        seeThat("Fecha de Solicitud", LaInformacion.delPdf(segurosVidaMundial("Fecha Solicitud")), containsString(fechaPdfDdMmYyyy(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_ANALITICA_FILTRO.getSql(), "fecha_reg"))))),
        seeThat("Nombre o Raz??n Social", LaInformacion.delPdf(segurosVidaMundial("Nombre o Razon Social")), containsString("finsocial s.a.s")),
        seeThat("Identificacion", LaInformacion.delPdf(segurosVidaMundial("Tipo Identificacion Tomador")), containsString("nit")),
        seeThat("NIT", LaInformacion.delPdf(segurosVidaMundial("Numero Identificacion Tomador")), containsString("900516574-6")),
        seeThat("Cr??dito No.", LaInformacion.delPdf(segurosVidaMundial("Credito No")), containsString(" ")),
        seeThat("Valor Capital", LaInformacion.delPdf(segurosVidaMundial("Valor Capital")), containsString(valorCapital(Integer.parseInt(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdCreditos(), SQL_LINEA_CREDITO.getSql(), "linea_credito_id")))))),
        seeThat("Tipo de Documento", LaInformacion.delPdf(segurosVidaMundial("Tipo Identificacion Asegurado")), containsString("x")),
        seeThat("N??mero Documento", LaInformacion.delPdf(segurosVidaMundial("Numero Identificacion Asegurado")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat("Primer Apellido", LaInformacion.delPdf(segurosVidaMundial("Primer Apellido")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "p_apellido")))),
        seeThat("Segundo Apellido", LaInformacion.delPdf(segurosVidaMundial("Segundo Apellido")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "s_apellido")))),
        seeThat("Nombres", LaInformacion.delPdf(segurosVidaMundial("Nombres")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "nombre")))),
        seeThat("Nombres", LaInformacion.delPdf(segurosVidaMundial("Nombres")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "s_nombre")))),
        seeThat("Peso", LaInformacion.delPdf(segurosVidaMundial("Peso")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_ASEGURABILIDAD.getSql(), "peso")))),
        seeThat("Estatura", LaInformacion.delPdf(segurosVidaMundial("Estatura")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_ASEGURABILIDAD.getSql(), "estatura")))),
        seeThat("Sexo", LaInformacion.delPdf(segurosVidaMundial("Sexo")), containsString("x")),
        seeThat("Fecha de Nacimiento", LaInformacion.delPdf(segurosVidaMundial("Fecha Nacimiento")), containsString(fechaPdfDdMmYyyy(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_nac"))))),
        seeThat("Edad", LaInformacion.delPdf(segurosVidaMundial("Edad")), containsString(edad(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_nac"))))),
        seeThat("Ocupaci??n Actual", LaInformacion.delPdf(segurosVidaMundial("Ocupacion Actual")), containsString(ocupacion(Integer.parseInt(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "profesion")))))),
        seeThat("Estado Civil", LaInformacion.delPdf(segurosVidaMundial("Estado Civil")), containsString(estadoCivil(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "estado_civil"))))),
        seeThat("Direcci??n Residencia", LaInformacion.delPdf(segurosVidaMundial("Direccion Residencia")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_residencia")))),
        seeThat("E-mail", LaInformacion.delPdf(segurosVidaMundial("E-mail")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "email")))),
        seeThat("Tel??fono", LaInformacion.delPdf(segurosVidaMundial("Telefono")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "tel_residencia")))),
        seeThat("Ciudad", LaInformacion.delPdf(segurosVidaMundial("Ciudad Residencia")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_CIUDAD_RESIDENCIA.getSql(), "ciudad"))))
    );
  }

  @Entonces("^el asesor deber?? ver que la informaci??n de Solicitud de Cr??dito corresponde a la de BD$")
  public void verificarSolicitudCredito() {
    int pdf = theActorInTheSpotlight().asksFor(tipoCliente());
    int filas = theActorInTheSpotlight().recall(NUMERO_FILAS);
    if (pdf != 0) {
      theActorInTheSpotlight().should(
          seeThat("Nombre de la empresa donde trabaja: ", LaInformacion.delPdf(solicitudCredito("Nombre Empresa", pdf)), containsString(theActorInTheSpotlight()
              .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "empresa")))),
          seeThat("Cargo: ", LaInformacion.delPdf(solicitudCredito("Cargo", pdf)), containsString(ocupacion(Integer.parseInt(theActorInTheSpotlight()
              .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "ocupacion")))))),
          seeThat("Direcci??n Lugar de Trabajo", LaInformacion.delPdf(solicitudCredito("Direccion Trabajo", pdf)), containsString(theActorInTheSpotlight()
              .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_empresa")))),
          seeThat("Tel??fono de Trabajo", LaInformacion.delPdf(solicitudCredito("Telefono Trabajo", pdf)), containsString(theActorInTheSpotlight()
              .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "telefono_empresa"))))
      );
    }
    theActorInTheSpotlight().should(
        seeThat("FECHA:  ", LaInformacion.delPdf(solicitudCredito("Fecha Solicitud", pdf)), containsString(fechaPdfSolicitud(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_ANALITICA_FILTRO.getSql(), "fecha_reg"))))),
        seeThat("Tipo de solicitud: ", LaInformacion.delPdf(solicitudCredito("Tipo Solicitud", pdf)), containsString("x")),
        seeThat("Valor: ", LaInformacion.delPdf(solicitudCredito("Valor", pdf)), containsString("$ 9.000.000")),
        seeThat("L??nea: ", LaInformacion.delPdf(solicitudCredito("Linea", pdf)), containsString("finsoamigo")),
        seeThat("N??mero de Cuotas: ", LaInformacion.delPdf(solicitudCredito("Numero Cuotas", pdf)), containsString("60")),
        seeThat("Valor Cuota: ", LaInformacion.delPdf(solicitudCredito("Valor Cuota", pdf)), containsString("$ 384.888")),
        seeThat("Primer Nombre: ", LaInformacion.delPdf(solicitudCredito("Primer Nombre", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "nombre")))),
        seeThat("Segundo Nombre: ", LaInformacion.delPdf(solicitudCredito("Segundo Nombre", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "s_nombre")))),
        seeThat("Primer Apellido: ", LaInformacion.delPdf(solicitudCredito("Primer Apellido", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "p_apellido")))),
        seeThat("Segundo Apellido: ", LaInformacion.delPdf(solicitudCredito("Segundo Apellido", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "s_apellido")))),
        seeThat("Tipo Identificaci??n: ", LaInformacion.delPdf(solicitudCredito("Tipo Identificacion", pdf)), containsString("x")),
        seeThat("Numero: ", LaInformacion.delPdf(solicitudCredito("Numero Identificacion", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat("Fecha de Expedici??n", LaInformacion.delPdf(solicitudCredito("Fecha Expedicion", pdf)), containsString(fechaPdfDdMmYyyy(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_exp"))))),
        seeThat("Lugar de Expedici??n: ", LaInformacion.delPdf(solicitudCredito("Lugar Expedicion", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_LUGAR_EXPEDICION.getSql(), "ciudad")))),
        seeThat("Fecha de Nacimiento: ", LaInformacion.delPdf(solicitudCredito("Fecha de Nacimiento", pdf)), containsString(fechaPdfDdMmYyyy(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_nac"))))),
        seeThat("Sexo: ", LaInformacion.delPdf(solicitudCredito("Sexo", pdf)), containsString("x")),
        seeThat("Lugar de Nacimiento:", LaInformacion.delPdf(solicitudCredito("Lugar Nacimiento", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_LUGAR_NACIMIENTO.getSql(), "ciudad")))),
        seeThat("Estado civil: ", LaInformacion.delPdf(solicitudCredito("Estado Civil", pdf)), containsString("x")),
        seeThat("Pa??s de Residencia:", LaInformacion.delPdf(solicitudCredito("Pais Residencia", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "pais_residencia")))),
        seeThat("Ciudad y Departamento: ", LaInformacion.delPdf(solicitudCredito("Ciudad y Departamento", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_CIUDAD_RESIDENCIA.getSql(), "ciudad")))),
        seeThat("Dir.Residencia suministrada por el cliente: ", LaInformacion.delPdf(solicitudCredito("Direccion Residencia", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_residencia")))),
        seeThat("Tel. Residencia: ", LaInformacion.delPdf(solicitudCredito("Telefono Residencia", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "tel_residencia")))),
        seeThat("Tel??fono Celular: ", LaInformacion.delPdf(solicitudCredito("Telefono Celular", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "celular")))),
        seeThat("Lugar env??o correspondencia: ", LaInformacion.delPdf(solicitudCredito("Lugar Envio Correspondencia", pdf)), containsString("x")),
        seeThat("Correo Electr??nico: ", LaInformacion.delPdf(solicitudCredito("Correo Electronico", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "email")))),
        seeThat("Ocupaci??n: ", LaInformacion.delPdf(solicitudCredito("Ocupacion", pdf)), containsString("x")),
        seeThat("Preguntas Actividad Laboral: ", LaInformacion.delPdf(solicitudCredito("Preguntas Actividad Laboral", pdf)), containsString("x xx")),
        seeThat("Actividad Econ??mica Principal", LaInformacion.delPdf(solicitudCredito("Actividad Economica", pdf)), containsString(ocupacion(Integer.parseInt(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "ocupacion")))))),
        seeThat("Activos Corrientes (Ahorros e Inversiones)", LaInformacion.delPdf(solicitudCredito("Activos Corrientes", pdf)), containsString(formatoMoneda(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_activos"))))),
        seeThat("Activos Fijos (Veh??culo o Propiedades)", LaInformacion.delPdf(solicitudCredito("Activos Fijos", pdf)), containsString("$0")),
        seeThat("Otros Activos", LaInformacion.delPdf(solicitudCredito("Otros Activos", pdf)), containsString("$0")),
        seeThat("Total Activos", LaInformacion.delPdf(solicitudCredito("Total Activos", pdf)), containsString(formatoMoneda(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_activos"))))),
        seeThat("Pasivos Financieros (Deudas Financieras)", LaInformacion.delPdf(solicitudCredito("Pasivos Financieros", pdf)), containsString(formatoMoneda(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_pasivos"))))),
        seeThat("Pasivos Corrientes (Deudas con Terceros)", LaInformacion.delPdf(solicitudCredito("Pasivos Corrientes", pdf)), containsString("$0")),
        seeThat("Otros Pasivos", LaInformacion.delPdf(solicitudCredito("Otros Pasivos", pdf)), containsString("$0")),
        seeThat("Total Pasivos", LaInformacion.delPdf(solicitudCredito("Total Pasivos", pdf)), containsString(formatoMoneda(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_pasivos"))))),
        seeThat("Salario Fijo", LaInformacion.delPdf(solicitudCredito("Salario Fijo", pdf)), containsString(formatoMoneda(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_ingresos"))))),
        seeThat("Salario Variable y Comisiones", LaInformacion.delPdf(solicitudCredito("Salario Variable y Comisiones", pdf)), containsString("$0")),
        seeThat("Arrendamiento", LaInformacion.delPdf(solicitudCredito("Arrendamiento", pdf)), containsString("$0")),
        seeThat("Rendimiento Financieros", LaInformacion.delPdf(solicitudCredito("Rendimiento Financieros", pdf)), containsString("$0")),
        seeThat("Honorarios", LaInformacion.delPdf(solicitudCredito("Honorarios", pdf)), containsString("$0")),
        seeThat("*Otros Ingresos", LaInformacion.delPdf(solicitudCredito("Otros Ingresos", pdf)), containsString(formatoMoneda(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "otros_ingresos"))))),
        seeThat("Total Ingresos", LaInformacion.delPdf(solicitudCredito("Total Ingresos", pdf)), containsString(formatoMoneda(theActorInTheSpotlight().asksFor(totalIngresos())))),
        seeThat("Arriendos", LaInformacion.delPdf(solicitudCredito("Arriendos", pdf)), containsString("$0")),
        seeThat("Gastos Pesonales,Familiares", LaInformacion.delPdf(solicitudCredito("Gastos Pesonales,Familiares", pdf)), containsString("$0")),
        seeThat("Prestamos diferentes a finsocial", LaInformacion.delPdf(solicitudCredito("Prestamos diferentes a finsocial", pdf)), containsString("$0")),
        seeThat("Deducciones de N??mina", LaInformacion.delPdf(solicitudCredito("Deducciones Nomina", pdf)), containsString("$0")),
        seeThat("Tarjetas de Cr??dito", LaInformacion.delPdf(solicitudCredito("Tarjeta Credito", pdf)), containsString("$0")),
        seeThat("Otros Gastos", LaInformacion.delPdf(solicitudCredito("Otros Gastos", pdf)), containsString(formatoMoneda(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_egresos"))))),
        seeThat("Total Egresos", LaInformacion.delPdf(solicitudCredito("Total Egresos", pdf)), containsString(formatoMoneda(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_egresos"))))),
        seeThat("DATOS DE OPERACIONES INTERNACIONALES", LaInformacion.delPdf(solicitudCredito("Datos Operaciones Internacionales", pdf)), containsString("x x")),
        seeThat("DECLARACION FATCA/CRS", LaInformacion.delPdf(solicitudCredito("FATCA", pdf)), containsString("x")),
        seeThat("MUTUARIO", LaInformacion.delPdf(solicitudCredito("Mutuario", filas)), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("c??dula de ciudadan??a No", LaInformacion.delPdf(solicitudCredito("Numero Documento Mutuario", filas)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat("DECLARACION ORIGEN DE FONDOS", LaInformacion.delPdf(solicitudCredito("Origen Fondos", filas)), containsString("x")),
        seeThat("DECLARACION DE ASEGURABILIDAD 1", LaInformacion.delPdf(solicitudCredito("Asegurabilidad-1", filas)), containsString("x")),
        seeThat("DECLARACION DE ASEGURABILIDAD 2", LaInformacion.delPdf(solicitudCredito("Asegurabilidad-2", filas)), containsString("x")),
        seeThat("DECLARACION DE ASEGURABILIDAD 3", LaInformacion.delPdf(solicitudCredito("Asegurabilidad-3", filas)), containsString("x")),
        seeThat("DECLARACION DE ASEGURABILIDAD 4", LaInformacion.delPdf(solicitudCredito("Asegurabilidad-4", filas)), containsString("x")),
        seeThat("DECLARACION DE ASEGURABILIDAD 5", LaInformacion.delPdf(solicitudCredito("Asegurabilidad-5", filas)), containsString("x")),
        seeThat("??He sufrido o sufro de alguna enfermedad?", LaInformacion.delPdf(solicitudCredito("Enfermedad", filas)), containsString("x")),
        seeThat("DECLARACIONES DEL MUTUARIO 1", LaInformacion.delPdf(solicitudCredito("Declaracion Mutuario-1", filas)), containsString("x")),
        seeThat("DECLARACIONES DEL MUTUARIO 2", LaInformacion.delPdf(solicitudCredito("Declaracion Mutuario-2", filas)), containsString("x")),
        seeThat("DECLARACIONES DEL MUTUARIO 3", LaInformacion.delPdf(solicitudCredito("Declaracion Mutuario-3", filas)), containsString("x")),
        seeThat("DECLARACIONES DEL MUTUARIO 4", LaInformacion.delPdf(solicitudCredito("Declaracion Mutuario-4", filas)), containsString("x")),
        seeThat("Secci??n firma: Nombres y Apellidos", LaInformacion.delPdf(solicitudCredito("Nombres Y Apellidos Firma", filas)), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("Secci??n firma: Tipo de Identificaci??n", LaInformacion.delPdf(solicitudCredito("Tipo Documento Firma", filas)), containsString("x")),
        seeThat("Secci??n firma: N. de Identificaci??n", LaInformacion.delPdf(solicitudCredito("Numero Firma", filas)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat("Secci??n firma: Lugar de expedici??n", LaInformacion.delPdf(solicitudCredito("Ciudad Expedicion Firma", filas)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_LUGAR_EXPEDICION.getSql(), "ciudad")))),
        seeThat("Secci??n firma: Fecha de expedici??n", LaInformacion.delPdf(solicitudCredito("Fecha Expedicion Firma", filas)), containsString(fechaPdfDdMmYyyy(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_exp"))))),
        seeThat("Secci??n firma: Ciudad", LaInformacion.delPdf(solicitudCredito("Ciudad Firma", filas)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_CIUDAD_RESIDENCIA.getSql(), "ciudad")))),
        seeThat("Secci??n firma: Direcci??n", LaInformacion.delPdf(solicitudCredito("Direccion Firma", filas)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_residencia")))),
        seeThat("Secci??n firma: Tel??fono", LaInformacion.delPdf(solicitudCredito("Telefono Firma", filas)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "celular"))))
    );
  }

  @Entonces("^el asesor deber?? ver que la informaci??n del Formato Seguro de Vida Sura corresponde a la de BD$")
  public void verificarSegurosVidaSura() {
    theActorInTheSpotlight().should(
        seeThat("N??mero de identificaci??n", LaInformacion.delPdf(seguroVidaSura("Numero de Identificacion Tomador")), containsString("900516574-6")),
        seeThat("Raz??n Social y/o Nombres y Apellidos(Primero Nombres, luego Apellidos)", LaInformacion.delPdf(seguroVidaSura("Razon Social")), containsString("finsocial s.a.s")),
        seeThat("Tipo de instituci??n", LaInformacion.delPdf(seguroVidaSura("Tipo Institucion")), containsString("x")),
        seeThat("Direcci??n Correspondencia", LaInformacion.delPdf(seguroVidaSura("Direccion Correspondencia Tomador")), containsString("cra 51b # 80-58 oficina 803")),
        seeThat("Ciudad/Departamento", LaInformacion.delPdf(seguroVidaSura("Ciudad/Departamento")), containsString("barranquilla")),
        seeThat("Tipo de identificaci??n", LaInformacion.delPdf(seguroVidaSura("Tipo Identificacion Deudor")), containsString("x")),
        seeThat("N??mero de identificaci??n", LaInformacion.delPdf(seguroVidaSura("Numero Identificacion Deudor")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat("Nombres y Apellidos(Primero Nombres, luego Apellidos)", LaInformacion.delPdf(seguroVidaSura("Nombres y Apellidos del deudor")),
            containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("Sexo", LaInformacion.delPdf(seguroVidaSura("Sexo")), containsString("x")),
        seeThat("Fecha de Nacimiento AAAA MM DD", LaInformacion.delPdf(seguroVidaSura("Fecha Nacimiento")), containsString(fechaPdfFormatoLinea(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_nac"))))),
        seeThat("Peso (Kg)", LaInformacion.delPdf(seguroVidaSura("Peso")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_ASEGURABILIDAD.getSql(), "peso")))),
        seeThat("Estatura (en cms)", LaInformacion.delPdf(seguroVidaSura("Estatura")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_ASEGURABILIDAD.getSql(), "estatura")))),
        seeThat("Ciudad", LaInformacion.delPdf(seguroVidaSura("Ciudad")), containsString(theActorInTheSpotlight().asksFor(ciudadDepartamento(0)))),
        seeThat("Departamento", LaInformacion.delPdf(seguroVidaSura("Departamento")), containsString(theActorInTheSpotlight().asksFor(ciudadDepartamento(1)))),
        seeThat("Tel??fono (Sin indicativo) ", LaInformacion.delPdf(seguroVidaSura("Telefono")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "tel_residencia")))),
        seeThat("Celular", LaInformacion.delPdf(seguroVidaSura("Celular")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "celular")))),
        seeThat("Direcci??n Correspondencia", LaInformacion.delPdf(seguroVidaSura("Direccion Correspondencia Deudor")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_residencia")))),
        seeThat("Correo Electr??nico", LaInformacion.delPdf(seguroVidaSura("Correo Electronico")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "email")))),
        seeThat("Valor Cr??dito", LaInformacion.delPdf(seguroVidaSura("Valor Credito")), containsString(valorCapitalSura(Integer.parseInt(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdCreditos(), SQL_LINEA_CREDITO.getSql(), "linea_credito_id")))))),
        seeThat("Valor Asegurado", LaInformacion.delPdf(seguroVidaSura("Valor Asegurado")), containsString(valorCapitalSura(Integer.parseInt(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdCreditos(), SQL_LINEA_CREDITO.getSql(), "linea_credito_id")))))),
        seeThat("Declaraci??n Asegurabilidad 1", LaInformacion.delPdf(seguroVidaSura("Declaracion Asegurabilidad-1")), containsString("x")),
        seeThat("Declaraci??n Asegurabilidad 2", LaInformacion.delPdf(seguroVidaSura("Declaracion Asegurabilidad-2")), containsString("x")),
        seeThat("Fecha de diligenciamiento Formaro (AAAA/MM/DD)", LaInformacion.delPdf(seguroVidaSura("Fecha Diligenciamiento")), containsString(fechaPdfFormatoSlash(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_ANALITICA_FILTRO.getSql(), "fecha_reg"))))));
  }

  @Entonces("^el asesor deber?? ver que la informaci??n del Bolet??n de Costos corresponde a la de BD$")
  public void verificarBoletinDeCostos() {
    theActorInTheSpotlight().should(
        seeThat("Nombre y Apellidos", LaInformacion.delPdf(boletinCostos("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("Tipo de Identificaci??n:", LaInformacion.delPdf(boletinCostos("Tipo Identificacion")), containsString("x")),
        seeThat("N. de Identificaci??n", LaInformacion.delPdf(boletinCostos("N. de Identificacion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat("Lugar de expedici??n", LaInformacion.delPdf(boletinCostos("Lugar de expedicion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_LUGAR_EXPEDICION.getSql(), "ciudad")))),
        seeThat("Fecha de expedici??n", LaInformacion.delPdf(boletinCostos("Fecha de expedicion")), containsString(fechaPdfDdMmYyyy(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_exp"))))),
        seeThat("Ciudad", LaInformacion.delPdf(boletinCostos("Ciudad")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_CIUDAD_RESIDENCIA.getSql(), "ciudad")))),
        seeThat("Direcci??n", LaInformacion.delPdf(boletinCostos("Direccion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_residencia")))),
        seeThat("Tel??fono", LaInformacion.delPdf(boletinCostos("Telefono")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "celular")))));
  }

  @Entonces("^el asesor deber?? ver que la informaci??n de Solicitud de Afiliaci??n Cooperativa corresponde a la de BD$")
  public void verificarSolicitudAfiliaci??nCooperativa() {
    theActorInTheSpotlight().should(
        seeThat("RELACION", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Relacion")), containsString("x")),
        seeThat("DATOS", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Datos")), containsString("x")),
        seeThat("FECHA", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Fecha Solicitud")), containsString(fechaPdfYyyyMmDd(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_ANALITICA_FILTRO.getSql(), "fecha_reg"))))),
        seeThat("TIPO DE IDENTIFICACION", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Tipo Identificacion")), containsString("x")),
        seeThat("NUMERO DE IDENTIFICACION", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Numero Identificacion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat("FECHA DE EXPEDICION", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Fecha Expedicion")), containsString(fechaPdfYyyyMmDd(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_exp"))))),
        seeThat("EXPEDIDO EN", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Expedido en")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_LUGAR_EXPEDICION.getSql(), "ciudad")))),
        seeThat("LUGAR Y FECHA DE NACIMIENTO", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Lugar y fecha de nacimiento")),
            containsString(theActorInTheSpotlight().asksFor(lugarYFechaNacimiento()))),
        seeThat("PRIMER APELLIDO", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Primer Apellido")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "p_apellido")))),
        seeThat("SEGUNDO APELLIDO", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Segundo Apellido")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "s_apellido")))),
        seeThat("NOMBRES", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombres")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "nombre")) + theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "s_nombre")))),
        seeThat("GENERO", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Genero")), containsString("x")),
        seeThat("ESTADO CIVIL", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Estado Civil")), containsString("x")),
        seeThat("HIJOS", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Hijos")), containsString("x")),
        seeThat("No. DE PERSONAS A CARGO", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Personas a Cargo")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "personas_cargo")))),
        seeThat("MADRE CABEZA DE HOGAR", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Madre Cabeza de Hogar")), containsString("x")),
        seeThat("CIUDAD", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Ciudad")), containsString(theActorInTheSpotlight().asksFor(ciudadDepartamento(0)))),
        seeThat("DEPARTAMENTO", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Departamento")), containsString(theActorInTheSpotlight().asksFor(ciudadDepartamento(1)))),
        seeThat("DIRECCION", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Direccion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_residencia")))),
        seeThat("ESTRATO", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Estrato")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "estrato")))),
        seeThat("CELULAR", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Celular")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "celular")))),
        seeThat("TELEFONO", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Telefono")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "tel_residencia")))),
        seeThat("CORREO ELECTRONICO", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Correo Electronico")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "email")))),
        seeThat("NIVEL ESTUDIO", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nivel Estudio")), containsString("x")),
        seeThat("MANEJA RECURSOS PUBLICOS", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Maneja Recursos Publicos")), containsString("x")),
        seeThat("OCUPACION", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Ocupacion")), containsString(ocupacion(Integer.parseInt(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "ocupacion")))))),
        seeThat("EJERCE CARGOS PUBLICOS", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Ejerce cargos publicos")), containsString("x")),
        seeThat("TIENE RECONOCIMIENTO PUBLICO", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Tiene reconocimiento publico")), containsString("x")),
        seeThat("TIENE RELACION CON UNA PERSONA EXPUESTA PUBLICAMENTE", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Tiene relacion con una persona publicamente expuesta"))
            , containsString("x")),
        // seeThat("NOMBRE Y APELLIDO DEL CONYUGUE", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y apellido conyugue")), containsString(theActorInTheSpotlight()
        //   .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "nombre_conyugue")))),
        //seeThat("DOCUMENTO DE IDENTIDAD", LaInformacion.delPdf(solicitudAfiliacionCoperativa("doc_conyugue")), containsString(theActorInTheSpotlight()
        //  .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "txtDocumentoConyugue")))),
        seeThat("INGRESOS MENSUALES", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Ingresos Mensuales")), containsString(formatoMonedaSinPesos(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_ingresos"))))),
        seeThat("EGRESOS MENSUALES", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Egresos Mensuales")), containsString(formatoMonedaSinPesos(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_egresos"))))),
        seeThat("ACTIVOS", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Activos")), containsString(formatoMonedaSinPesos(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_activos"))))),
        seeThat("PASIVOS", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Pasivos")), containsString(formatoMonedaSinPesos(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_pasivos"))))),
        seeThat("OTROS INGRESOS", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Otros Ingresos")), containsString(formatoMonedaSinPesos(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "otros_ingresos"))))),
        seeThat("PEPs", LaInformacion.delPdf(solicitudAfiliacionCoperativa("PEPs")), containsString("x")),
        seeThat("DECLARACION FATCA 1", LaInformacion.delPdf(solicitudAfiliacionCoperativa("FATCA-1")), containsString("x")),
        seeThat("DECLARACION FATCA 2", LaInformacion.delPdf(solicitudAfiliacionCoperativa("FATCA-2")), containsString("x")),
        seeThat("DECLARACION FATCA 3", LaInformacion.delPdf(solicitudAfiliacionCoperativa("FATCA-3")), containsString("x")),
        seeThat("DECLARACION FATCA 4", LaInformacion.delPdf(solicitudAfiliacionCoperativa("FATCA-4")), containsString("x")),
        seeThat("DECLARACION FATCA 5", LaInformacion.delPdf(solicitudAfiliacionCoperativa("FATCA-5")), containsString("x")),
        seeThat("DECLARACION FATCA 6", LaInformacion.delPdf(solicitudAfiliacionCoperativa("FATCA-6")), containsString("x")),
        seeThat("Realiza transacciones en moneda extranjera?", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Declaracion Origen Fondos"))
            , containsString("x")),
        seeThat("Es sujeto de obligaciones tributarias en otro pa??s?", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Declaracion Tributaria Exterior"))
            , containsString("x")),
        seeThat("DECLARO EXPRESAMENTE QUE: a", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Declaro Expresamente-1")), containsString("x")),
        seeThat("DECLARO EXPRESAMENTE QUE: b", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Declaro Expresamente-2")), containsString("x")),
        seeThat("DECLARO EXPRESAMENTE QUE: c", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Declaro Expresamente-3")), containsString("x")),
        seeThat("DECLARO EXPRESAMENTE QUE: d", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Declaro Expresamente-4")), containsString("x")),
        seeThat("DECLARO EXPRESAMENTE QUE: e", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Declaro Expresamente-5")), containsString("x")),
        seeThat("DECLARO EXPRESAMENTE QUE: f", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Declaro Expresamente-6")), containsString("x")),
        seeThat("No IDENTIFICACION:", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Contrato de fianza - No Identificacion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat("nombre", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Contrato de fianza - Nombre Completo")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("cedula de ciudadania No", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Contrato de fianza - Cedula")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat("presente contrato en", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Contrato de fianza - Ciudad")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_CIUDAD_RESIDENCIA.getSql(), "ciudad")))),
        seeThat("fecha", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Contrato de fianza - Fecha")), containsString(fechaPdfDdMmYyyy(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_ANALITICA_FILTRO.getSql(), "fecha_reg"))))),
        seeThat("Nombre y Apellidos", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Deudor - Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("Tipo de Identificaci??n", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Deudor - Tipo de Identificacion")), containsString("x")),
        seeThat("N. de identificaci??n", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Deudor - No Identificacion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat("Lugar de expedici??n", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Deudor - Lugar Expedicion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_LUGAR_EXPEDICION.getSql(), "ciudad")))),
        seeThat("Fecha de expedici??n", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Deudor - Fecha Expedicion")), containsString(fechaPdfDdMmYyyy(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_exp"))))),
        seeThat("Ciudad", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Deudor - Ciudad")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_CIUDAD_RESIDENCIA.getSql(), "ciudad")))),
        seeThat("Direcci??n", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Deudor - Direccion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_residencia")))),
        seeThat("Tel??fono", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Deudor - Telefono")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "celular")))),
        seeThat("NOMBRE", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Firma - Nombre")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto())))
    );
  }

  @Entonces("^el asesor deber?? ver que la informaci??n del Pagar?? Finsocial corresponde a la de BD$")
  public void verificarPagareFinsocial() {
    theActorInTheSpotlight().should(
        seeThat("en la ciudad", LaInformacion.delPdf(pagareFinsocial("Ciudad")), containsString("barranquilla")),
        seeThat("fecha constancia", LaInformacion.delPdf(pagareFinsocial("Fecha Pagare")), containsString(fechaPdfDdMmYyyy(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_ANALITICA_FILTRO.getSql(), "fecha_reg"))))),
        seeThat("Nombre y Apellidos", LaInformacion.delPdf(pagareFinsocial("Nombres y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("Tipo de Identificaci??n:", LaInformacion.delPdf(pagareFinsocial("Tipo de Identificacion")), containsString("x")),
        seeThat("N. de Identificaci??n", LaInformacion.delPdf(pagareFinsocial("Numero de Identificacion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat("Lugar de expedici??n", LaInformacion.delPdf(pagareFinsocial("Lugar Expedicion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_LUGAR_EXPEDICION.getSql(), "ciudad")))),
        seeThat("Fecha de expedici??n", LaInformacion.delPdf(pagareFinsocial("Fecha Expedicion")), containsString(fechaPdfDdMmYyyy(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_exp"))))),
        seeThat("Ciudad", LaInformacion.delPdf(pagareFinsocial("Ciudad Firma")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_CIUDAD_RESIDENCIA.getSql(), "ciudad")))),
        seeThat("Direcci??n", LaInformacion.delPdf(pagareFinsocial("Direccion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_residencia")))),
        seeThat("Tel??fono", LaInformacion.delPdf(pagareFinsocial("Telefono")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "celular")))));
  }

  @Entonces("^el asesor deber?? ver que la informaci??n del Pagar?? Coophumana corresponde a la de BD$")
  public void verificarPagareCoophumana() {
    theActorInTheSpotlight().should(
        seeThat("en la ciudad", LaInformacion.delPdf(pagareCoophumana("Ciudad")), containsString("barranquilla")),
        seeThat("fecha constancia", LaInformacion.delPdf(pagareCoophumana("Fecha Pagare")), containsString(fechaPdfDdMmYyyy(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_ANALITICA_FILTRO.getSql(), "fecha_reg"))))),
        seeThat("Nombre y Apellidos", LaInformacion.delPdf(pagareCoophumana("Nombres y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("Tipo de Identificaci??n:", LaInformacion.delPdf(pagareCoophumana("Tipo de Identificacion")), containsString("x")),
        seeThat("N. de Identificaci??n", LaInformacion.delPdf(pagareCoophumana("Numero de Identificacion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat("Lugar de expedici??n", LaInformacion.delPdf(pagareCoophumana("Lugar Expedicion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_LUGAR_EXPEDICION.getSql(), "ciudad")))),
        seeThat("Fecha de expedici??n", LaInformacion.delPdf(pagareCoophumana("Fecha Expedicion")), containsString(fechaPdfDdMmYyyy(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_exp"))))),
        seeThat("Ciudad", LaInformacion.delPdf(pagareCoophumana("Ciudad Firma")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_CIUDAD_RESIDENCIA.getSql(), "ciudad")))),
        seeThat("Direcci??n", LaInformacion.delPdf(pagareCoophumana("Direccion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_residencia")))),
        seeThat("Tel??fono", LaInformacion.delPdf(pagareCoophumana("Telefono")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "celular")))));
  }

  @Entonces("^el asesor deber?? ver que la informaci??n de Desafiliaci??n corresponde a la de BD$")
  public void verificarDesafiliacionCooperativa() {
    theActorInTheSpotlight().should(seeThat("Nombre", LaInformacion.delPdf(desafiliacion("Nombre")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))));
  }

  @Entonces("^el asesor deber?? ver que la informaci??n del Formulario conocimiento actival corresponde a la de BD$")
  public void verificarFormularioConocimientoActival() {
    theActorInTheSpotlight().should(
        seeThat("RELACION", LaInformacion.delPdf(formularioActival("Relacion")), containsString("x")),
        seeThat("DATOS", LaInformacion.delPdf(formularioActival("Datos")), containsString("x")),
        seeThat("FECHA", LaInformacion.delPdf(formularioActival("Fecha Solicitud")), containsString(fechaPdfYyyyMmDd(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_ANALITICA_FILTRO.getSql(), "fecha_reg"))))),
        seeThat("TIPO DE IDENTIFICACION", LaInformacion.delPdf(formularioActival("Tipo Identificacion")), containsString("x")),
        seeThat("NUMERO DE IDENTIFICACION", LaInformacion.delPdf(formularioActival("Numero Identificacion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat("FECHA DE EXPEDICION", LaInformacion.delPdf(formularioActival("Fecha Expedicion")), containsString(fechaPdfYyyyMmDd(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_exp"))))),
        seeThat("EXPEDIDO EN", LaInformacion.delPdf(formularioActival("Expedido en")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_LUGAR_EXPEDICION.getSql(), "ciudad")))),
        seeThat("LUGAR Y FECHA DE NACIMIENTO", LaInformacion.delPdf(formularioActival("Lugar y fecha de nacimiento")),
            containsString(theActorInTheSpotlight().asksFor(lugarYFechaNacimiento()))),
        seeThat("PRIMER APELLIDO", LaInformacion.delPdf(formularioActival("Primer Apellido")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "p_apellido")))),
        seeThat("SEGUNDO APELLIDO", LaInformacion.delPdf(formularioActival("Segundo Apellido")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "s_apellido")))),
        seeThat("NOMBRES", LaInformacion.delPdf(formularioActival("Nombres")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "nombre")) + theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "s_nombre")))),
        seeThat("GENERO", LaInformacion.delPdf(formularioActival("Genero")), containsString("x")),
        seeThat("ESTADO CIVIL", LaInformacion.delPdf(formularioActival("Estado Civil")), containsString("x")),
        seeThat("HIJOS", LaInformacion.delPdf(formularioActival("Hijos")), containsString("x")),
        seeThat("No. DE PERSONAS A CARGO", LaInformacion.delPdf(formularioActival("Personas a Cargo")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "personas_cargo")))),
        seeThat("MADRE CABEZA DE HOGAR", LaInformacion.delPdf(formularioActival("Madre Cabeza de Hogar")), containsString("x")),
        seeThat("CIUDAD", LaInformacion.delPdf(formularioActival("Ciudad")), containsString(theActorInTheSpotlight().asksFor(ciudadDepartamento(0)))),
        seeThat("DEPARTAMENTO", LaInformacion.delPdf(formularioActival("Departamento")), containsString(theActorInTheSpotlight().asksFor(ciudadDepartamento(1)))),
        seeThat("DIRECCION", LaInformacion.delPdf(formularioActival("Direccion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_residencia")))),
        seeThat("ESTRATO", LaInformacion.delPdf(formularioActival("Estrato")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "estrato")))),
        seeThat("CELULAR", LaInformacion.delPdf(formularioActival("Celular")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "celular")))),
        seeThat("TELEFONO", LaInformacion.delPdf(formularioActival("Telefono")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "tel_residencia")))),
        seeThat("CORREO ELECTRONICO", LaInformacion.delPdf(formularioActival("Correo Electronico")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "email")))),
        seeThat("NIVEL ESTUDIO", LaInformacion.delPdf(formularioActival("Nivel Estudio")), containsString("x")),
        seeThat("MANEJA RECURSOS PUBLICOS", LaInformacion.delPdf(formularioActival("Maneja Recursos Publicos")), containsString("x")),
        seeThat("OCUPACION", LaInformacion.delPdf(formularioActival("Ocupacion")), containsString(ocupacion(Integer.parseInt(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "ocupacion")))))),
        seeThat("EJERCE CARGOS PUBLICOS", LaInformacion.delPdf(formularioActival("Ejerce cargos publicos")), containsString("x")),
        seeThat("TIENE RECONOCIMIENTO PUBLICO", LaInformacion.delPdf(formularioActival("Tiene reconocimiento publico")), containsString("x")),
        seeThat("TIENE RELACION CON UNA PERSONA EXPUESTA PUBLICAMENTE", LaInformacion.delPdf(formularioActival("Tiene relacion con una persona publicamente expuesta"))
            , containsString("x")),
        // seeThat("NOMBRE Y APELLIDO DEL CONYUGUE", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y apellido conyugue")), containsString(theActorInTheSpotlight()
        //   .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "nombre_conyugue")))),
        //seeThat("DOCUMENTO DE IDENTIDAD", LaInformacion.delPdf(solicitudAfiliacionCoperativa("doc_conyugue")), containsString(theActorInTheSpotlight()
        //  .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "txtDocumentoConyugue")))),
        seeThat("INGRESOS MENSUALES", LaInformacion.delPdf(formularioActival("Ingresos Mensuales")), containsString(formatoMonedaSinPesos(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_ingresos"))))),
        seeThat("EGRESOS MENSUALES", LaInformacion.delPdf(formularioActival("Egresos Mensuales")), containsString(formatoMonedaSinPesos(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_egresos"))))),
        seeThat("ACTIVOS", LaInformacion.delPdf(formularioActival("Activos")), containsString(formatoMonedaSinPesos(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_activos"))))),
        seeThat("PASIVOS", LaInformacion.delPdf(formularioActival("Pasivos")), containsString(formatoMonedaSinPesos(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_pasivos"))))),
        seeThat("OTROS INGRESOS", LaInformacion.delPdf(formularioActival("Otros Ingresos")), containsString(formatoMonedaSinPesos(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "otros_ingresos"))))),
        seeThat("PEPs", LaInformacion.delPdf(formularioActival("PEPs")), containsString("x")),
        seeThat("DECLARACION FATCA 1", LaInformacion.delPdf(formularioActival("FATCA-1")), containsString("x")),
        seeThat("DECLARACION FATCA 2", LaInformacion.delPdf(formularioActival("FATCA-2")), containsString("x")),
        seeThat("DECLARACION FATCA 3", LaInformacion.delPdf(formularioActival("FATCA-3")), containsString("x")),
        seeThat("DECLARACION FATCA 4", LaInformacion.delPdf(formularioActival("FATCA-4")), containsString("x")),
        seeThat("DECLARACION FATCA 5", LaInformacion.delPdf(formularioActival("FATCA-5")), containsString("x")),
        seeThat("DECLARACION FATCA 6", LaInformacion.delPdf(formularioActival("FATCA-6")), containsString("x")),
        seeThat("Realiza transacciones en moneda extranjera?", LaInformacion.delPdf(formularioActival("Declaracion Origen Fondos"))
            , containsString("x")),
        seeThat("Es sujeto de obligaciones tributarias en otro pa??s?", LaInformacion.delPdf(formularioActival("Declaracion Tributaria Exterior"))
            , containsString("x")),
        seeThat("DECLARO EXPRESAMENTE QUE: a", LaInformacion.delPdf(formularioActival("Declaro Expresamente-1")), containsString("x")),
        seeThat("DECLARO EXPRESAMENTE QUE: b", LaInformacion.delPdf(formularioActival("Declaro Expresamente-2")), containsString("x")),
        seeThat("DECLARO EXPRESAMENTE QUE: c", LaInformacion.delPdf(formularioActival("Declaro Expresamente-3")), containsString("x")),
        seeThat("DECLARO EXPRESAMENTE QUE: d", LaInformacion.delPdf(formularioActival("Declaro Expresamente-4")), containsString("x")),
        seeThat("DECLARO EXPRESAMENTE QUE: e", LaInformacion.delPdf(formularioActival("Declaro Expresamente-5")), containsString("x")),
        seeThat("DECLARO EXPRESAMENTE QUE: f", LaInformacion.delPdf(formularioActival("Declaro Expresamente-6")), containsString("x")),
        seeThat("No IDENTIFICACION:", LaInformacion.delPdf(formularioActival("Contrato de fianza - No Identificacion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat("nombre", LaInformacion.delPdf(formularioActival("Contrato de fianza - Nombre Completo")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("cedula de ciudadania No", LaInformacion.delPdf(formularioActival("Contrato de fianza - Cedula")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat("presente contrato en", LaInformacion.delPdf(formularioActival("Contrato de fianza - Ciudad")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_CIUDAD_RESIDENCIA.getSql(), "ciudad")))),
        seeThat("fecha", LaInformacion.delPdf(formularioActival("Contrato de fianza - Fecha")), containsString(fechaPdfDdMmYyyy(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_ANALITICA_FILTRO.getSql(), "fecha_reg"))))),
        seeThat("Nombre y Apellidos", LaInformacion.delPdf(formularioActival("Deudor - Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("Tipo de Identificaci??n", LaInformacion.delPdf(formularioActival("Deudor - Tipo de Identificacion")), containsString("x")),
        seeThat("N. de identificaci??n", LaInformacion.delPdf(formularioActival("Deudor - No Identificacion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat("Lugar de expedici??n", LaInformacion.delPdf(formularioActival("Deudor - Lugar Expedicion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_LUGAR_EXPEDICION.getSql(), "ciudad")))),
        seeThat("Fecha de expedici??n", LaInformacion.delPdf(formularioActival("Deudor - Fecha Expedicion")), containsString(fechaPdfDdMmYyyy(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_exp"))))),
        seeThat("Ciudad", LaInformacion.delPdf(formularioActival("Deudor - Ciudad")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_CIUDAD_RESIDENCIA.getSql(), "ciudad")))),
        seeThat("Direcci??n", LaInformacion.delPdf(formularioActival("Deudor - Direccion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_residencia")))),
        seeThat("Tel??fono", LaInformacion.delPdf(formularioActival("Deudor - Telefono")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "celular")))),
        seeThat("NOMBRE", LaInformacion.delPdf(formularioActival("Firma - Nombre")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))));
  }
}

