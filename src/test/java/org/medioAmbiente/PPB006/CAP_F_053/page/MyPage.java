package org.medioAmbiente.PPB006.CAP_F_053.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@DefaultUrl("/medioambiente/portal/web/guest/areas-tematicas/cambio-climatico-y-clima/escenarios-locales-de-cambio-climatico")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@title=\"Elaboración de Escenarios Locales de Cambio Climático de Andalucía\"]")
    private WebElementFacade Enlace;

    @FindBy(xpath = "//a[@title=\"Elaboración de Escenarios Locales de Cambio Climático de Andalucía\"]")
    private WebElementFacade Texto_Flotante;

    @FindBy(xpath = "//div[@class=\"ever-evento-cmaot__titleColor\"]/span")
    private WebElementFacade Titulo;

    public void ubicarseEnLaSeccionTambienTePuedeInteresar() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 1000)");
    }

    public void visualizaTitulo()  throws InterruptedException{
        String textflotante = Titulo.getAttribute("innerText");

        if(textflotante.contains("TE PUEDE INTERESAR")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }

    }

    public void navegarEnElComponente()  throws InterruptedException{
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Enlace).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),\"Elaboración de Escenarios Locales de Cambio Climático de Andalucía\")])[2]")));
    }

    public void posicionarPunteroEnTexto()  throws InterruptedException{
        getDriver().navigate().back();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Texto_Flotante)
                .perform();

        String textflotante = Texto_Flotante.getAttribute("title");
        if(textflotante.contains("Elaboración de Escenarios Locales de Cambio Climático de Andalucía")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }

}