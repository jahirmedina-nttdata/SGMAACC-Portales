package org.medioAmbiente.PPB002.CAP_F_002_03.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/home")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;

    public static WebDriver driver;



    @FindBy(xpath = "//*[contains(text(),'Espacios Protegidos')][1]")
    private WebElementFacade btnbiodiversidad;

    @FindBy(xpath = "//*[contains(text(),'Atmósfera')][1]")
    private WebElementFacade carrusel;

    @FindBy(xpath = "//*[contains(text(),'Atmósfera')][1]")
    private WebElementFacade carrusel_move;




    public void ubicarCarrusel() throws InterruptedException {
        waitFor(4).second();
    }

    public void clickarGeodiversidad() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Espacios Protegidos')][1]")));
        btnbiodiversidad.click();
    }

    public void deslizarElemento() throws InterruptedException{
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Atmósfera')][1]")));
        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(carrusel_move,-400,0)
                .perform();
        Thread.sleep(1000);
        actions.dragAndDropBy(carrusel_move,400,0)
                .perform();
    }

    public void clickarElemento()throws InterruptedException {
        carrusel.click();
    }
}
