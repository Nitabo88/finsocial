package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.models.builders.CredencialesBDBuilder.con;
import static co.com.red5g.utils.String.UtileriaFechas.edad;
import static co.com.red5g.utils.String.UtileriaFechas.fechaPdf;
import static co.com.red5g.utils.String.UtileriaFechas.fechaPdfSolicitud;
import static co.com.red5g.utils.String.UtileriasMoneda.formatoMoneda;
import static co.com.red5g.utils.conexionbd.Queries.SQL_ANALITICA_FILTRO;
import static co.com.red5g.utils.conexionbd.Queries.SQL_ASEGURABILIDAD;
import static co.com.red5g.utils.conexionbd.Queries.SQL_CIUDAD;
import static co.com.red5g.utils.conexionbd.Queries.SQL_FORMULARIO_SOLICITUD;
import static co.com.red5g.utils.conexionbd.Queries.SQL_LINEA_CREDITO;
import static co.com.red5g.utils.pdf.EstructurasPDF.estadoCivil;
import static co.com.red5g.utils.pdf.EstructurasPDF.ocupacion;
import static co.com.red5g.utils.pdf.EstructurasPDF.segurosVidaMundial;
import static co.com.red5g.utils.pdf.EstructurasPDF.solicitudCredito;
import static co.com.red5g.utils.pdf.EstructurasPDF.valorCapital;
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

  @Dado("^que (.*) esta en el paso de tesorería finsoamigos en un crédito$")
  public void ingresarCreditoFinsoamigo(String actor) {
    theActorCalled(actor).wasAbleTo(Ingresa.aUnCreditoEnTesoreriaFinsoamigo());
  }

  @Cuando("^el asesor obtiene la información del pdf de (.*)$")
  public void obtenerInformacionPdfSeguroVidaMundial(String pdf) {
    theActorInTheSpotlight().attemptsTo(Obtiene.laInformacionDelPdf(pdf));
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
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_CIUDAD.getSql(), "ciudad"))))
    );
  }

  @Entonces("^el asesor deberá ver que la información de Solicitud de Crédito corresponde a la de BD$")
  public void verificarSolicitudCredito() {
    theActorInTheSpotlight().should(
        seeThat(LaInformacion.delPdf(solicitudCredito("Fecha Solicitud")), containsString(fechaPdfSolicitud(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_ANALITICA_FILTRO.getSql(), "fecha_reg"))))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Tipo Solicitud")), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Valor")), containsString("$ 9.000.000")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Linea")), containsString("finsoamigo")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Numero Cuotas")), containsString("60")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Valor Cuota")), containsString("$ 384.888")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Primer Nombre")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "nombre")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Segundo Nombre")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "s_nombre")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Primer Apellido")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "p_apellido")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Segundo Apellido")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "s_apellido")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Tipo Identificacion")), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Numero Identificacion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Fecha Expedicion")), containsString(fechaPdf(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_exp"))))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Lugar Expedicion")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_CIUDAD.getSql(), "ciudad")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Fecha de Nacimiento")), containsString(fechaPdf(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_nac"))))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Sexo")), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Lugar Nacimiento")), containsString("finsoamigo")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Estado Civil")), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Pais Residencia")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "pais_residencia")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Ciudad y Departamento")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_CIUDAD.getSql(), "ciudad")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Direccion Residencia")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_residencia")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Telefono Residencia")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "tel_residencia")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Telefono Celular")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "celular")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Lugar Envio Correspondencia")), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Correo Electronico")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "email")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Ocupacion")), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Preguntas Actividad Laboral")), containsString("x xx")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Actividad Economica")), containsString(ocupacion(Integer.parseInt(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "ocupacion")))))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Nombre Empresa")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "empresa")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Cargo")), containsString(ocupacion(Integer.parseInt(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "ocupacion")))))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Direccion Trabajo")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_empresa")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Ciudad Trabajo")), containsString("finsoamigo")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Telefono Trabajo")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "telefono_empresa")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Activos Corrientes")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_activos")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Activos Fijos")), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Otros Activos")), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Total Activos")), containsString(formatoMoneda(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_activos"))))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Pasivos Financieros")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_pasivos")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Pasivos Corrientes")), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Otros Pasivos")), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Total Pasivos")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_pasivos")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Salario Fijo")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_ingresos")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Salario Variable y Comisiones")), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Arrendamiento")), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Rendimiento Financieros")), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Honorarios")), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Otros Ingresos")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "otros_ingresos")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Total Ingresos")), containsString("finsoamigo")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Arriendos")), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Gastos Pesonales,Familiares")), containsString("finsoamigo")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Prestamos diferentes a finsocial")), containsString("finsoamigo")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Deducciones Nomina")), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Tarjeta Credito")), containsString("$0")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Otros Gastos")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_egresos")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Total Egresos")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_egresos")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Datos Operaciones Internacionales")), containsString("x x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("FATCA")), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Cuenta Exterior")), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Mutuario")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_egresos")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Numero Mutuante")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_egresos")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Origen Fondos")), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Asegurabilidad-1")), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Asegurabilidad-2")), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Asegurabilidad-3")), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Asegurabilidad-4")), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Asegurabilidad-5")), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Enfermedad")), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Declaracion Mutuario-1")), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Declaracion Mutuario-2")), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Declaracion Mutuario-3")), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Declaracion Mutuario-4")), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Nombres-Firma")), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Tipo Identificacion-Firma")), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Numero-Firma")), containsString(theActorInTheSpotlight()
                .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "no_doc")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Lugar Expedicion-Firma")), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Fecha Expedicion-Firma")), containsString(fechaPdf(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_exp"))))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Ciudad-Firma")), containsString("x")),
        seeThat(LaInformacion.delPdf(solicitudCredito("Direccion-Firma")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "dir_residencia")))),
        seeThat(LaInformacion.delPdf(solicitudCredito("Telefono-Firma")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "celular")))));
  }
}
