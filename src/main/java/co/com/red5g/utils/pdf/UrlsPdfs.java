package co.com.red5g.utils.pdf;

import java.util.HashMap;
import java.util.Map;

public class UrlsPdfs {

  private UrlsPdfs() {
  }

  public static String urlPdf(String tipoDocumento) {
    Map<String, String> map = new HashMap<>();
    map.put("Seguro de Vida Mundial", "https://finsonet.finsocial.com/doc-firmados/firmados/seguroVida_%s.pdf");
    map.put("Solicitud Crédito Finsocial", "https://finsonet.finsocial.com/doc-firmados/firmados/finsocial_%s.pdf");
    return map.get(tipoDocumento);
  }
}

