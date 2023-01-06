package org.medioAmbiente.PPB002.CAP_F_022.page;


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



    public void clickarDetalleContenido() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 100)");
    }


}
