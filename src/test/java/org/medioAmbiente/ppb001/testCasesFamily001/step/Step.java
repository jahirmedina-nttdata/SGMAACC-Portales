package org.medioAmbiente.ppb001.testCasesFamily001.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.ppb001.testCasesFamily001.page.Page;
import org.openqa.selenium.JavascriptExecutor;


public class Step extends ScenarioSteps {

    private Page Page;

    @net.thucydides.core.annotations.Step
    public void cargarPagina() throws InterruptedException {
        Page.open();
        getDriver().manage().window().maximize();
    }

    @net.thucydides.core.annotations.Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
    }

    @net.thucydides.core.annotations.Step
    public void limpiarCampos() throws InterruptedException {
        Page.clickLimpiarCampos();
    }

    @net.thucydides.core.annotations.Step
    public void buscar() throws InterruptedException {
        Page.clickBuscar();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        j.executeScript("window.scrollBy(0,300)");
    }

    @net.thucydides.core.annotations.Step
    public void escribirBuscarPorPalabras(String entradaTexto) throws InterruptedException {
        Page.escribirBusquedaPorPalabra(entradaTexto);
    }

    @net.thucydides.core.annotations.Step
    public void clickDropDownMenuEspaciosNaturales(String entradaTexto) throws InterruptedException {
        Page.clickDropDownMenuEspaciosNaturales(entradaTexto);
    }

    @net.thucydides.core.annotations.Step
    public void clickDropDownProvincias(String entradaTexto) throws InterruptedException {
        Page.clickDropDownProvincias(entradaTexto);
    }

    @net.thucydides.core.annotations.Step
    public void clickdropDownMenuTipoEquipamento(String entradaTexto) throws InterruptedException {
        Page.clickDropDownMenuTipoEquipamento(entradaTexto);
    }

    @net.thucydides.core.annotations.Step
    public void clickCheckBoxAccesible() throws InterruptedException {
//        CAP_F_021Page.clickCheckBoxAccesible();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#check\").click();");

    }

    @net.thucydides.core.annotations.Step
    public void clickDropDownMenuNombreEspacioNatural(String entradaTexto) throws InterruptedException {
        Page.clickDropDownMenuNombreEspacioNatural(entradaTexto);
    }
}