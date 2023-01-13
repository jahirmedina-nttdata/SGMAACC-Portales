package org.medioAmbiente.PPB003.CAP_F_015.page;


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

    @FindBy(xpath = "//a[@data-title=\"Editar DOÑANA\"]")
    private WebElementFacade Editar;

    @FindBy(xpath = "//button[@id=\"_com_liferay_journal_web_portlet_JournalPortlet_publishButton\"]")
    private WebElementFacade btnPublicar;

    @FindBy(xpath = "//input[@id=\"_com_liferay_journal_web_portlet_JournalPortlet_codigoEspacioNatural_INSTANCE_WJtjFhai\"]")
    private WebElementFacade Codigo_Renpa;

    @FindBy(xpath = "//pre")
    private WebElementFacade Fecha_Declaracion;

    @FindBy(xpath = "//pre")
    private WebElementFacade Municipio;

    @FindBy(xpath = "//pre")
    private WebElementFacade Superficie_Total;

    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'cmaot_testing testing')]")));
    }

    public void ejecutarCAPF003() throws InterruptedException, URISyntaxException {
        getDriver().get(new URI(getDriver().getCurrentUrl()).resolve("/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/do-c3-b1ana-18/255035").toString());
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Editar DOÑANA')]")));
        WebElement iframe = getDriver().findElement(By.xpath( "//iframe[@title=\"Editar DOÑANA\"]"));
        getDriver().switchTo().frame(iframe);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Identificador:')]")));
        btnPublicar.waitUntilClickable();
        WebElement Element = getDriver().findElement(By.xpath("//span[contains(text(),'Figura de Protección')]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        waitFor(2).second();

    }
    public void consultarRenpaParaValidarFechaDeclaracion() throws InterruptedException {
        String renpa = Codigo_Renpa.getValue();
        getDriver().navigate().to("https://www.juntadeandalucia.es/medioambiente/acervopn/espaciosNaturales/"+renpa);
        waitFor(2).second();
        String FechaDecla = Fecha_Declaracion.getText();
        if(FechaDecla.contains("19691028")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("Fecha Declaracion valida");
        }
    }

    public void consultarRenpaParaValidarMunicipio() throws InterruptedException {
        getDriver().navigate().back();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Ficha)
                .perform();
        actions.moveToElement(icono_3puntos).click().perform();
        actions.moveToElement(Editar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Editar DOÑANA')]")));
        WebElement iframe = getDriver().findElement(By.xpath( "//iframe[@title=\"Editar DOÑANA\"]"));
        getDriver().switchTo().frame(iframe);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Identificador:')]")));
        btnPublicar.waitUntilClickable();
        WebElement Element = getDriver().findElement(By.xpath("//span[contains(text(),'Figura de Protección')]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        String renpa = Codigo_Renpa.getValue();
        getDriver().navigate().to("https://www.juntadeandalucia.es/medioambiente/acervopn/espaciosNaturales/"+renpa+"/provinciasMunicipios");
        waitFor(2).second();
        String municipio = Municipio.getText();
        if(municipio.contains("ALMONTE")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("Municipio valido");
        }
    }

    public void consultarRenpaParaValidarSuperficieTotal() throws InterruptedException {
        getDriver().navigate().back();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Ficha)
                .perform();
        actions.moveToElement(icono_3puntos).click().perform();
        actions.moveToElement(Editar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Editar DOÑANA')]")));
        WebElement iframe = getDriver().findElement(By.xpath( "//iframe[@title=\"Editar DOÑANA\"]"));
        getDriver().switchTo().frame(iframe);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Identificador:')]")));
        btnPublicar.waitUntilClickable();
        WebElement Element = getDriver().findElement(By.xpath("//span[contains(text(),'Figura de Protección')]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        String renpa = Codigo_Renpa.getValue();
        getDriver().navigate().to("https://www.juntadeandalucia.es/medioambiente/acervopn/espaciosNaturales/"+renpa+"/superficiesAsociadas");
        waitFor(2).second();
        String superficietotal = Superficie_Total.getText();
        if(superficietotal.contains("60149.42")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("Superficie Total valido");
        }
    }
}
