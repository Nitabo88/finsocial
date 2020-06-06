package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.models.builders.CredencialesBDBuilder.con;
import static co.com.red5g.finsonet.questions.NombreCompleto.nombreCompleto;
import static co.com.red5g.finsonet.questions.SolicitudCreditoPdf.tipoCliente;
import static co.com.red5g.finsonet.questions.TotalIngresos.totalIngresos;
import static co.com.red5g.finsonet.tasks.Obtiene.NUMERO_FILAS;
import static co.com.red5g.utils.string.UtileriaFechas.edad;
import static co.com.red5g.utils.string.UtileriaFechas.fechaPdf;
import static co.com.red5g.utils.string.UtileriaFechas.fechaPdfSolicitud;
import static co.com.red5g.utils.string.UtileriasMoneda.formatoMoneda;
import static co.com.red5g.utils.conexionbd.Queries.SQL_ANALITICA_FILTRO;
import static co.com.red5g.utils.conexionbd.Queries.SQL_ASEGURABILIDAD;
import static co.com.red5g.utils.conexionbd.Queries.SQL_CIUDAD_RESIDENCIA;
import static co.com.red5g.utils.conexionbd.Queries.SQL_FORMULARIO_SOLICITUD;
import static co.com.red5g.utils.conexionbd.Queries.SQL_LINEA_CREDITO;
import static co.com.red5g.utils.conexionbd.Queries.SQL_LUGAR_EXPEDICION;
import static co.com.red5g.utils.conexionbd.Queries.SQL_LUGAR_NACIMIENTO;
import static co.com.red5g.utils.pdf.EstructurasPDF.estadoCivil;
import static co.com.red5g.utils.pdf.EstructurasPDF.ocupacion;
import static co.com.red5g.utils.pdf.EstructurasPDF.segurosVidaMundial;
import static co.com.red5g.utils.pdf.EstructurasPDF.solicitudCredito;
import static co.com.red5g.utils.pdf.EstructurasPDF.valorCapital;
import static co.com.red5g.utils.pdf.UrlsPdfs.urlPdf;
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
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Ciudad Solicitud")), containsString("barranquilla")),
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Fecha Solicitud")), containsString(fechaPdf(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_ANALITICA_FILTRO.getSql(), "fecha_reg"))))),
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Nombre o Razon Social")), containsString("finsocial s.a.s")),
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Tipo Identificacion Tomador")), containsString("nit")),
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Numero Identificacion Tomador")), containsString("900516574-6")),
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Credito No")), containsString(" ")),
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Valor Capital")), containsString(valorCapital(Integer.parseInt(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdCreditos(), SQL_LINEA_CREDITO.getSql(), "linea_credito_id")))))),
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Tipo Identificacion Asegurado")), containsString("x")),
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Numero Identificacion Asegurado")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Primer Apellido")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "p_apellido")))),
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Nombres")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "nombre")))),
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Nombres")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "s_nombre")))),
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Peso")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_ASEGURABILIDAD.getSql(), "peso")))),
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Estatura")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_ASEGURABILIDAD.getSql(), "estatura")))),
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Fecha Nacimiento")), containsString(fechaPdf(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_nac"))))),
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Edad")), containsString(edad(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_nac"))))),
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Ocupacion Actual")), containsString(ocupacion(Integer.parseInt(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "profesion")))))),
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Estado Civil")), containsString(estadoCivil(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "estado_civil"))))),
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Direccion Residencia")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_residencia")))),
        seeThat(LaInformacion.delPdf(segurosVidaMundial("E-mail")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "email")))),
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Telefono")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "tel_residencia")))),
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Ciudad Residencia")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_CIUDAD_RESIDENCIA.getSql(), "ciudad"))))
    );
  }

  @Entonces("^el asesor deberá ver que la información de Solicitud de Crédito corresponde a la de BD$")
  public void verificarSolicitudCredito() {
    int pdf = theActorInTheSpotlight().asksFor(tipoCliente());
    int filas = theActorInTheSpotlight().recall(NUMERO_FILAS);
    if (pdf != 0) {
      theActorInTheSpotlight().should(
          seeThat(LaInformacion.delPdf(solicitudCredito("Nombre Empresa", pdf)), containsString(theActorInTheSpotlight()
              .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "empresa")))),
          seeThat(LaInformacion.delPdf(solicitudCredito("Cargo", pdf)), containsString(ocupacion(Integer.parseInt(theActorInTheSpotlight()
              .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "ocupacion")))))),
          seeThat(LaInformacion.delPdf(solicitudCredito("Direccion Trabajo", pdf)), containsString(theActorInTheSpotlight()
              .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_empresa")))),
          seeThat(LaInformacion.delPdf(solicitudCredito("Telefono Trabajo", pdf)), containsString(theActorInTheSpotlight()
              .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "telefono_empresa"))))
      );
    }
    theActorInTheSpotlight().should(
        seeThat(LaInformacion.delPdf(solicitudCredito("Fecha Solicitud", pdf)), containsString(fechaPdfSolicitud(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_ANALITICA_FILTRO.getSql(), "fecha_reg"))))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Tipo Solicitud", pdf)), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Valor", pdf)), containsString("$ 9.000.000")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Linea", pdf)), containsString("finsoamigo")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Numero Cuotas", pdf)), containsString("60")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Valor Cuota", pdf)), containsString("$ 384.888")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Primer Nombre", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "nombre")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Segundo Nombre", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "s_nombre")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Primer Apellido", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "p_apellido")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Segundo Apellido", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "s_apellido")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Tipo Identificacion", pdf)), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Numero Identificacion", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Fecha Expedicion", pdf)), containsString(fechaPdf(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_exp"))))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Lugar Expedicion", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_LUGAR_EXPEDICION.getSql(), "ciudad")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Fecha de Nacimiento", pdf)), containsString(fechaPdf(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_nac"))))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Sexo", pdf)), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Lugar Nacimiento", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_LUGAR_NACIMIENTO.getSql(), "ciudad")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Estado Civil", pdf)), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Pais Residencia", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "pais_residencia")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Ciudad y Departamento", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_CIUDAD_RESIDENCIA.getSql(), "ciudad")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Direccion Residencia", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_residencia")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Telefono Residencia", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "tel_residencia")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Telefono Celular", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "celular")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Lugar Envio Correspondencia", pdf)), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Correo Electronico", pdf)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "email")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Ocupacion", pdf)), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Preguntas Actividad Laboral", pdf)), containsString("x xx")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Actividad Economica", pdf)), containsString(ocupacion(Integer.parseInt(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "ocupacion")))))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Activos Corrientes", pdf)), containsString(formatoMoneda(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_activos"))))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Activos Fijos", pdf)), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Otros Activos", pdf)), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Total Activos", pdf)), containsString(formatoMoneda(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_activos"))))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Pasivos Financieros", pdf)), containsString(formatoMoneda(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_pasivos"))))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Pasivos Corrientes", pdf)), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Otros Pasivos", pdf)), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Total Pasivos", pdf)), containsString(formatoMoneda(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_pasivos"))))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Salario Fijo", pdf)), containsString(formatoMoneda(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_ingresos"))))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Salario Variable y Comisiones", pdf)), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Arrendamiento", pdf)), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Rendimiento Financieros", pdf)), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Honorarios", pdf)), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Otros Ingresos", pdf)), containsString(formatoMoneda(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "otros_ingresos"))))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Total Ingresos", pdf)), containsString(formatoMoneda(theActorInTheSpotlight().asksFor(totalIngresos())))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Arriendos", pdf)), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Gastos Pesonales,Familiares", pdf)), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Prestamos diferentes a finsocial", pdf)), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Deducciones Nomina", pdf)), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Tarjeta Credito", pdf)), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Otros Gastos", pdf)), containsString(formatoMoneda(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_egresos"))))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Total Egresos", pdf)), containsString(formatoMoneda(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_egresos"))))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Datos Operaciones Internacionales", pdf)), containsString("x x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("FATCA", pdf)), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Declaracion Mutuario-1", filas)), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Declaracion Mutuario-2", filas)), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Declaracion Mutuario-3", filas)), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Declaracion Mutuario-4", filas)), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Nombres Y Apellidos Firma", filas)), containsString(theActorInTheSpotlight().asksFor(nombreCompleto()))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Tipo Documento Firma", filas)), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Numero Firma", filas)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Ciudad Expedicion Firma", filas)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_LUGAR_EXPEDICION.getSql(), "ciudad")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Fecha Expedicion Firma", filas)), containsString(fechaPdf(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_exp"))))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Ciudad Firma", filas)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_CIUDAD_RESIDENCIA.getSql(), "ciudad")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Direccion Firma", filas)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_residencia")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Telefono Firma", filas)), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "celular"))))
    );
  }
}
