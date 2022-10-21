package org.medioAmbiente.PPB003.CAP_F_091.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/espacio-personal")


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


    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
    }

    public void seleccionarIdioma() throws InterruptedException {
        Pasaporte_Ecoturista.click();
        Select_Idioma.click();
        Idioma.click();
    }

    public void clickarFichaPasaporte() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Tarjeta_Pasaporte.click();
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