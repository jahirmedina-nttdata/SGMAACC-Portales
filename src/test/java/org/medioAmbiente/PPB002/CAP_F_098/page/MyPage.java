package org.medioAmbiente.PPB002.CAP_F_098.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("/medioambiente/portal/home")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;
    @FindBy(xpath = "//a[@title=\"Consejería de Agricultura, Ganadería, Pesca y Desarrollo Sostenible\"]/img")
    private WebElementFacade Junta_Andalucia;

    @FindBy(xpath = "//a[@title=\"Portal Ambiental de Andalucía\"]")
    private WebElementFacade Portal_Ambiental;

    @FindBy(xpath = "//a[@title=\"Consejería de Agricultura, Ganadería, Pesca y Desarrollo Sostenible\"]")
    private WebElementFacade texFlotante;


    public void pulsarJuntaAndalucia() throws InterruptedException {
        Junta_Andalucia.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'¿En qué podemos ayudarte?')]")));
        getDriver().navigate().back();
    }

    public void pulsarPortalAmbientalAndalucia()throws InterruptedException {
        Portal_Ambiental.click();
    }

    public void posicionarPunteroLogoJuntaAndalucia()throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title=\"Portal Ambiental de Andalucía\"]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(texFlotante)
                .perform();

        String textflotante = texFlotante.getAttribute("title");

        if(textflotante.equals("Consejería de Agricultura, Ganadería, Pesca y Desarrollo Sostenible")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }

    }
}
