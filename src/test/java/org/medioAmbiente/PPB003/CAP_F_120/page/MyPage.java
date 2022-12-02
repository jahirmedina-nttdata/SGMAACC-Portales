package org.medioAmbiente.PPB003.CAP_F_120.page;


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

    @FindBy(xpath = "//span[@title=\"Seleccione un tipo de espacio\"]")
    private WebElementFacade SelectTipo_Espacio;

    @FindBy(xpath = "//div[contains(text(),'PARQUE NATURAL')]")
    private WebElementFacade Tipo_Espacio;

    @FindBy(xpath = "//span[@title=\"Seleccione un nombre de espacio\"]")
    private WebElementFacade SelectNombre_Espacio;

    @FindBy(xpath = "//div[contains(text(),'SIERRA DE ARACENA Y PICOS DE AROCHE')]")
    private WebElementFacade Nombre_Espacio;

    @FindBy(xpath = "//button/span[contains(text(),'Buscar')]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//button/span[contains(text(),'Limpiar')]")
    private WebElementFacade btnLimpiar;

    @FindBy(xpath = "//span[@class=\"evr-article-collage-map__title\"]")
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

    public void seleccionarParqueNatural() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title=\"Seleccione un tipo de espacio\"]")));
        SelectTipo_Espacio.click();
        Tipo_Espacio.click();
    }

    public void seleccionarSierradeAracenayPicosdeAroche() throws InterruptedException {
        SelectNombre_Espacio.waitUntilClickable();
        SelectNombre_Espacio.click();
        Nombre_Espacio.click();
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
        if(validacion.equals("SIERRA DE ARACENA Y PICOS DE AROCHE")) {
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
