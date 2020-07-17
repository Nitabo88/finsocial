package co.com.red5g.bancoomeva.tasks;

import static co.com.red5g.bancoomeva.userinterfaces.SeguroVidaPage.RBN_ADICIONAR_BENEFICIARIO;
import static co.com.red5g.bancoomeva.userinterfaces.SeguroVidaPage.RBN_SALARIO_ESTABLE;
import static co.com.red5g.bancoomeva.userinterfaces.SeguroVidaPage.RBN_SALARIO_NO_ESTABLE;
import static co.com.red5g.bancoomeva.userinterfaces.SeguroVidaPage.TXT_APELLIDOS_BENEFICIARIO;
import static co.com.red5g.bancoomeva.userinterfaces.SeguroVidaPage.TXT_DOCUMENTO_BENEFICIARIO;
import static co.com.red5g.bancoomeva.userinterfaces.SeguroVidaPage.TXT_EMAIL_BENEFICIARIO;
import static co.com.red5g.bancoomeva.userinterfaces.SeguroVidaPage.TXT_ESTATURA;
import static co.com.red5g.bancoomeva.userinterfaces.SeguroVidaPage.TXT_NOMBRES_BENEFICIARIO;
import static co.com.red5g.bancoomeva.userinterfaces.SeguroVidaPage.TXT_PESO;
import static co.com.red5g.bancoomeva.userinterfaces.SeguroVidaPage.TXT_PORCENTAJE_BENEFICIARIO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class SeguroVida implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Enter.theValue("70").into(TXT_PESO),
        Enter.theValue("165").into(TXT_ESTATURA),
        JavaScriptClick.on(RBN_ADICIONAR_BENEFICIARIO),
        Enter.theValue("Daniela").into(TXT_NOMBRES_BENEFICIARIO),
        Enter.theValue("Montoya Rico").into(TXT_APELLIDOS_BENEFICIARIO),
        Enter.theValue("20200122-889970").into(TXT_DOCUMENTO_BENEFICIARIO),
        Enter.theValue("100").into(TXT_PORCENTAJE_BENEFICIARIO),
        Enter.theValue("Prueba@gmail.com").into(TXT_EMAIL_BENEFICIARIO),
        JavaScriptClick.on(RBN_SALARIO_ESTABLE),
        JavaScriptClick.on(RBN_SALARIO_NO_ESTABLE)
    );
  }
}
