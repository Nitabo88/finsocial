package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.tasks.SeguroVidaMundialPDF.INFORMACION_PDF;
import static co.com.red5g.utils.pdf.LeerPdf.procesarPdf;

import java.io.IOException;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PDF implements Question<String> {
  private int i;

  public PDF(int i) {
    this.i = i;
  }

  @Override
  public String answeredBy(Actor actor) {
    List<String> lstPdf = null;
    try {
      lstPdf= procesarPdf(actor.recall(INFORMACION_PDF));
    } catch (IOException e) {
      e.printStackTrace();
    }
    return lstPdf.get(i).toLowerCase();
  }
}
