package org.medioAmbiente.PPB002.CAP_F_002.step;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_002.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;


public class MyStep extends ScenarioSteps {

    private MyPage page;
    private String prntw;
    private String popwnd;
    //private String driver;
    public static WebDriver driver;

    @net.thucydides.core.annotations.Step
    public void cargandoNavegador() throws InterruptedException {
        page.open();
        getDriver().manage().window().maximize();
    }

    @net.thucydides.core.annotations.Step
    public void cargandoPortal() throws InterruptedException {
        page.open();
        getDriver().manage().window().maximize();

    }

    @net.thucydides.core.annotations.Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
        j.executeScript("window.scrollBy(0, 700)");
    }

    @net.thucydides.core.annotations.Step
    public void acceptCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
        j.executeScript("window.scrollBy(0, 100)");

    }

    @net.thucydides.core.annotations.Step
    public void clickBuscador() throws InterruptedException {
        page.clickBuscador();
    }

    @net.thucydides.core.annotations.Step
    public void escribimosenelBuscador(String tema) throws InterruptedException {
        page.escribimosenelBuscador(tema);
    }


    @net.thucydides.core.annotations.Step
    public void ubicarDirectoA() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
        j.executeScript("window.scrollBy(0, 900)");

    }

    @net.thucydides.core.annotations.Step
    public void clickarVentanaVisitante() throws InterruptedException {
        page.clickarVentanaVisitante();

    }

    @net.thucydides.core.annotations.Step
    public void accedemosalPortal() throws InterruptedException {
        page.open();
        getDriver().manage().window().maximize();
    }

    @net.thucydides.core.annotations.Step
    public void ubicarContenidoDestacado() throws InterruptedException {

        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
        j.executeScript("window.scrollBy(0, 700)");

    }

    @net.thucydides.core.annotations.Step
    public void clickarMasBuscado() throws InterruptedException {

        page.clickarMasBuscado();
    }

    @net.thucydides.core.annotations.Step
    public void clickarLoUltimo() throws InterruptedException {
        page.clickarLoUltimo();

    }

    @net.thucydides.core.annotations.Step
    public void clickarPlanForestal() throws InterruptedException {
        page.clickarPlanForestal();
    }

    @net.thucydides.core.annotations.Step
    public void clickarInicioLU() throws InterruptedException {
        page.clickarInicioLU();
    }

    @net.thucydides.core.annotations.Step
    public void clickarVerMas() throws InterruptedException {
        page.clickarVerMas();
    }

    @net.thucydides.core.annotations.Step
    public void clickarMasValorado() throws InterruptedException {
        page.clickarMasValorado();
    }

    @net.thucydides.core.annotations.Step
    public void clickarGestoresResiduos() throws InterruptedException {
        page.clickarGestoresResiduos();
    }

    @net.thucydides.core.annotations.Step
    public void clickarServicios() throws InterruptedException {
        page.clickarServicios();
    }

    @net.thucydides.core.annotations.Step
    public void filtracionBusquedad() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 300)");
     }

    @net.thucydides.core.annotations.Step
    public void ubicarCarrusel() throws InterruptedException {
        page.ubicarCarrusel();
       }

    @net.thucydides.core.annotations.Step
    public void clickarGeodiversidad() throws InterruptedException {
        page.clickarGeodiversidad();
    }

    @net.thucydides.core.annotations.Step
    public void deslizarElemento() throws InterruptedException {
        page.deslizarElemento();
    }

    @net.thucydides.core.annotations.Step
    public void clickarElemento() throws InterruptedException {
        page.clickarElemento();
    }

    @net.thucydides.core.annotations.Step
    public void ubicarNoticia() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");

    }

    @net.thucydides.core.annotations.Step
    public void deslizarnoticia() throws InterruptedException {
        page.deslizarnoticia();

    }

    @net.thucydides.core.annotations.Step
    public void clickarNoticia() throws InterruptedException{
        page.clickarNoticia();
    }

    @net.thucydides.core.annotations.Step
    public void clickarCategoriaNoti() throws InterruptedException{
        page.clickarcategoria();
    }

    @net.thucydides.core.annotations.Step
    public void clickarTodos() throws InterruptedException{
        page.clickarTodos();

    }
}