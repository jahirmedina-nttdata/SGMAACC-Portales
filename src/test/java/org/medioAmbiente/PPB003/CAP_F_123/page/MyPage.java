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

import java.util.Iterator;
import java.util.List;
import java.util.Set;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;
    @FindBy(xpath = "//*[@id=\"layout_18\"]")
    private WebElementFacade Menu;

    @FindBy(xpath = "(//input[@title=\"Buscar\"])[2]")
    private WebElementFacade buscarTexto;

    @FindBy(xpath = "//button/span[contains(text(),'Buscar')]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "(//span[contains(text(),'Formato PDF')])[1]")
    private WebElementFacade Ver_PDF;

    @FindBy(xpath = "(//tr[3]//p[@class=\"evr-table-simple__thumb-txt\"])[1]")
    private WebElementFacade Validar_Resultado;


    public void seleccionarMenuPublicaciones() throws InterruptedException {
        Menu.click();
    }


    public void buscarPorTexto() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@title=\"Buscar\"])[2]")));
        buscarTexto.sendKeys("Sierra de Aracena");
    }


    public void pulsarBuscar() throws InterruptedException {
        btnBuscar.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Resultados')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");

    }

    public void validarBusqueda() throws InterruptedException {
        List<WebElement> lista = getDriver().findElements(By.xpath("//div[@class=\"evr-table-simple\"]"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Lista");
        }

        String validacion = Validar_Resultado.getText();
        if(validacion.contains("Sierra de Aracena")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("Informacion valida");
        }

    }

    public void pulsarFormatoPDF() throws InterruptedException {
        Ver_PDF.click();
        Set<String> wnd = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        prntw = i.next();
        popwnd = i.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        waitFor(9).second();
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);
    }

}
