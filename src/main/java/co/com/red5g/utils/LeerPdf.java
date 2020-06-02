package co.com.red5g.utils;

import static co.com.red5g.utils.ConexionBaseDatos.getLogger;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class LeerPdf {

  private static String contenidoPdf;

  public static String leerPdf() {
    PDDocument documento = null;
    try {
      URL url = new URL(getProxiedDriver().getCurrentUrl());
      InputStream file = url.openStream();
      BufferedInputStream fileParse = new BufferedInputStream(file);
      documento = PDDocument.load(fileParse);
      contenidoPdf = new PDFTextStripper().getText(documento);
    } catch (MalformedURLException e) {
      getLogger().info("No encontro la url");
    } catch (IOException e) {
      getLogger().info(String.valueOf(e));
    }
    finally{

    }
    return contenidoPdf;
  }

  public static List<String> procesarPdf(String pdf) throws IOException {
    return Arrays.asList(pdf.split(new PDFTextStripper().getLineSeparator()));
  }
}
