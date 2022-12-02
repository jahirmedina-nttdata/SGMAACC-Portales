package org.medioAmbiente.PPB003.CAP_F_054.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/")


public class MyPage extends PageObject {

    @FindBy(xpath = "(//a[contains(text(),'VER MÁS')])[1]")
    private WebElementFacade Ver_Mas;

    public void visualizarSugerencia() throws InterruptedException {
        WebElement Element = getDriver().findElement(By.xpath("(//div[@class=\"slick-list draggable\"])[2]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
    }

    public void clickarVerMas() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        Ver_Mas.click();
       // WebDriverWait wait = new WebDriverWait(getDriver(), 30);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Sugerencias del mes · PRUEBA SUGERENCIA DEL MES')]")));
    }
}
