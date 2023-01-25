package org.medioAmbiente.PPB003.CAP_F_087.page;


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


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/espacio-personal")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade Usuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade Password;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_ReTFpDg2eNvQ\"]//div[2]/div/figure/a")
    private WebElementFacade Favoritos;

    @FindBy(xpath = "(//*[@id=\"_favoritosmodule_INSTANCE_A6rlF3DEndQG_follow_reading_1\"]/article/div/div[1]/figure/img)[1]")
    private WebElementFacade Lista_Favoritos;

    @FindBy(xpath = "//*[@id=\"dropdownMenu1\"]/span[1]")
    private WebElementFacade Select_Idioma;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_site_navigation_language_web_portlet_SiteNavigationLanguagePortlet\"]//li[3]/button/a")
    private WebElementFacade Idioma;

    @FindBy(xpath = "//li[@class=\"tab active evr-tabs__nav\"]/a")
    private WebElementFacade Validar_Idioma;


    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'cmaot_testing testing')]")));
    }

    public void seleccionarIdioma() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Actions action = new Actions(getDriver());
        action.moveToElement(Favoritos).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-photographytitle__title\"]")));
        action.moveToElement(Select_Idioma).click().perform();
        action.moveToElement(Idioma).click().perform();
    }

    public void clickarFicha() throws InterruptedException {
        WebElement Element = getDriver().findElement(By.xpath("//p[@class=\"evr-photographytitle__txt\"]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        Actions action = new Actions(getDriver());
        action.moveToElement(Lista_Favoritos).click().perform();
    }

    public void validarTraduccion() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title=\"Ir a Recherche d'Espaces Naturels et d'Installations\"]")));
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