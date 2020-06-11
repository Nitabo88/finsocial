package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.models.builders.CredencialesBDBuilder.con;
import static co.com.red5g.finsonet.questions.CiudadDepartamento.ciudadDepartamento;
import static co.com.red5g.finsonet.questions.NombreCompleto.nombreCompleto;
import static co.com.red5g.finsonet.questions.SolicitudCreditoPdf.tipoCliente;
import static co.com.red5g.finsonet.questions.TotalIngresos.totalIngresos;
import static co.com.red5g.finsonet.tasks.Obtiene.NUMERO_FILAS;
import static co.com.red5g.utils.conexionbd.Queries.SQL_ANALITICA_FILTRO;
import static co.com.red5g.utils.conexionbd.Queries.SQL_ASEGURABILIDAD;
import static co.com.red5g.utils.conexionbd.Queries.SQL_CIUDAD_RESIDENCIA;
import static co.com.red5g.utils.conexionbd.Queries.SQL_FORMULARIO_SOLICITUD;
import static co.com.red5g.utils.conexionbd.Queries.SQL_LINEA_CREDITO;
import static co.com.red5g.utils.conexionbd.Queries.SQL_LUGAR_EXPEDICION;
import static co.com.red5g.utils.conexionbd.Queries.SQL_LUGAR_NACIMIENTO;
import static co.com.red5g.utils.pdf.EstructurasPDF.boletinCostos;
import static co.com.red5g.utils.pdf.EstructurasPDF.estadoCivil;
import static co.com.red5g.utils.pdf.EstructurasPDF.ocupacion;
import static co.com.red5g.utils.pdf.EstructurasPDF.seguroVidaSura;
import static co.com.red5g.utils.pdf.EstructurasPDF.segurosVidaMundial;
import static co.com.red5g.utils.pdf.EstructurasPDF.solicitudAfiliacionCoperativa;
import static co.com.red5g.utils.pdf.EstructurasPDF.solicitudCredito;
import static co.com.red5g.utils.pdf.EstructurasPDF.valorCapital;
import static co.com.red5g.utils.pdf.EstructurasPDF.valorCapitalSura;
import static co.com.red5g.utils.pdf.UrlsPdfs.urlPdf;
import static co.com.red5g.utils.string.UtileriaFechas.edad;
import static co.com.red5g.utils.string.UtileriaFechas.fechaPdf;
import static co.com.red5g.utils.string.UtileriaFechas.fechaPdfFormatoLinea;
import static co.com.red5g.utils.string.UtileriaFechas.fechaPdfFormatoSlash;
import static co.com.red5g.utils.string.UtileriaFechas.fechaPdfSolicitud;
import static co.com.red5g.utils.string.UtileriasMoneda.formatoMoneda;
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

  @Dado("^que (.*) esta en el pdf de (.*) del crédito (.*)$")
  public void ingresarUrlPdf(String actor, String url, String numeroCredito) {
    String urlPdf = urlPdf(url);
    theActorCalled(actor).wasAbleTo(Ingresa.alPDF(urlPdf, numeroCredito));
  }

  @Cuando("^el asesor obtiene la información del pdf$")
  public void obtenerInformacionPdf() {
    theActorInTheSpotlight().attemptsTo(Obtiene.laInformacionDelPdf());
  }

  @Entonces("^el asesor deberá ver que la información del Formato Seguro de Vida Mundial corresponde a la de BD$")
  public void verificarSegurosVidaMundial() {
    theActorInTheSpotlight().should(
        seeThat("Ciudad", LaInformacion.delPdf(segurosVidaMundial("Ciudad Solicitud")), containsString("barranquilla")),
        seeThat("Fecha de Solicitud", LaInformacion.delPdf(segurosVidaMundial("Fecha Solicitud")), containsString(fechaPdf(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_ANALITICA_FILTRO.getSql(), "fecha_reg"))))),
        seeThat("Nombre o Razón Social", LaInformacion.delPdf(segurosVidaMundial("Nombre o Razon Social")), containsString("finsocial s.a.s")),
        seeThat("Identificacion", LaInformacion.delPdf(segurosVidaMundial("Tipo Identificacion Tomador")), containsString("nit")),
        seeThat("NIT", LaInformacion.delPdf(segurosVidaMundial("Numero Identificacion Tomador")), containsString("900516574-6")),
        seeThat("Crédito No.", LaInformacion.delPdf(segurosVidaMundial("Credito No")), containsString(" ")),
        seeThat("Valor Capital", LaInformacion.delPdf(segurosVidaMundial("Valor Capital")), containsString(valorCapital(Integer.parseInt(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdCreditos(), SQL_LINEA_CREDITO.getSql(), "linea_credito_id")))))),
        seeThat("Tipo de Documento", LaInformacion.delPdf(segurosVidaMundial("Tipo Identificacion Asegurado")), containsString("x")),
        seeThat("Número Documento", LaInformacion.delPdf(segurosVidaMundial("Numero Identificacion Asegurado")), containsString(theActorInTheSpotlight()
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
        seeThat("Fecha de Nacimiento", LaInformacion.delPdf(segurosVidaMundial("Fecha Nacimiento")), containsString(fechaPdf(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_nac"))))),
        seeThat("Edad", LaInformacion.delPdf(segurosVidaMundial("Edad")), containsString(edad(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_nac"))))),
        seeThat("Ocupación Actual", LaInformacion.delPdf(segurosVidaMundial("Ocupacion Actual")), containsString(ocupacion(Integer.parseInt(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "profesion")))))),
        seeThat("Estado Civil", LaInformacion.delPdf(segurosVidaMundial("Estado Civil")), containsString(estadoCivil(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "estado_civil"))))),
        seeThat("Dirección Residencia", LaInformacion.delPdf(segurosVidaMundial("Direccion Residencia")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_residencia")))),
        seeThat("E-mail", LaInformacion.delPdf(segurosVidaMundial("E-mail")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "email")))),
        seeThat("Teléfono", LaInformacion.delPdf(segurosVidaMundial("Telefono")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "tel_residencia")))),
        seeThat("Ciudad", LaInformacion.delPdf(segurosVidaMundial("Ciudad Residencia")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_CIUDAD_RESIDENCIA.getSql(), "ciudad"))))
    );
  }

  @Entonces("^el asesor deberá ver que la información de Solicitud de Crédito corresponde a la de BD$")
  public void verificarSolicitudCredito() {
    int pdf = theActorInTheSpotlight().asksFor(tipoCliente());
    int filas = theActorInTheSpotlight().recall(NUMERO_FILAS);
    if (pdf != 0) {
      theActorInTheSpotlight().should(
          seeThat("Nombre de la empresa donde trabaja: ", LaInformacion.delPdf(solicitudCredito("Nombre Empresa", pdf)), containsString(theActorInTheSpotlight()
              .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "empresa")))),
          seeThat("Cargo: ", LaInformacion.delPdf(solicitudCredito("Cargo", pdf)), containsString(ocupacion(Integer.parseInt(theActorInTheSpotlight()
              .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "ocupacion")))))),
          seeThat("Dirección Lugar de Trabajo", LaInformacion.delPdf(solicitudCredito("Direccion Trabajo", pdf)), containsString(theActorInTheSpotlight()
              .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_empresa")))),
          seeThat("Teléfono de Trabajo", LaInformacion.delPdf(solicitudCredito("Telefono Trabajo", pdf)), containsString(theActorInTheSpotlight()
              .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "telefono_empresa"))))
      );
    }
    theActorInTheSpotlight().should(
        seeThat("FECHA:  ", LaInformacion.delPdf(solicitudCredito("Fecha Solicitud", pdf)), containsString(fechaPdfSolicitud(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_ANALITICA_FILTRO.getSql(), "fecha_reg"))))),
        seeThat("Tipo de solicitud: ", LaInformacion.delPdf(solicitudCredito("Tipo Solicitud", pdf)), containsString("x")),
        seeThat("Valor: ", LaInformacion.delPdf(solicitudCredito("Valor", pdf)), containsString("$ 9.000.000")),
        seeThat("Línea: ", LaInformacion.delPdf(solicitudCredito("Linea", pdf)), containsString("finsoamigo")),
        seeThat("Número de Cuotas: ", LaInformacion.delPdf(solicitudCredito("Numero Cuotas", pdf)), containsString("60")),
        seeThat("Valor Cuota: ", LaInformacion.delPdf(solicitudCredito("Valor Cuota", pdf)), containsString("$ 384.888")),
        seeThat("Primer Nombre: ", LaInformacion.delPdf(solicitudCredito("Primer Nombre", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "nombre")))),
        seeThat("Segundo Nombre: ", LaInformacion.delPdf(solicitudCredito("Segundo Nombre", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "s_nombre")))),
        seeThat("Primer Apellido: ", LaInformacion.delPdf(solicitudCredito("Primer Apellido", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "p_apellido")))),
        seeThat("Segundo Apellido: ", LaInformacion.delPdf(solicitudCredito("Segundo Apellido", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "s_apellido")))),
        seeThat("Tipo Identificación: ", LaInformacion.delPdf(solicitudCredito("Tipo Identificacion", pdf)), containsString("x")),
        seeThat("Numero: ", LaInformacion.delPdf(solicitudCredito("Numero Identificacion", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat("Fecha de Expedición", LaInformacion.delPdf(solicitudCredito("Fecha Expedicion", pdf)), containsString(fechaPdf(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_exp"))))),
        seeThat("Lugar de Expedición: ", LaInformacion.delPdf(solicitudCredito("Lugar Expedicion", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_LUGAR_EXPEDICION.getSql(), "ciudad")))),
        seeThat("Fecha de Nacimiento: ", LaInformacion.delPdf(solicitudCredito("Fecha de Nacimiento", pdf)), containsString(fechaPdf(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_nac"))))),
        seeThat("Sexo: ", LaInformacion.delPdf(solicitudCredito("Sexo", pdf)), containsString("x")),
        seeThat("Lugar de Nacimiento:", LaInformacion.delPdf(solicitudCredito("Lugar Nacimiento", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_LUGAR_NACIMIENTO.getSql(), "ciudad")))),
        seeThat("Estado civil: ", LaInformacion.delPdf(solicitudCredito("Estado Civil", pdf)), containsString("x")),
        seeThat("País de Residencia:", LaInformacion.delPdf(solicitudCredito("Pais Residencia", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "pais_residencia")))),
        seeThat("Ciudad y Departamento: ", LaInformacion.delPdf(solicitudCredito("Ciudad y Departamento", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_CIUDAD_RESIDENCIA.getSql(), "ciudad")))),
        seeThat("Dir.Residencia suministrada por el cliente: ", LaInformacion.delPdf(solicitudCredito("Direccion Residencia", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_residencia")))),
        seeThat("Tel. Residencia: ", LaInformacion.delPdf(solicitudCredito("Telefono Residencia", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "tel_residencia")))),
        seeThat("Teléfono Celular: ", LaInformacion.delPdf(solicitudCredito("Telefono Celular", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "celular")))),
        seeThat("Lugar envío correspondencia: ", LaInformacion.delPdf(solicitudCredito("Lugar Envio Correspondencia", pdf)), containsString("x")),
        seeThat("Correo Electrónico: ", LaInformacion.delPdf(solicitudCredito("Correo Electronico", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "email")))),
        seeThat("Ocupación: ", LaInformacion.delPdf(solicitudCredito("Ocupacion", pdf)), containsString("x")),
        seeThat("Preguntas Actividad Laboral: ", LaInformacion.delPdf(solicitudCredito("Preguntas Actividad Laboral", pdf)), containsString("x xx")),
        seeThat("Actividad Económica Principal", LaInformacion.delPdf(solicitudCredito("Actividad Economica", pdf)), containsString(ocupacion(Integer.parseInt(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "ocupacion")))))),
        seeThat("Activos Corrientes (Ahorros e Inversiones)", LaInformacion.delPdf(solicitudCredito("Activos Corrientes", pdf)), containsString(formatoMoneda(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_activos"))))),
        seeThat("Activos Fijos (Vehículo o Propiedades)", LaInformacion.delPdf(solicitudCredito("Activos Fijos", pdf)), containsString("$0")),
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
        seeThat("Deducciones de Nómina", LaInformacion.delPdf(solicitudCredito("Deducciones Nomina", pdf)), containsString("$0")),
        seeThat("Tarjetas de Crédito", LaInformacion.delPdf(solicitudCredito("Tarjeta Credito", pdf)), containsString("$0")),
        seeThat("Otros Gastos", LaInformacion.delPdf(solicitudCredito("Otros Gastos", pdf)), containsString(formatoMoneda(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_egresos"))))),
        seeThat("Total Egresos", LaInformacion.delPdf(solicitudCredito("Total Egresos", pdf)), containsString(formatoMoneda(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_egresos"))))),
        seeThat("DATOS DE OPERACIONES INTERNACIONALES", LaInformacion.delPdf(solicitudCredito("Datos Operaciones Internacionales", pdf)), containsString("x x")),
        seeThat("DECLARACION FATCA/CRS", LaInformacion.delPdf(solicitudCredito("FATCA", pdf)), containsString("x")),
        seeThat("MUTUARIO", LaInformacion.delPdf(solicitudCredito("Mutuario", filas)), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("cédula de ciudadanía No", LaInformacion.delPdf(solicitudCredito("Numero Documento Mutuario", filas)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat("DECLARACION ORIGEN DE FONDOS", LaInformacion.delPdf(solicitudCredito("Origen Fondos", filas)), containsString("x")),
        seeThat("DECLARACION DE ASEGURABILIDAD 1", LaInformacion.delPdf(solicitudCredito("Asegurabilidad-1", filas)), containsString("x")),
        seeThat("DECLARACION DE ASEGURABILIDAD 2", LaInformacion.delPdf(solicitudCredito("Asegurabilidad-2", filas)), containsString("x")),
        seeThat("DECLARACION DE ASEGURABILIDAD 3", LaInformacion.delPdf(solicitudCredito("Asegurabilidad-3", filas)), containsString("x")),
        seeThat("DECLARACION DE ASEGURABILIDAD 4", LaInformacion.delPdf(solicitudCredito("Asegurabilidad-4", filas)), containsString("x")),
        seeThat("DECLARACION DE ASEGURABILIDAD 5", LaInformacion.delPdf(solicitudCredito("Asegurabilidad-5", filas)), containsString("x")),
        seeThat("¿He sufrido o sufro de alguna enfermedad?", LaInformacion.delPdf(solicitudCredito("Enfermedad", filas)), containsString("x")),
        seeThat("DECLARACIONES DEL MUTUARIO 1", LaInformacion.delPdf(solicitudCredito("Declaracion Mutuario-1", filas)), containsString("x")),
        seeThat("DECLARACIONES DEL MUTUARIO 2", LaInformacion.delPdf(solicitudCredito("Declaracion Mutuario-2", filas)), containsString("x")),
        seeThat("DECLARACIONES DEL MUTUARIO 3", LaInformacion.delPdf(solicitudCredito("Declaracion Mutuario-3", filas)), containsString("x")),
        seeThat("DECLARACIONES DEL MUTUARIO 4", LaInformacion.delPdf(solicitudCredito("Declaracion Mutuario-4", filas)), containsString("x")),
        seeThat("Sección firma: Nombres y Apellidos", LaInformacion.delPdf(solicitudCredito("Nombres Y Apellidos Firma", filas)), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("Sección firma: Tipo de Identificación", LaInformacion.delPdf(solicitudCredito("Tipo Documento Firma", filas)), containsString("x")),
        seeThat("Sección firma: N. de Identificación", LaInformacion.delPdf(solicitudCredito("Numero Firma", filas)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat("Sección firma: Lugar de expedición", LaInformacion.delPdf(solicitudCredito("Ciudad Expedicion Firma", filas)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_LUGAR_EXPEDICION.getSql(), "ciudad")))),
        seeThat("Sección firma: Fecha de expedición", LaInformacion.delPdf(solicitudCredito("Fecha Expedicion Firma", filas)), containsString(fechaPdf(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_exp"))))),
        seeThat("Sección firma: Ciudad", LaInformacion.delPdf(solicitudCredito("Ciudad Firma", filas)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_CIUDAD_RESIDENCIA.getSql(), "ciudad")))),
        seeThat("Sección firma: Dirección", LaInformacion.delPdf(solicitudCredito("Direccion Firma", filas)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_residencia")))),
        seeThat("Sección firma: Teléfono", LaInformacion.delPdf(solicitudCredito("Telefono Firma", filas)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "celular"))))
    );
  }

  @Entonces("^el asesor deberá ver que la información del Formato Seguro de Vida Sura corresponde a la de BD$")
  public void verificarSegurosVidaSura() {
    theActorInTheSpotlight().should(
        seeThat("Número de identificación", LaInformacion.delPdf(seguroVidaSura("Numero de Identificacion Tomador")), containsString("900516574-6")),
        seeThat("Razón Social y/o Nombres y Apellidos(Primero Nombres, luego Apellidos)", LaInformacion.delPdf(seguroVidaSura("Razon Social")), containsString("finsocial s.a.s")),
        seeThat("Tipo de institución", LaInformacion.delPdf(seguroVidaSura("Tipo Institucion")), containsString("x")),
        seeThat("Dirección Correspondencia", LaInformacion.delPdf(seguroVidaSura("Direccion Correspondencia Tomador")), containsString("cra 51b # 80-58 oficina 803")),
        seeThat("Ciudad/Departamento", LaInformacion.delPdf(seguroVidaSura("Ciudad/Departamento")), containsString("barranquilla")),
        seeThat("Tipo de identificación", LaInformacion.delPdf(seguroVidaSura("Tipo Identificacion Deudor")), containsString("x")),
        seeThat("Número de identificación", LaInformacion.delPdf(seguroVidaSura("Numero Identificacion Deudor")), containsString(theActorInTheSpotlight()
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
        seeThat("Teléfono (Sin indicativo) ", LaInformacion.delPdf(seguroVidaSura("Telefono")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "tel_residencia")))),
        seeThat("Celular", LaInformacion.delPdf(seguroVidaSura("Celular")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "celular")))),
        seeThat("Dirección Correspondencia", LaInformacion.delPdf(seguroVidaSura("Direccion Correspondencia Deudor")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_residencia")))),
        seeThat("Correo Electrónico", LaInformacion.delPdf(seguroVidaSura("Correo Electronico")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "email")))),
        seeThat("Valor Crédito", LaInformacion.delPdf(seguroVidaSura("Valor Credito")), containsString(valorCapitalSura(Integer.parseInt(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdCreditos(), SQL_LINEA_CREDITO.getSql(), "linea_credito_id")))))),
        seeThat("Valor Asegurado", LaInformacion.delPdf(seguroVidaSura("Valor Asegurado")), containsString(valorCapitalSura(Integer.parseInt(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdCreditos(), SQL_LINEA_CREDITO.getSql(), "linea_credito_id")))))),
        seeThat("Declaración Asegurabilidad 1", LaInformacion.delPdf(seguroVidaSura("Declaracion Asegurabilidad-1")), containsString("x")),
        seeThat("Declaración Asegurabilidad 2", LaInformacion.delPdf(seguroVidaSura("Declaracion Asegurabilidad-2")), containsString("x")),
        seeThat("Fecha de diligenciamiento Formaro (AAAA/MM/DD)", LaInformacion.delPdf(seguroVidaSura("Fecha Diligenciamiento")), containsString(fechaPdfFormatoSlash(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_ANALITICA_FILTRO.getSql(), "fecha_reg"))))));
  }

  @Entonces("^el asesor deberá ver que la información del Boletín de Costos corresponde a la de BD$")
  public void verificarBoletindeCostos() {
    theActorInTheSpotlight().should(
        seeThat("Nombre y Apellidos", LaInformacion.delPdf(boletinCostos("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("Tipo de Identificación:", LaInformacion.delPdf(boletinCostos("Tipo Identificacion")), containsString("x")),
        seeThat("N. de Identificación", LaInformacion.delPdf(boletinCostos("N. de Identificacion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat("Lugar de expedición", LaInformacion.delPdf(boletinCostos("Lugar de expedicion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_LUGAR_EXPEDICION.getSql(), "ciudad")))),
        seeThat("Fecha de expedición", LaInformacion.delPdf(boletinCostos("Fecha de expedicion")), containsString(fechaPdf(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_exp"))))),
        seeThat("Ciudad", LaInformacion.delPdf(boletinCostos("Ciudad")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_CIUDAD_RESIDENCIA.getSql(), "ciudad")))),
        seeThat("Dirección", LaInformacion.delPdf(boletinCostos("Direccion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_residencia")))),
        seeThat("Teléfono", LaInformacion.delPdf(boletinCostos("Telefono")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "celular")))));
  }

  @Entonces("^el asesor deberá ver que la información de Solicitud de Afiliación Cooperativa corresponde a la de BD$")
  public void verificarSolicitudAfiliaciónCooperativa() {
    theActorInTheSpotlight().should(
        seeThat("RELACION", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("DATOS", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("AÑO", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("MES", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("DIA", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("TIPO DE IDENTIFICACION", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("NUMERO DE IDENTIFICACION", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("FECHA DE EXPEDICION", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("EXPEDIDO EN", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("LUGAR Y FECHA DE NACIMIENTO", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("PRIMER APELLIDO", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("SEGUNDO APELLIDO", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("NOMBRES", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("GENERO", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("ESTADO CIVIL", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("HIJOS", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("No. DE PERSONAS A CARGO", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("MADRE CABEZA DE HOGAR", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("CIUDAD", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("DEPARTAMENTO", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("DIRECCION", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("ESTRATO", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("CELULAR", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("TELEFONO", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("CORREO ELECTRONICO", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("NIVEL ESTUDIO", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("MANEJA RECURSOS PUBLICOS", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("OCUPACION", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("EJERCE CARGOS PUBLICOS", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("TIENE RECONOCIMIENTO PUBLICO", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("TIENE RELACION CON UNA PERSONA EXPUESTA PUBLICAMENTE", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos"))
            , containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("NOMBRE Y APELLIDO DEL CONYUGUE", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("DOCUMENTO DE IDENTIDAD", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("INGRESOS MENSUALES", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("EGRESOS MENSUALES", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("ACTIVOS", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("PASIVOS", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("OTROS INGRESOS", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("PEPs", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("DECLARACION FATCA 1", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("DECLARACION FATCA 2", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("DECLARACION FATCA 3", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("DECLARACION FATCA 4", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("DECLARACION FATCA 5", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("DECLARACION FATCA 6", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("Realiza transacciones en moneda extranjera?", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos"))
            , containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("Es sujeto de obligaciones tributarias en otro país?", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos"))
            , containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("DECLARO EXPRESAMENTE QUE: a", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("DECLARO EXPRESAMENTE QUE: b", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("DECLARO EXPRESAMENTE QUE: c", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("DECLARO EXPRESAMENTE QUE: d", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("DECLARO EXPRESAMENTE QUE: e", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("DECLARO EXPRESAMENTE QUE: f", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("No IDENTIFICACION:", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("nombre", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("cedula de ciudadania No", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("presente contrato en", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("a los", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("días del mes de", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("del año", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("Nombre y Apellidos", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("Tipo de Identificación", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("N. de identificación", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("Lugar de expedición", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("Fecha de expedición", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("Ciudad", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("Dirección", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("Teléfono", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat("NOMBRE", LaInformacion.delPdf(solicitudAfiliacionCoperativa("Nombre y Apellidos")), containsString(theActorInTheSpotlight().asksFor(nombreCompleto())))
    );
  }
}
