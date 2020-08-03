package co.com.red5g.bancoomeva.interactions;

import static co.com.red5g.bancoomeva.userinterfaces.FirmaPage.LNK_INPUT;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;

import co.com.devco.automation.mobile.actions.WaitFor;
import java.nio.file.Path;
import java.nio.file.Paths;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Upload;

public class SubirDocumentos implements Interaction {

  @Override
  public <T extends Actor> void performAs(T actor) {
    Path path = Paths.get("./src/test/resources/file/prueba.pdf");
    int subirArchivos = LNK_INPUT.resolveAllFor(actor).size();
    for (int i = 0; i < subirArchivos; i++) {
      actor.attemptsTo(
          Upload.theFile(path).to(LNK_INPUT.resolveAllFor(actor).get(i)),
          WaitFor.seconds(TIEMPO_3));
    }
  }
}
