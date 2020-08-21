package co.com.red5g.utils.pdf;

import java.util.HashMap;
import java.util.Map;

public class UrlsPdfs {

  private UrlsPdfs() {
  }

  public static String urlPdf(String tipoDocumento) {
    Map<String, String> map = new HashMap<>();
    map.put("Seguro de Vida Mundial", "https://finsonet.finsocial.com/doc-firmados/firmados/seguroVida_%s1.pdf");
    map.put("Solicitud Crédito Finsocial", "https://finsonet.finsocial.com/doc-firmados/firmados/finsocial_%s.pdf");
    map.put("Seguro de Vida Sura", "https://finsonet.finsocial.com/doc-firmados/firmados/SEGUROSURA_%s1.pdf");
    map.put("Boletín de Costos", "https://finsonet.finsocial.com/doc-firmados/firmados/COSTOS_%s.pdf");
    map.put("Solicitud de Afiliación Cooperativa", "https://finsonet.finsocial.com/doc-firmados/firmados/coophumana_%s1.pdf");
    map.put("Pagaré Finsocial", "https://finsonet.finsocial.com/doc-firmados/firmados/PAGARE-FINSOCIAL_%s1.pdf");
    map.put("Pagaré Coophumana", "https://finsonet.finsocial.com/doc-firmados/firmados/PAGARE-COOPHUMANA_%s1.pdf");
    map.put("Desafiliación Coophumana", "https://finsonet.finsocial.com/doc-firmados/firmados/DESAFILIACION-COOPHUMANA_%s1.pdf");
    map.put("Formulario conocimiento actival", "https://finsonet.finsocial.com/doc-firmados/firmados/FORMULARIO-ACTIVAL_%s1.pdf");
    map.put("Desafiliación Actival", "https://finsonet.finsocial.com/doc-firmados/firmados/DESAFILIACION-ACTIVAL_%s1.pdf");
    return map.get(tipoDocumento);
  }
}

