package org.medioAmbiente.PPB007.CAP_F_040.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;

@DefaultUrl("/medioambiente/portal/web/cae")


public class MyPage extends PageObject {

    @FindBy(xpath = "(//a[@title=\"Trámites de Medio Ambiente\"])[1]")
    private WebElementFacade Elemento;

    @FindBy(xpath = "//a[@title=\"Notific@\"]")
    private WebElementFacade Enlace;

    @FindBy(xpath = "(//a[@title=\"Calendario días inhábiles\"])[1]")
    private WebElementFacade TextoFlotante;

    @FindBy(xpath = "//a[@title=\"Carpeta ciudadana\"]")
    private WebElementFacade btnCarpetaCiudadana;

    private String prntw;
    private String popwnd;
    public void visualizarElementos() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 750)");
        waitFor(1).second();
    }

    public void posicionarPunteroEnElemento() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Elemento)
                .perform();
    }

    public void clickarEnlace() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Enlace).click().perform();
        Set<String> wnd = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        prntw = i.next();
        popwnd = i.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);
    }

    public void mostrarTextoFlotante() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(TextoFlotante)
                .perform();
        String textflotante = TextoFlotante.getAttribute("title");

        if(textflotante.equals("Calendario días inhábiles")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }

    public void posicionarPunteroEnBotonCarpetaCiudadana() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnCarpetaCiudadana)
                .perform();
        waitFor(1).second();
    }

    public void clickarBotonCarpetaCiudadana() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnCarpetaCiudadana).click().perform();
        Set<String> wnd = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        prntw = i.next();
        popwnd = i.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);
    }

}
