package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ChequeoDocumentosPage {
    public static final Target LST_FILA_CHEQUEO_DOCUMENTOS = Target.the("la opcion de la tabla").locatedBy("//div[@class='table-responsive']//td[contains(.,'{0}')]//parent::tr//td[contains(.,'{1}')]");

}
