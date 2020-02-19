package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.interacions.Seleccionar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso4Page.*;

public class FormularioInformacionFinanciera implements Task {
    co.com.red5g.finsonet.models.InformacionFinanciera informacionFinanciera;

    public FormularioInformacionFinanciera(final co.com.red5g.finsonet.models.InformacionFinanciera informacionFinanciera) {
        this.informacionFinanciera = informacionFinanciera;
    }

    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(
                Enter.theValue(this.informacionFinanciera.getSalarioFijo()).into(TXT_SALARIO_FIJO),
                Enter.theValue(this.informacionFinanciera.getSalarioVariableComisiones()).into(TXT_SALARIO_VARIABLES_COMISIONES),
                Enter.theValue(this.informacionFinanciera.getArrendamientoIngresos()).into(TXT_ARRENDAMIENTO),
                Enter.theValue(this.informacionFinanciera.getRendimientosFinancieros()).into(TXT_RENDIMENTO_FINANCIERO),
                Enter.theValue(this.informacionFinanciera.getHonorarios()).into(TXT_HONORARIOS),
                Enter.theValue(this.informacionFinanciera.getOtrosIngresos()).into(TXT_OTRO_INGRESOS),
                Enter.theValue(this.informacionFinanciera.getCualesIngresos()).into(TXT_CUALES_INGRESOS),
                Enter.theValue(this.informacionFinanciera.getArriendosEgresos()).into(TXT_ARRIENDOS),
                Enter.theValue(this.informacionFinanciera.getGastosPersonalesFamiliares()).into(TXT_GASTOS_PERSONALES),
                Enter.theValue(this.informacionFinanciera.getPrestamosDiferentesFinsocial()).into(TXT_PRESTAMOS_DIFERENTES),
                Enter.theValue(this.informacionFinanciera.getDeduccionesNomina()).into(TXT_DEDUCCION_NOMINA),
                Enter.theValue(this.informacionFinanciera.getTarjetasCredito()).into(TXT_TARJETAS_CREDITO),
                Enter.theValue(this.informacionFinanciera.getOtrosGastos()).into(TXT_OTROS_GASTOS),
                Enter.theValue(this.informacionFinanciera.getCualesIngresos()).into(TXT_CUALES_GASTOS),
                Enter.theValue(this.informacionFinanciera.getPagoHipoteca()).into(TXT_PAGO_HIPOTECA),
                Enter.theValue(this.informacionFinanciera.getValorComercialVivienda()).into(TXT_VALOR_COMERCIAL_VIVIENDA),
                Enter.theValue(this.informacionFinanciera.getDondeVivir()).into(TXT_DONDE_VIVIR),
                Click.on(RBN_COMPRAR_VIVIENDA.of(this.informacionFinanciera.getComprarVivienda())),
                Click.on(RBN_CUPO_EXTRA_LIBRANZA.of(this.informacionFinanciera.getCupoExtraLibranza())),
                Seleccionar.opcionLista(this.informacionFinanciera.getUsoCredito(), BTN_RAZON_CREDITO, LST_RAZON_CREDITO)
        );
    }
}
