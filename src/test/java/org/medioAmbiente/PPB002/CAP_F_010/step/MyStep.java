package org.medioAmbiente.PPB002.CAP_F_010.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_010.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;


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
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
    }

    public void irSeccionNoticia() throws InterruptedException{
        page.irSeccionNoticia();
    }

    public void clickarSobreTexto() throws InterruptedException{
        page.clickarSobreTexto();
    }

    public void clickarCategoria() throws InterruptedException{
        page.clickarCategoria();
    }

    public void clickarVerTodasLasNoticias() throws InterruptedException{
        page.clickarVerTodasLasNoticias();
    }
}