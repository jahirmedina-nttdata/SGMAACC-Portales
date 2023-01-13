package org.medioAmbiente.PPB003.CAP_F_098.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"layout_19\"]")
    private WebElementFacade Menu_Actualidad;

    @FindBy(xpath = "//*[@id=\"layout_20\"]/a")
    private WebElementFacade Submenu_Agenda;

    @FindBy(xpath = "//*[@id=\"heading\"]//div[2]/h1/a/img[1]")
    private WebElementFacade Ventana_Visitante;


    public void visualizarPaginador() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"slick-list draggable\"])[1]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Actions action = new Actions(getDriver());
        action.moveToElement(Menu_Actualidad)
                .perform();
        action.moveToElement(Submenu_Agenda).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Agenda')]")));
        j.executeScript("window.scrollBy(0, 500)");
        waitFor(2).second();
    }
}
