package org.medioAmbiente.PPB002.CAP_F_095.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/home")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@title=\"SERVICIO DE ATENCIÓN A LA CIUDADANÍA (SIAC)\"]/span")
    private WebElementFacade Servicio_AC;

    @FindBy(xpath = "//a[@title=\"Portal Ambiental de Andalucía\"]")
    private WebElementFacade Portal_Ambiental;



    public void clickarServiciodeAtencionaCiudadania() throws InterruptedException {
        WebElement Element = getDriver().findElement(By.xpath("//a[@title=\"Boletín Educación para la Sostenibilidad. Mayo 2022\"]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        Servicio_AC.click();
    }

}
