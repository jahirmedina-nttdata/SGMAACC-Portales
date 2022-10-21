package org.medioAmbiente.PPB002.CAP_F_002_09.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/home")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;

    public static WebDriver driver;

    @FindBy(xpath = "//*[@id=\"tab-2\"]/span")
    private WebElementFacade btnmasbuscado;

    @FindBy(xpath = "//*[@id=\"card-cladt13-distributivaMasBuscado2\"]//p")
    private WebElementFacade btnservicio;



    public void clickarMasBuscado() throws InterruptedException {
        btnmasbuscado.click();
    }

    public void clickarServicios() throws InterruptedException{
        btnservicio.click();
    }

}
