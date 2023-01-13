package org.medioAmbiente.PPB003.CAP_F_035.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/espacio-personal")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade Usuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade Password;

    @FindBy(xpath = "//a[@data-title=\"Menú\"]")
    private WebElementFacade Menu_Vertical;

    @FindBy(xpath = "//div[@class=\"evr-carrusel slick-initialized slick-slider\"]")
    private WebElementFacade Ficha;

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_Jlbxh2qB3NwR_kldx_column1_0_menu\"]/span")
    private WebElementFacade icono_3puntos;

    @FindBy(xpath = "//a[@data-title=\"Editar PARQUE NATURAL BAHÍA DE CÁDIZ\"]")
    private WebElementFacade Editar;

    @FindBy(xpath = "//button[@id=\"_com_liferay_journal_web_portlet_JournalPortlet_publishButton\"]")
    private WebElementFacade btnPublicar;

    @FindBy(xpath = "//input[@id=\"_com_liferay_journal_web_portlet_JournalPortlet_codigoEquipamiento_INSTANCE_sn6Pvgg4\"]")
    private WebElementFacade Codigo_Equipamiento;

    @FindBy(xpath = "//pre")
    private WebElementFacade Espacio_Relacionado;

    @FindBy(xpath = "//pre")
    private WebElementFacade EspacioNatural;

    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'cmaot_testing testing')]")));
    }

    public void EjecutarCAPF003() throws InterruptedException, URISyntaxException {
        getDriver().get(new URI(getDriver().getCurrentUrl()).resolve("/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/parque-natural-bah-c3-ada-de-c-c3-a1diz/255035").toString());
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title=\"Ir a Buscador de Espacios Naturales y Equipamientos\"]")));
        Menu_Vertical.click();
        List<WebElement> lista = getDriver().findElements(By.xpath("//a[@class=\"control-menu-icon lfr-portal-tooltip product-menu-toggle sidenav-toggler active open\"]"));
        if (lista.size() != 0) {
            Menu_Vertical.click();
        } else {
            Assert.assertTrue(true);
        }
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Ficha)
                .perform();
        actions.moveToElement(icono_3puntos).click().perform();
        actions.moveToElement(Editar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Editar PARQUE NATURAL BAHÍA DE CÁDIZ')]")));
        WebElement iframe = getDriver().findElement(By.xpath( "//iframe[@title=\"Editar PARQUE NATURAL BAHÍA DE CÁDIZ\"]"));
        getDriver().switchTo().frame(iframe);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Identificador:')]")));
        btnPublicar.waitUntilClickable();
        WebElement Element = getDriver().findElement(By.xpath("//label[contains(text(),'Resumen')]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        waitFor(2).second();
    }

    public void consultarCodigoEquipamientoParaValidarEspaciosRelacionados() throws InterruptedException {
        String codigo = Codigo_Equipamiento.getValue();
        getDriver().navigate().to("https://www.juntadeandalucia.es/medioambiente/acervopn/equipamientos/"+codigo+"/espaciosNaturales");
        waitFor(2).second();
        String codigoRenpa = Espacio_Relacionado.getText();
        if(codigoRenpa.contains("63") && codigoRenpa.contains("511") && codigoRenpa.contains("2213") && codigoRenpa.contains("120")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No se valida Espacios");
        }
    }

    public void consultarCodigoEquipamientoParaValidarEspacioNatural() throws InterruptedException {
        getDriver().navigate().to("https://www.juntadeandalucia.es/medioambiente/acervopn/espaciosNaturales/2213");
        waitFor(2).second();
        String Espacionatu = EspacioNatural.getText();
        if(Espacionatu.contains("BAHIA DE CADIZ")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No se valida Espacios");
        }
    }
}
