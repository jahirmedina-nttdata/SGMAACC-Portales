package org.medioAmbiente.PPB002.CAP_F_015.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/guest/actualidad/agenda-eventos")


public class MyPage extends PageObject {

    @FindBy(xpath = "(//a[@title=\"Taller presencial gestión del litoral y educación ambiental en Andalucía. Málaga (Andalucía occidental)\"])[2]")
    private WebElementFacade Titulo_Imagen;


    public void ubicarteEnTambienTePuedeInteresar() throws InterruptedException{
        WebElement Element = getDriver().findElement(By.xpath("//img[@alt=\"Taller presencial gestión del litoral y educación ambiental en Andalucía. Málaga (Andalucía occidental)\"]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
    }

    public void clickarTituloDeImagen() throws InterruptedException{
        Actions action = new Actions(getDriver());
        action.moveToElement(Titulo_Imagen).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),'Taller presencial gestión del litoral')])[2]")));
    }

}
