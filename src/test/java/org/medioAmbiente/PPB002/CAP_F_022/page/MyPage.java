package org.medioAmbiente.PPB002.CAP_F_022.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/guest/areas-tematicas")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@title=\"Memorias anuales de seguimiento del Plan Andaluz Medio Ambiente\"]")
    private WebElementFacade Contenido_Destacado;


    public void ubicarseEnDestacados() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 300)");

    }

    public void clickarContenido() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Contenido_Destacado).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),'Memorias anuales de seguimiento del Plan Andaluz Medio Ambiente')])[2]")));
    }


}
