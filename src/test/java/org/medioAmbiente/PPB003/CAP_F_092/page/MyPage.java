package org.medioAmbiente.PPB003.CAP_F_092.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/espacio-personal")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade Usuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade Password;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_ReTFpDg2eNvQ\"]//section/div//div[3]//figure/a/img")
    private WebElementFacade Pasaporte_Ecoturista;

    @FindBy(xpath = "(//*[@id=\"_Pasaportemodule_INSTANCE_vXEUJGmerZqu_follow_reading_1\"]/article/div/div[1]/figure/img[1])[1]")
    private WebElementFacade Tarjeta_Pasaporte;

    @FindBy(xpath = "//*[@id=\"dropdownMenu1\"]/span[1]")
    private WebElementFacade Select_Idioma;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_site_navigation_language_web_portlet_SiteNavigationLanguagePortlet\"]//li[3]/button/a")
    private WebElementFacade Idioma;

    @FindBy(xpath = "//li[@class=\"tab active evr-tabs__nav\"]/a")
    private WebElementFacade Validar_Idioma;

    @FindBy(xpath = "//a[@data-title=\"Menú\"]")
    private WebElementFacade Menu_Vertical;

    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'cmaot_testing testing')]")));
    }

    public void seleccionarIdioma() throws InterruptedException {
        Menu_Vertical.click();
        List<WebElement> lista = getDriver().findElements(org.openqa.selenium.By.xpath("//a[@class=\"control-menu-icon lfr-portal-tooltip product-menu-toggle sidenav-toggler active open\"]"));
        if (lista.size() != 0) {
            Menu_Vertical.click();
        } else {
            Assert.assertTrue(true);
        }
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Actions action = new Actions(getDriver());
        action.moveToElement(Pasaporte_Ecoturista).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-photographytitle__title\"]")));
        action.moveToElement(Select_Idioma).click().perform();
        action.moveToElement(Idioma).click().perform();
    }

    public void clickarFichaPasaporte() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-photographytitle__title\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Actions action = new Actions(getDriver());
        action.moveToElement(Tarjeta_Pasaporte).click().perform();
    }

    public void validarTraduccion() throws InterruptedException {
        WebElement Element = getDriver().findElement(By.xpath("//div[@class=\"jssocials-share jssocials-share-facebook\"]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        String validar = Validar_Idioma.getText();
        if(validar.contains("DONNÉES D'INTÉRÊT")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide Idioma");
        }
    }
}