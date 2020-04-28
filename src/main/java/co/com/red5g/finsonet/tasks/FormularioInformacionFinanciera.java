package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.interacions.Seleccionar;
import co.com.red5g.finsonet.models.InformacionFinanciera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso4Page.*;

public class FormularioInformacionFinanciera implements Task {
    final InformacionFinanciera informacionFinanciera;

    public FormularioInformacionFinanciera(InformacionFinanciera informacionFinanciera) {
        this.informacionFinanciera = informacionFinanciera;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(informacionFinanciera.getSalarioFijo()).into(TXT_SALARIO_FIJO),
                Enter.theValue(informacionFinanciera.getSalarioVariableComisiones()).into(TXT_SALARIO_VARIABLES_COMISIONES),
                Enter.theValue(informacionFinanciera.getArrendamientoIngresos()).into(TXT_ARRENDAMIENTO),
                Enter.theValue(informacionFinanciera.getRendimientosFinancieros()).into(TXT_RENDIMENTO_FINANCIERO),
                Enter.theValue(informacionFinanciera.getHonorarios()).into(TXT_HONORARIOS),
                Enter.theValue(informacionFinanciera.getOtrosIngresos()).into(TXT_OTRO_INGRESOS),
                Enter.theValue(informacionFinanciera.getCualesIngresos()).into(TXT_CUALES_INGRESOS),
                Enter.theValue(informacionFinanciera.getArriendosEgresos()).into(TXT_ARRIENDOS),
                Enter.theValue(informacionFinanciera.getGastosPersonalesFamiliares()).into(TXT_GASTOS_PERSONALES),
                Enter.theValue(informacionFinanciera.getPrestamosDiferentesFinsocial()).into(TXT_PRESTAMOS_DIFERENTES),
                Enter.theValue(informacionFinanciera.getDeduccionesNomina()).into(TXT_DEDUCCION_NOMINA),
                Enter.theValue(informacionFinanciera.getTarjetasCredito()).into(TXT_TARJETAS_CREDITO),
                Enter.theValue(informacionFinanciera.getOtrosGastos()).into(TXT_OTROS_GASTOS),
                Enter.theValue(informacionFinanciera.getCualesIngresos()).into(TXT_CUALES_GASTOS),
                Enter.theValue(informacionFinanciera.getPagoHipoteca()).into(TXT_PAGO_HIPOTECA),
                Enter.theValue(informacionFinanciera.getValorComercialVivienda()).into(TXT_VALOR_COMERCIAL_VIVIENDA),
                Enter.theValue(informacionFinanciera.getDondeVivir()).into(TXT_DONDE_VIVIR),
                Click.on(RDB_COMPRAR_VIVIENDA.of(informacionFinanciera.getComprarVivienda())),
                Click.on(RDB_CUPO_EXTRA_LIBRANZA.of(informacionFinanciera.getCupoExtraLibranza())),
                Seleccionar.opcionLista(informacionFinanciera.getUsoCredito(), BTN_RAZON_CREDITO, LST_RAZON_CREDITO)
        );
    }
}
