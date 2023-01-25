package org.medioAmbiente.PPB002.CAP_F_018.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/guest/actualidad/participa-y-colabora")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@title=\"Certamen Reciclar Arte\"]")
    private WebElementFacade Contenido_Destacado;



    public void ubicarseEnDestacados() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 750)");
    }

    public void ClickarContenido() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Contenido_Destacado).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Certamen Reciclar Arte')]")));
    }
}
