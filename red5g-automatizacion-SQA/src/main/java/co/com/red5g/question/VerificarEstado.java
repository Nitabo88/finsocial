package co.com.red5g.question;

import co.com.red5g.userinterfaces.EstadosPage;
import co.com.red5g.userinterfaces.OriginacionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;


public class VerificarEstado implements Question <String> {

    String estadoOrig;

    public  VerificarEstado (String estadoOrig){
        this.estadoOrig = estadoOrig;
    }

    @Override
    public String answeredBy(Actor actor) {

        if ("Chequeo de Documentos".equals(estadoOrig)) {
            return Text.of(EstadosPage.CHEQUEO_PAGE).viewedBy(actor).asString();
        } else if ("Confirmación".equals(estadoOrig)) {
            return Text.of(EstadosPage.CONFIRMACION_PAGE).viewedBy(actor).asString();
        } else if ("Aprobación de Créditos".equals(estadoOrig)) {
            return Text.of(EstadosPage.APROBACION_PAGE).viewedBy(actor).asString();
        } else if ("Incorporación".equals(estadoOrig)) {
            return Text.of(EstadosPage.INCORPORACION_PAGE).viewedBy(actor).asString();
        } else if ("Formalización".equals(estadoOrig)) {
            return Text.of(EstadosPage.FORMALIZACION_PAGE).viewedBy(actor).asString();
        } else if ("Tesorería".equals(estadoOrig)) {
            return Text.of(EstadosPage.TESORERIA_PAGE).viewedBy(actor).asString();
        } else if ("A.Cartera".equals(estadoOrig)) {
            return Text.of(EstadosPage.ANTECARTERA_PAGE).viewedBy(actor).asString();
        } else if ("Giros".equals(estadoOrig)) {
            return Text.of(EstadosPage.GIROS_PAGE).viewedBy(actor).asString();
        } else if ("Cartera".equals(estadoOrig)) {
            return Text.of(EstadosPage.CARTERA_PAGE).viewedBy(actor).asString();
        }else{
            System.out.println("INGRESE UN ESTADO VALIDO");
            return null;
        }
    }

    public static VerificarEstado is(String estadoOrig) {
        return new VerificarEstado (estadoOrig);
    }
}


