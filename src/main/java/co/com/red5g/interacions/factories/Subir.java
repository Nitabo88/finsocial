package co.com.red5g.interacions.factories;

import co.com.red5g.interacions.SubirArchivosChequeoDocumento;
import co.com.red5g.interacions.SubirArchivosChequeoDocumentoHuy;
import co.com.red5g.interacions.SubirArchivosFormalizacion;
import net.serenitybdd.screenplay.Performable;

public class Subir {

  private Subir() {
  }

  public static Performable losArchivosDeChequeoDocumentos() {
    return new SubirArchivosChequeoDocumento();
  }

  public static Performable losArchivosDeFormalizacion() {
    return new SubirArchivosFormalizacion();
  }

  public static Performable losArchivosDeChequeoDocumentosHuy() {
    return new SubirArchivosChequeoDocumentoHuy();
  }
}
