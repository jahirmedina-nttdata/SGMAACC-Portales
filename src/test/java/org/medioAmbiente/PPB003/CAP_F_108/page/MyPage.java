package org.medioAmbiente.PPB003.CAP_F_108.page;


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

import java.net.URI;
import java.net.URISyntaxException;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/espacio-personal")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_searchTextInput\"]")
    private WebElementFacade Texto_Buscar;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade Usuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade Password;

    @FindBy(xpath = "//a[@class=\"direction-left-side dropdown-toggle icon-monospaced \"]")
    private WebElementFacade Portlet;

    @FindBy(xpath = "//a[@data-title=\"Editar CABO DE GATA-NIJAR\"]")
    private WebElementFacade Editar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_follow_reading_asset0\"]/article/div/div[1]/figure/img")
    private WebElementFacade Espacio_Natural;

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_Jlbxh2qB3NwR_tabs16567847386736865686983TabsId\"]/a")
    private WebElementFacade Pestaña_Actividades;

    public void autenticarUsuario() throws InterruptedException, URISyntaxException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'cmaot_testing testing')]")));
        getDriver().get(new URI(getDriver().getCurrentUrl()).resolve("/medioambiente/portal/web/ventanadelvisitante/buscador-de-espacios-naturales-y-equipamientos?categoryVal=").toString());
    }

    public void seleccionarEspacioNatural() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_searchTextInput\"]")));
        Texto_Buscar.sendKeys("CABO DE GATA"+ "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Resultados')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 1000)");
        j.executeScript("window.scrollBy(0, 150)");
        Actions action = new Actions(getDriver());
        action.moveToElement(Espacio_Natural).click().perform();
    }

    public void ocultarActividadesEspecificas() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title=\"Ir a Buscador de Espacios Naturales y Equipamientos\"]")));
       // Actions action = new Actions(getDriver());
        //action.moveToElement(Portlet).click().perform();
       // action.moveToElement(Editar).click().perform();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
//        Pestaña_Actividades.click();
        j.executeScript("window.scrollBy(0, 200)");
    }
}