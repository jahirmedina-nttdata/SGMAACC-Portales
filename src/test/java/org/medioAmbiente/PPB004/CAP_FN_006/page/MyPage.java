package org.medioAmbiente.PPB004.CAP_FN_006.page;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/web/caza-y-pesca/")


public class MyPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"div-calendar\"]/div[3]/div[10]/span")
    private WebElementFacade Dia_Caza;

    @FindBy(xpath = "//*[@id=\"btnNext\"]")
    private WebElementFacade btn_Siguiente;

    @FindBy(xpath = "//*[@id=\"btnPrev\"]")
    private WebElementFacade btn_Anterior;

    @FindBy(xpath = "//*[@id=\"btnMasInfo\"]")
    private WebElementFacade btn_MasInforma;

    @FindBy(xpath = "//*[@id=\"Pesca\"]")
    private WebElementFacade Tab_Pesca;

    @FindBy(xpath = "//*[@id=\"div-calendar\"]/div[3]/div[25]/span")
    private WebElementFacade Dia_Pesca;


    public void clickarDia() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Dia_Caza.click();
    }

    public void clickarSiguiente() throws InterruptedException{
        btn_Siguiente.click();
    }

    public void clickarAnterior()throws InterruptedException {
        btn_Anterior.click();
    }

    public void clickarMasInfo() throws InterruptedException{
        btn_MasInforma.click();
    }

    public void clickarPesca()throws InterruptedException {
        getDriver().navigate().back();
        Tab_Pesca.click();
    }

    public void visualizarSinEvento() throws InterruptedException{
        Dia_Pesca.click();
    }
}
