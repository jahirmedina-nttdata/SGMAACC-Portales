package org.medioAmbiente.PPB003.CAP_F_064.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("//medioambiente/portal/web/ventanadelvisitante/videos")


public class MyPage extends PageObject {
    @FindBy(xpath = "(//img[@alt=\"Video Promocional Marca Parque Natural de Andalucía (2021)\"])[2]")
    private WebElementFacade Video;

    public void visualizarVideos() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 100)");
        waitFor(1).second();
    }

    public void clickarElemento() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Video).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),\"Video Promocional Marca Parque Natural de andalucía (2021)\")]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 350)");
        waitFor(2).second();
    }
}
