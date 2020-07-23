package co.com.red5g.finsonet.tasks;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.interacions.FindFile;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.UPLOAD;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.UPLOAD_ICON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Send implements Task{
	private String module;
	private String urlFile;
	
	public Send (String module, String urlFile) {
		this.module = module;
		this.urlFile = urlFile;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		WaitFor.seconds(1);
		actor.attemptsTo(
				Click.on(UPLOAD_ICON.of(module)),
				FindFile.with(urlFile),
				Click.on(UPLOAD));
	}

	public static Send theFile(String module, String urlFile) {
		return instrumented(Send.class, module, urlFile);
	}
}