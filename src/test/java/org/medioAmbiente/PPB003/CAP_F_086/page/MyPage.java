package org.medioAmbiente.PPB003.CAP_F_086.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/espacio-personal")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade Usuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade Password;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_ReTFpDg2eNvQ\"]//div[2]/div/figure/a")
    private WebElementFacade Favoritos;

    @FindBy(xpath = "//*[@id=\"_favoritosmodule_INSTANCE_A6rlF3DEndQG_follow_reading_1\"]/article/div/div[1]/figure/img")
    private WebElementFacade Lista_Favoritos;

    @FindBy(xpath = "//*[@id=\"dropdownMenu1\"]/span[1]")
    private WebElementFacade Select_Idioma;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_site_navigation_language_web_portlet_SiteNavigationLanguagePortlet\"]//li[3]/button/a")
    private WebElementFacade Idioma;

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_Jlbxh2qB3NwR_5757911\"]/div/div/section[2]/a[2]/span")
    private WebElementFacade Validar_Idioma;


    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
    }

    public void seleccionarIdioma() throws InterruptedException {
        Favoritos.click();
        Select_Idioma.click();
        Idioma.click();
    }

    public void clickarFicha() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 300)");
        Lista_Favoritos.click();
    }

    public void validarTraduccion() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
        String validar = Validar_Idioma.getText();
        if(validar.equals("Pistes cyclables")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide Idioma");
        }
    }
}