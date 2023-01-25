package org.medioAmbiente.PPB002.CAP_F_093.page;


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


@DefaultUrl("/medioambiente/portal/home")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;
    @FindBy(xpath = "(//li//span[contains(text(),'ÁREAS TEMÁTICAS')])[1]")
    private WebElementFacade Areas_Tematicas;

    @FindBy(xpath = "(//li//span[contains(text(),'ATMÓSFERA')])[1]")
    private WebElementFacade Atmosfera;

    @FindBy(xpath = "//a[@title=\"La calidad del aire\"]")
    private WebElementFacade Calidad_Aire;

    @FindBy(xpath = "(//h1)[6]")
    private WebElementFacade Validartext;


    public void posicionarAreasTematicas() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Areas_Tematicas)
                .perform();
    }

    public void pulsarSubmenuAtmosfera()throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Atmosfera)
                .perform();
        Atmosfera.click();
    }

    public void pulsarCalidadDelAire()throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),'Atmósfera')])[2]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 350)");
        Calidad_Aire.click();
    }

    public void validarAcceso()throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1)[6]")));

        String validacion = Validartext.getText();
        if(validacion.equals("La calidad del aire")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("Navegacion Incorrecta");
        }
    }

}
