package org.medioAmbiente.PPB002.CAP_F_011.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/guest/actualidad/noticias-destacados")


public class MyPage extends PageObject {

    @FindBy(xpath = "//input[@title=\"Buscar\"]")
    private WebElementFacade Texto_Buscar;

    @FindBy(xpath = "//button/span[contains(text(),'Buscar')]")
    private WebElementFacade btnBuscar;




    public void buscarPorTexto() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 180)");
        Texto_Buscar.sendKeys("Eco");
        btnBuscar.click();
        j.executeScript("window.scrollBy(0, 200)");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }
}
