package org.medioAmbiente.PPB003.CAP_F_121.page;


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

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"layout_56\"]")
    private WebElementFacade Menu;

    @FindBy(xpath = "//*[@id=\"layout_60\"]")
    private WebElementFacade SubMenu;

    @FindBy(xpath = "//span[@title=\"Seleccionar Provincia\"]")
    private WebElementFacade Select_Provincia;

    @FindBy(xpath = "//div[contains(text(),'ALMERÍA')]")
    private WebElementFacade Almeria;

    @FindBy(xpath = "//input[@title=\"Seleccione un tipo de equipamiento\"]")
    private WebElementFacade Tipo_Equipamiento;

    @FindBy(xpath = "(//span[contains(text(),'SENDERO SEÑALIZADO')])[1]")
    private WebElementFacade Sendero_Señalizado;

    @FindBy(xpath = "//button[contains(text(),'APLICAR')]")
    private WebElementFacade Aplicar;

    @FindBy(xpath = "//button/span[contains(text(),'Buscar')]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//button/span[contains(text(),'Limpiar')]")
    private WebElementFacade btnLimpiar;

    @FindBy(xpath = "(//span[@class=\"evr-article-collage-map__tag\"])[1]")
    private WebElementFacade Validar_Resultado;


    public void seleccionarMenu() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Menu)
                .perform();
    }

    public void seleccionarSubmenu() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(SubMenu)
                .perform();
        SubMenu.click();
    }

    public void seleccionarProvinciaAlmeria() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title=\"Seleccionar Provincia\"]")));
        Select_Provincia.click();
        Almeria.click();
    }

    public void seleccionarTipoEquipamientoSenderoSeñalizado() throws InterruptedException {
        Tipo_Equipamiento.click();
        Sendero_Señalizado.click();
        Aplicar.click();
    }

    public void pulsarBuscar() throws InterruptedException {
        btnBuscar.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Resultados')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 1000)");
    }

    public void validarBusqueda() throws InterruptedException {
        waitFor(1).second();
        List<WebElement> lista = getDriver().findElements(By.xpath("//div[@class=\"evr-map-result__paragraph\"]"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Lista");
        }

        String validacion = Validar_Resultado.getText();
        if(validacion.equals("EQUIPAMIENTO: SENDERO SEÑALIZADO")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("Informacion valida");
        }
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, -400)");
        waitFor(7).second();
    }

    public void pulsarLimpiar() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
        waitFor(1).second();
        btnLimpiar.click();
        j.executeScript("window.scrollBy(0, 600)");
        waitFor(3).second();
    }

}
