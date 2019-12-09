package co.com.red5g.finsonet.interacions;

import co.com.devco.automation.mobile.actions.WaitFor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FindFile implements Interaction {

	private String urlFile;
	
	public FindFile(String urlFile) {
		this.urlFile = urlFile;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection ss = new StringSelection(urlFile);
		cb.setContents(ss, ss);
		WaitFor.seconds(5);
		Robot r;
		try {
			r = new Robot();
//			r.keyPress(KeyEvent.VK_TAB);
//			r.keyRelease(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			WaitFor.seconds(2);

			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	public static FindFile with(String urlFile) {

		return instrumented(FindFile.class, urlFile);
	}

}
