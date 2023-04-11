package org.medioAmbiente.PPB002.CAP_F_002_04.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("/medioambiente/portal/home")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;

    @FindBy(xpath = "(//div[@class=\"slick-list draggable\"])[3]")
    private WebElementFacade carrusel_move;

    @FindBy(xpath = "(//h5[contains(text(),\"Sierra Mágina, el parque natural de los castillos medievales\")])[2]")
    private WebElementFacade noticia;

    @FindBy(xpath = "//button[@class=\"evr-btn evr-btn__secondary\"][1]")
    private WebElementFacade categorianoticia;

    @FindBy(xpath = "//a[@title=\"VER TODAS LAS NOVEDADES\"]")
    private WebElementFacade vertodo;

    @FindBy(xpath = "(//h1)[6]")
    private WebElementFacade textnoticia;



    public void deslizarnoticia() throws InterruptedException{

        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(carrusel_move,-400,0)
                .perform();
        waitFor(2).second();
        actions.dragAndDropBy(carrusel_move,400,0)
                .perform();
    }

    public void clickarNoticia()throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h5[contains(text(),\"Sierra Mágina, el parque natural de los castillos medievales\")])[2]")));
        noticia.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1)[6]")));
        String validacion = textnoticia.getText();
        if(validacion.contains("Sierra Mágina, el parque natural de los castillos medievales")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("Informacion no valida");
        }
        getDriver().navigate().back();
    }


    public void clickarTodos()throws InterruptedException {
        vertodo.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),'Noticias y destacados')])[2]")));
    }
}
