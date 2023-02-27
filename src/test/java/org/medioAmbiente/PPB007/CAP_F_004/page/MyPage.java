package org.medioAmbiente.PPB007.CAP_F_004.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/medioambiente/portal/web/cae/")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"card-cladt02-destacamos1\"]/a")
    private WebElementFacade Tarjeta;

    @FindBy(xpath = "//*[@id=\"card-cladt02-destacamos0\"]/a")
    private WebElementFacade Enlace;

    @FindBy(xpath = "//*[@id=\"card-cladt02-destacamos2\"]/a")
    private WebElementFacade Texto_Flotante;

    @FindBy(xpath = "//*[@id=\"verMasCladt02Destacamos\"]")
    private WebElementFacade Ver_Mas;


    public void visualizarCAPF038() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
    }

    public void visualizarCAPF039() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Tarjeta)
                .perform();
        Enlace.click();
        getDriver().navigate().back();

        actions.moveToElement(Texto_Flotante)
                .perform();
        String textflotante = Texto_Flotante.getAttribute("title");
        if(textflotante.equals("Subvenciones 2021 para instalaciones de tratamiento de biorresiduos recogidos separadamente")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Ver_Mas.click();
    }
}
