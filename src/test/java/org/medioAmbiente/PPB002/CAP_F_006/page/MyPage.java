package org.medioAmbiente.PPB002.CAP_F_006.page;


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


@DefaultUrl("/medioambiente/portal/web/guest/acerca-de/derecho-de-acceso-a-la-informacion-ambiental")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@title=\"¿Cómo puedo solicitar información ambiental?\"]")
    private WebElementFacade Contenido_Relacionado;


    public void visualizarContenidoRelacionado() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 950)");
    }

    public void posicionarPuntero() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Contenido_Relacionado)
                .perform();

        String textflotante = Contenido_Relacionado.getAttribute("title");

        if(textflotante.equals("¿Cómo puedo solicitar información ambiental?")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }

    public void clickarEnlace() throws InterruptedException{
        Contenido_Relacionado.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),'¿Cómo puedo solicitar información ambiental?')])[2]")));
    }
}
