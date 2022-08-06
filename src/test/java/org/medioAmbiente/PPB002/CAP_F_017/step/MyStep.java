package org.medioAmbiente.PPB002.CAP_F_017.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_017.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyStep extends ScenarioSteps {

    private MyPage page;
    private String prntw;
    private String popwnd;

    @net.thucydides.core.annotations.Step
    public void cargarPagina() throws InterruptedException {
        page.open();
        getDriver().manage().window().maximize();

    }

    @net.thucydides.core.annotations.Step
    public void aceptarCookies() throws InterruptedException {

        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
        // j.executeScript("window.scrollBy(0, 500)");
    }

    @net.thucydides.core.annotations.Step
    public void clickPermitir() throws InterruptedException {
        //NO ACEPTA LA ALERTA
        getDriver().switchTo().alert().accept();
        Thread.sleep(5000);
        getDriver().navigate().refresh();
    }

    @net.thucydides.core.annotations.Step
    public void clickNopermitir() throws InterruptedException {
        //NO CANCELA LA ALERTA
        getDriver().switchTo().alert().dismiss();
        Thread.sleep(3000);
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarProvin() throws InterruptedException {
        page.seleccionarProvin();
        Thread.sleep(3000);
    }
}