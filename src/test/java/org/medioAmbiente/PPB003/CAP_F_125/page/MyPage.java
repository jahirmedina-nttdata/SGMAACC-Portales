package org.medioAmbiente.PPB003.CAP_F_125.page;


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

    public void pulsarActividadBuceo() throws InterruptedException {

    }


    public void visualizarCarrusel() throws InterruptedException {


    }

    public void pulsarPausarCarrusel() throws InterruptedException {


    }

    public void pulsarReanudarCarrusel() throws InterruptedException {

    }

    public void pulsarAnteriorImagen() throws InterruptedException {

    }

    public void deslizarCarruselalaDerecha() throws InterruptedException {

    }

    public void pulsarSiguienteImagen() throws InterruptedException {

    }

    public void deslizarCarruselalaIzquierda() throws InterruptedException {

    }

    public void pulsarIrAlaPrimeraImagen() throws InterruptedException {

    }

    public void pulsarIrAlaUltimaImagen() throws InterruptedException {

    }

}
