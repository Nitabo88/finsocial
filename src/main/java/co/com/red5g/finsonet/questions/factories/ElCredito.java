package co.com.red5g.finsonet.questions.factories;

import co.com.red5g.finsonet.questions.*;
import net.serenitybdd.screenplay.Question;

public class ElCredito {

  public ElCredito() {
  }

  public static Question<Boolean> enConfirmacion() {
    return new PasoConfirmacionExitosa();
  }

  public static Question<Boolean> enAprobacionDeDocumentos() {
    return new PasoAprobacionDeCreditos();
  }

  public static Question<Boolean> enChequeoDeDocumentos() {
    return new PasoChequeoDeDocumentos();
  }

  public static Question<Boolean> enPendientesAprobacionCredito() { return new PasoPendienteAprobacionDeCreditos();
  }

    public static Question<Boolean> asignado() { return new AsignacionLlamada();
    }
}
