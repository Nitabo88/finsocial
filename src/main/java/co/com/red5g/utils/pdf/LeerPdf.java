package co.com.red5g.utils.pdf;

import static co.com.red5g.utils.conexionbd.ConexionBaseDatos.getLogger;
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

  private LeerPdf() {
  }

  public static String leerPdf() throws IOException {
    PDDocument documento = null;
    InputStream file = null;
    BufferedInputStream fileParse = null;
    try {
      URL url = new URL(getProxiedDriver().getCurrentUrl());
      file = url.openStream();
      fileParse = new BufferedInputStream(file);
      documento = PDDocument.load(fileParse);
      contenidoPdf = new PDFTextStripper().getText(documento);
    }  catch (MalformedURLException e) {
      getLogger().info("No encontro la url");
    } catch (IOException e) {
      getLogger().info(String.valueOf(e));
    }
    finally {
        assert file != null;
        file.close();
        assert documento != null;
        documento.close();
        fileParse.close();
      }
    return contenidoPdf;
  }

  public static List<String> procesarPdf(String pdf) throws IOException {
    return Arrays.asList(pdf.split(new PDFTextStripper().getLineSeparator()));
  }
}
