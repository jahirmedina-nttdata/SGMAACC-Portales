package org.medioAmbiente.PPB002.CAP_F_021.page;


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


@DefaultUrl("/medioambiente/portal/web/guest/actualidad/participa-y-colabora")


public class MyPage extends PageObject {

    @FindBy(xpath = "(//a[@title=\"Guías Didácticas de Educación Ambiental\"])[1]")
    private WebElementFacade Texto_Flotante;

    @FindBy(xpath = "(//a[@title=\"Buenas prácticas del mes\"])[1]")
    private WebElementFacade Campaña;



    public void ubicarseSeccionQuePuedoHacer() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 1000)");
    }

    public void posicionarPuntero() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Texto_Flotante)
                .perform();
        String textflotante = Texto_Flotante.getAttribute("title");

        if(textflotante.contains("Guías Didácticas de Educación Ambiental")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }

    public void comprobarQueNavegueAlContenido() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Campaña).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Buenas prácticas del mes')]")));
    }
}
