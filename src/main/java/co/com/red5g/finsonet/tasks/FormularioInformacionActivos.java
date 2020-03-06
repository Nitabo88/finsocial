package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.DescripcionActivos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso4Page.*;

public class FormularioInformacionActivos implements Task {
    private final DescripcionActivos descripcionActivos;

    public FormularioInformacionActivos(DescripcionActivos descripcionActivos) {
        this.descripcionActivos = descripcionActivos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(descripcionActivos.getTipoInmueble()).into(TXT_TIPO_INMUEBLE),
                Enter.theValue(descripcionActivos.getValorComercialInmueble()).into(TXT_VALOR_COMERCIAL_INMUEBLE),
                Enter.theValue(descripcionActivos.getHipotecadoA()).into(TXT_HIPOTECADO),
                Enter.theValue(descripcionActivos.getDireccion()).into(TXT_DIRECCION),
                Click.on(BTN_CERRAR_DIRECCION),
                Enter.theValue(descripcionActivos.getSaldoCreditoInmueble()).into(TXT_SALDO_CREDITO_INMUEBLE),
                Enter.theValue(descripcionActivos.getVehiculoClase()).into(TXT_VEHICULO_CLASE),
                Enter.theValue(descripcionActivos.getMarcaModelo()).into(TXT_MARCA_MODELO),
                Enter.theValue(descripcionActivos.getNumeroPlaca()).into(TXT_PLACA_NUMERO),
                Enter.theValue(descripcionActivos.getValorComercialVehiculo()).into(TXT_VALOR_COMERCIAL_VEHICULO),
                Enter.theValue(descripcionActivos.getSaldoCreditoVehiculo()).into(TXT_SALDO_CREDITO_VEHICULO),
                Enter.theValue(descripcionActivos.getPrendaAFavor()).into(TXT_PRENDA_A_FAVOR)
        );
    }
}