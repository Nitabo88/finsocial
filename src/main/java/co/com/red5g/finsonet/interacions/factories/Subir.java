package co.com.red5g.finsonet.interacions.factories;

import co.com.red5g.finsonet.interacions.SubirArchivosChequeoDocumento;
import co.com.red5g.finsonet.interacions.SubirArchivosChequeoDocumentoFinsoamigo;
import co.com.red5g.finsonet.interacions.SubirArchivosChequeoDocumentoHuy;
import co.com.red5g.finsonet.interacions.SubirArchivosFormalizacion;
import net.serenitybdd.screenplay.Performable;

public class Subir {

  private Subir() {
  }

  public static Performable losArchivosDeChequeoDocumentos() {
    return new SubirArchivosChequeoDocumento();
  }

  public static Performable losArchivosDeChequeoDocumentosFinsoamigo() {
    return new SubirArchivosChequeoDocumentoFinsoamigo();
  }

  public static Performable losArchivosDeFormalizacion() {
    return new SubirArchivosFormalizacion();
  }

  public static Performable losArchivosDeChequeoDocumentosHuy() {
    return new SubirArchivosChequeoDocumentoHuy();
  }
}
