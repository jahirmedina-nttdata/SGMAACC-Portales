package org.medioAmbiente.PPB002.CAP_F_040.page;


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


@DefaultUrl("/medioambiente/portal/acceso-rediam/catalogo")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@title=\"Enlace - ¿Qué son los metadatos y para qué sirven?\"]")
    private WebElementFacade Texto_Flotante;


    @FindBy(xpath = "//a[@title=\"Enlace - Los metadatos y la información ambiental: el Nucleo Español de Metadatos\"]")
    private WebElementFacade Enlace;


    public void visualizarMasSobreCatalogo() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 100)");
        waitFor(1).second();
    }

    public void posicionarPuntero() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Texto_Flotante)
                .perform();
        String textflotante = Texto_Flotante.getAttribute("title");

        if(textflotante.equals("Enlace - ¿Qué son los metadatos y para qué sirven?")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }

    }

    public void clickarEnlace() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Enlace).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),\"Los metadatos y la información ambiental: el Nucleo Español de Metadatos\")])[2]")));
    }


}
