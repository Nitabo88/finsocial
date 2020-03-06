package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.questions.PorcentajeComision.porcentajeComision;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class EstadoCredito implements Question<Boolean> {

  private final Long montoTotalAsesor;
  private final Double valorComision;

  public EstadoCredito(final Long montoTotalAsesor, final Double valorComision) {
    this.montoTotalAsesor = montoTotalAsesor;
    this.valorComision = valorComision;
  }

  public static Question<Boolean> estadoCredito(Long montoTotalAsesor, Double valorComision) {
    return new EstadoCredito(montoTotalAsesor, valorComision);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    final double valorComisionAsesor = Math.floor(montoTotalAsesor * porcentajeComision().answeredBy(actor) / 100);
    return valorComision.equals(valorComisionAsesor);
  }
}
