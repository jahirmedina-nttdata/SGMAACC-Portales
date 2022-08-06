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

        Set<String> wnd = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        prntw = i.next();
        popwnd = i.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana " + getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);
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
        Thread.sleep(6000);

    }

    @net.thucydides.core.annotations.Step
    public void ubicarCarrusel() throws InterruptedException {

        Thread.sleep(5000);

    }

    @net.thucydides.core.annotations.Step
    public void clickarGeodiversidad() throws InterruptedException {

        page.clickarGeodiversidad();
    }

    @net.thucydides.core.annotations.Step
    public void deslizarElemento() throws InterruptedException {
        //Derecha
        WebElement draggable = getDriver().findElement(By.xpath("//*[@id=\"slick-slide00\"]/a"));
        WebElement droppable = getDriver().findElement(By.xpath("//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_JfWXEDxiD5s5\"]//div[2]/button[2]"));
        new Actions(getDriver())
                .dragAndDrop(draggable, droppable)
                .perform();
        Thread.sleep(2000);
        //Izquierda
        WebElement draggable1 = getDriver().findElement(By.xpath("//*[@id=\"slick-slide01\"]/a"));
        WebElement droppable1 = getDriver().findElement(By.xpath("//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_JfWXEDxiD5s5\"]//div[2]/button[1]"));

        new Actions(getDriver())
                .dragAndDrop(draggable1, droppable1)
                .perform();
        Thread.sleep(2000);
    }

    @net.thucydides.core.annotations.Step
    public void clickarElemento() throws InterruptedException {
        page.clickarElemento();
    }

    @net.thucydides.core.annotations.Step
    public void ubicarNoticia() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 350)");

    }

    @net.thucydides.core.annotations.Step
    public void deslizarnoticia() throws InterruptedException {

        WebElement draggable = getDriver().findElement(By.xpath("//*[@id=\"slick-slide21\"]//div[2]"));
        WebElement droppable = getDriver().findElement(By.xpath("//*[@id=\"slick-slide22\"]/figure/img"));


        new Actions(getDriver())
                .dragAndDrop(draggable, droppable)
                .perform();
        //Izquierda
        WebElement draggable1 = getDriver().findElement(By.xpath("//*[@id=\"slick-slide24\"]//div[2]"));
        WebElement droppable1 = getDriver().findElement(By.xpath("//*[@id=\"slick-slide23\"]/figure/img"));

        new Actions(getDriver())
                .dragAndDrop(draggable1, droppable1)
                .perform();


    }

    @net.thucydides.core.annotations.Step
    public void clickarNoticia() throws InterruptedException{
        page.clickarNoticia();
        Thread.sleep(3000);

    }

    @net.thucydides.core.annotations.Step
    public void clickarCategoriaNoti() throws InterruptedException{
        page.clickarcategoria();
        Thread.sleep(2000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void clickarTodos() throws InterruptedException{
        page.clickarTodos();
        Thread.sleep(2000);

    }
}