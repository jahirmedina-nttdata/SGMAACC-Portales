package org.medioAmbiente.PPB003.CAP_F_118.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/guest/buscador-agenda-por-dias")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_uC4fnnj4ZZYH_pagination\"]/li[7]")
    private WebElementFacade Paginador;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_uC4fnnj4ZZYH_resultsDiv\"]/section/div/div[1]/div/div/a[1]")
    private WebElementFacade Agenda;

    public void clickarPaginador() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 1000)");
        Paginador.click();
    }

    public void seleccionarAgenda() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Agenda.click();
    }

    public void retrocederPagina() throws InterruptedException {
        getDriver().navigate().back();
        waitFor(2).second();
    }
}