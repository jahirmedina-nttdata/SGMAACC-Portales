package org.medioAmbiente.PPB003.CAP_F_123.page;


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

    @FindBy(xpath = "//input[@title=\"Buscar por palabras\"]")
    private WebElementFacade buscarTexto;

    @FindBy(xpath = "//button/span[contains(text(),'Buscar')]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//button/span[contains(text(),'EXPORTAR RESULTADOS')]")
    private WebElementFacade btnExportar;

    @FindBy(xpath = "(//span[@class=\"evr-article-collage-map__title\"])[2]")
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

    public void buscarPorTexto() throws InterruptedException {
        buscarTexto.sendKeys("Sierra de Aracena");
    }


    public void pulsarBuscar() throws InterruptedException {
        btnBuscar.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Resultados')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 900)");

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
        if(validacion.contains("SIERRA DE ARACENA")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("Informacion valida");
        }

    }

    public void pulsarExportarResultados() throws InterruptedException {
        btnExportar.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, -200)");
        waitFor(5).second();
    }

}
