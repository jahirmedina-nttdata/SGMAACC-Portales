package org.medioAmbiente.PPB006.CAP_FN_023.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@DefaultUrl("/medioambiente/portal/web/cambio-climatico/el-cambio-climatico")



public class MyPage extends PageObject {
    @FindBy(xpath = "//a[@title=\"Glosario de términos sobre cambio climático\"]")
    private WebElementFacade Enlace;

    @FindBy(xpath = "(//a[@title=\"Preguntas frecuentes sobre Cambio climático\"])[1]")
    private WebElementFacade Texto_Flotante;

    @FindBy(xpath = "//div[@class=\"ever-evento-cmaot__titleColor\"]/span")
    private WebElementFacade Titulo;

    public void ubicarseEnLaSeccionTambienTePuedeInteresar() throws InterruptedException{
        WebElement Element = getDriver().findElement(By.xpath("//span[contains(text(),\"Actúa\")]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),\"Glosario de términos sobre cambio climático\")])[2]")));
    }

    public void posicionarPunteroEnTexto()  throws InterruptedException{
        getDriver().navigate().back();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Texto_Flotante)
                .perform();

        String textflotante = Texto_Flotante.getAttribute("title");
        if(textflotante.contains("Preguntas frecuentes sobre Cambio climático")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }
}