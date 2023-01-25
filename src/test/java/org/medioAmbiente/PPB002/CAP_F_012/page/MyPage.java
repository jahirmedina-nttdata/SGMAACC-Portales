package org.medioAmbiente.PPB002.CAP_F_012.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/guest/actualidad/agenda-eventos")


public class MyPage extends PageObject {

    @FindBy(xpath = "(//a[@title=\"Taller presencial gestión del litoral y educación ambiental en Andalucía. Málaga (Andalucía oriental)\"])[1]")
    private WebElementFacade Titulo_Evento;

    @FindBy(xpath = "(//a[@title=\"Taller presencial gestión del litoral y educación ambiental en Andalucía. Málaga (Andalucía oriental)\"]/../a[@title=\"[ + ] Más\"])[1]")
    private WebElementFacade Icono_Mas;

    public void ubicarseProximosEventos() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
    }

    public void clickarTitulo() throws InterruptedException{
        Actions action = new Actions(getDriver());
        action.moveToElement(Titulo_Evento).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),'Taller presencial gestión del litoral')])[2]")));
    }

    public void clickarIconoMas() throws InterruptedException{
        getDriver().navigate().back();
        Actions action = new Actions(getDriver());
        action.moveToElement(Icono_Mas).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),'Taller presencial gestión del litoral')])[2]")));
    }

}
