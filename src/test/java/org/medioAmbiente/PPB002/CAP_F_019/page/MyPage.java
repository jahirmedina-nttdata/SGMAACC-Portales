package org.medioAmbiente.PPB002.CAP_F_019.page;


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

    @FindBy(xpath = "//a[@title=\"Participa\"]")
    private WebElementFacade Texto_Flotante;

    @FindBy(xpath = "//a[@title=\"Colabora\"]")
    private WebElementFacade Enlace_Colabora;


    public void ubicarseEnListado() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void posicionarCursosEnListado() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Texto_Flotante)
                .perform();

        String textflotante = Texto_Flotante.getAttribute("title");

        if(textflotante.equals("Participa")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }

    public void clickarEnColabora() throws InterruptedException{
        Actions action = new Actions(getDriver());
        action.moveToElement(Enlace_Colabora).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),'Colabora')])[2]")));
    }
}
