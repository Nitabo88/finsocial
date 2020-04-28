package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.interacions.Seleccionar;
import co.com.red5g.finsonet.models.Referencias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso6Page.*;

public class FormularioInformacionReferencias implements Task {
    private final Referencias informacionReferenciaFamiliar;
    private final Referencias informacionReferenciaPersonal;
    private final Referencias informacionReferenciaFinanciera;

    public FormularioInformacionReferencias(Referencias informacionReferenciaFamiliar, Referencias informacionReferenciaPersonal, Referencias informacionReferenciaFinanciera) {
        this.informacionReferenciaFamiliar = informacionReferenciaFamiliar;
        this.informacionReferenciaPersonal = informacionReferenciaPersonal;
        this.informacionReferenciaFinanciera = informacionReferenciaFinanciera;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(informacionReferenciaFamiliar.getNombreCompletoReferencia()).into(TXT_NOMBRE_APELLIDO_FAMILIAR),
                Enter.theValue(informacionReferenciaFamiliar.getParentescoReferencia()).into(TXT_PARENTESCO_FAMILIAR),
                Enter.theValue(informacionReferenciaFamiliar.getTelefonoFijoReferencia()).into(TXT_TELEFONO_FAMILIAR),
                Enter.theValue(informacionReferenciaFamiliar.getTelefonoFijoReferencia()).into(TXT_TELEFONO_FAMILIAR),
                Click.on(BTN_CIUDAD_FAMILIAR),
                Enter.theValue(informacionReferenciaFamiliar.getCiudadReferencia()).into(LST_CIUDAD_REFERENCIA_FAMILIAR).thenHit(Keys.ENTER),
                Enter.theValue(informacionReferenciaFamiliar.getCelularReferencia()).into(TXT_CELULAR_FAMILIAR),
                Enter.theValue(informacionReferenciaFamiliar.getDireccionReferencia()).into(TXT_DIRECCION_REFERENCIA_FAMILIAR),
                Click.on(BTN_CERRAR_DIRECCION),
                Enter.theValue(informacionReferenciaPersonal.getNombreCompletoReferencia()).into(TXT_NOMBRE_APELLIDO_REFERENCIA_PERSONAL),
                Enter.theValue(informacionReferenciaPersonal.getParentescoReferencia()).into(TXT_PARENTESCO_REFERENCIA_PERSONAL),
                Enter.theValue(informacionReferenciaPersonal.getTelefonoFijoReferencia()).into(TXT_TELEFONO_REFERENCIA_PERSONAL),
                Enter.theValue(informacionReferenciaPersonal.getTelefonoFijoReferencia()).into(TXT_TELEFONO_REFERENCIA_PERSONAL),
                Click.on(BTN_CIUDAD_REFERENCIA_PERSONAL),
                Enter.theValue(informacionReferenciaPersonal.getCiudadReferencia()).into(LST_CIUDAD_REFERENCIA_PERSONAL).thenHit(Keys.ENTER),
                Enter.theValue(informacionReferenciaPersonal.getCelularReferencia()).into(TXT_CELULAR_REFERENCIA_PERSONAL),
                Enter.theValue(informacionReferenciaPersonal.getDireccionReferencia()).into(TXT_DIRECCION_REFERENCIA_PERSONAL),
                Click.on(BTN_CERRAR_DIRECCION),
                Enter.theValue(informacionReferenciaFinanciera.getNombreEntidadFinanciera()).into(TXT_NOMBRE_ENTIDAD_FINANCIERA),
                Enter.theValue(informacionReferenciaFinanciera.getSucursal()).into(TXT_SUCURSAL),
                Seleccionar.opcionLista(informacionReferenciaFinanciera.getTipoProducto(),BTN_TIPO_PRODUCTO,LST_TIPO_PRODUCTO)
        );
    }
}