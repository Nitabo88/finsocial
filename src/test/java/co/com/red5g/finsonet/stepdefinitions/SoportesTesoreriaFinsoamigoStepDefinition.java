package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.models.builders.CredencialesBDBuilder.con;
import static co.com.red5g.utils.UtileriaFechas.edad;
import static co.com.red5g.utils.UtileriaFechas.fechaPdf;
import static co.com.red5g.utils.conexionbd.Queries.SQL_ANALITICA_FILTRO;
import static co.com.red5g.utils.conexionbd.Queries.SQL_ASEGURABILIDAD;
import static co.com.red5g.utils.conexionbd.Queries.SQL_CIUDAD;
import static co.com.red5g.utils.conexionbd.Queries.SQL_FORMULARIO_SOLICITUD;
import static co.com.red5g.utils.conexionbd.Queries.SQL_LINEA_CREDITO;
import static co.com.red5g.utils.pdf.EstructurasPDF.estadoCivil;
import static co.com.red5g.utils.pdf.EstructurasPDF.ocupacion;
import static co.com.red5g.utils.pdf.EstructurasPDF.segurosVidaMundial;
import static co.com.red5g.utils.pdf.EstructurasPDF.valorCapital;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

import co.com.red5g.finsonet.questions.factories.LaInformacion;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import co.com.red5g.finsonet.tasks.factories.Obtiene;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

public class SoportesTesoreriaFinsoamigoStepDefinition {

  @Dado("^que (.*) esta en el paso de tesorería finsoamigos en un crédito$")
  public void ingresarCreditoFinsoamigo(String actor) {
    theActorCalled(actor).wasAbleTo(Ingresa.aUnCreditoEnTesoreriaFinsoamigo());
  }

  @Cuando("^el asesor obtiene la información del pdf de Seguro de Vida Mundial$")
  public void obtenerInformacionPdfSeguroVidaMundial() {
    theActorInTheSpotlight().attemptsTo(Obtiene.laInformacionDelPdfSeguroDeVidaMundial());
  }

  @Y("^el asesor obtiene la información de la BD de Seguro de Vida Mundial$")
  public void obtenerInformacionBDSeguroVidaMundial() {
    theActorInTheSpotlight().attemptsTo(Obtiene.laInformacionDeBDDeSeguroDeVidaMundial(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql()));
  }

  @Entonces("^el asesor deberá ver que la información corresponde a la de BD$")
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
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Segundo Apellido")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "s_apellido")))),
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Nombres")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "nombre")))),
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
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "celular")))),
        seeThat(LaInformacion.delPdf(segurosVidaMundial("Ciudad Residencia")), containsString(theActorInTheSpotlight()
            .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_CIUDAD.getSql(), "ciudad"))))
    );
  }
}
