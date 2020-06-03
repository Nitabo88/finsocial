package co.com.red5g.utils.pdf;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class LeerPdf {

  private static String contenidoPdf;

  private LeerPdf() {
  }

  public static String leerPdf() throws IOException {
    PDDocument documento = null;
    URL url = new URL(getProxiedDriver().getCurrentUrl());
    InputStream file = url.openStream();
    try (BufferedInputStream fileParse = new BufferedInputStream(file)) {
      documento = PDDocument.load(fileParse);
      contenidoPdf = new PDFTextStripper().getText(documento);
    } finally {
      file.close();
      assert documento != null;
      documento.close();
    }
    return contenidoPdf;
  }

  public static List<String> procesarPdf(String pdf) throws IOException {
    return Arrays.asList(pdf.split(new PDFTextStripper().getLineSeparator()));
  }
}
