package org.medioAmbiente.PPB006.CAP_FC_002.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/home")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"evr-formFilters\"]/div[2]/div[2]/label")
    private WebElementFacade Busqueda_Avan;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_j9REwhPrNDhF_searchTextInput\"]")
    private WebElementFacade Texto_Buscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_j9REwhPrNDhF_category0-button\"]")
    private WebElementFacade Lista;

    @FindBy(xpath = "//div[contains(text(),'Administraciones locales')]")
    private WebElementFacade Categoria;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_j9REwhPrNDhF_searchButton\"]/span")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"evr-formFilters\"]/div[2]/button[2]/span")
    private WebElementFacade btnLimpiar;

    @FindBy(xpath = "//*[@id=\"46894923\"]")
    private WebElementFacade Enlace;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_j9REwhPrNDhF_pagination\"]/li[13]/a")
    private WebElementFacade Sig;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_j9REwhPrNDhF_pagination\"]/li[14]/a")
    private WebElementFacade Ultimo;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_j9REwhPrNDhF_pagination\"]/li[2]/a")
    private WebElementFacade Atras;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_j9REwhPrNDhF_pagination\"]/li[1]/a")
    private WebElementFacade Primera;



    public void accederBuscador() throws InterruptedException{
        getDriver().navigate().to("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/buscador");
        Busqueda_Avan.click();
    }

    public void visualizarCAPFC0201() throws InterruptedException{
        Texto_Buscar.sendKeys("Huella"+ "\n");
        Thread.sleep(2000);
        btnLimpiar.click();
        Lista.click();
        Categoria.click();
        btnBuscar.click();
        Thread.sleep(2000);
        btnLimpiar.click();

        Actions actions = new Actions(getDriver());
        actions.moveToElement(Enlace)
                .perform();

        String textflotante = Enlace.getAttribute("title");

        if(textflotante.equals("Nuevos visores de adaptación de las costas al cambio climático")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }

        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");

        Sig.click();
        Thread.sleep(1000);
        Ultimo.click();
        Thread.sleep(1000);
        Atras.click();
        Thread.sleep(1000);
        Primera.click();


    }
}
