package org.medioAmbiente.PPB002.CAP_F_002.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/home")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;

    public static WebDriver driver;
    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_UrW3Fsd7dldJ_searchTextInputMinimize\"]")
    private WebElementFacade txtbuscador;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_UrW3Fsd7dldJ_searchTextInputMinimize\"]")
    private WebElementFacade txttema;

    @FindBy(xpath = "//*[@id=\"slick-slide32\"]/a/figure/img")
    private WebElementFacade btnelement;

    @FindBy(xpath = "//*[@id=\"tab-2\"]/span")
    private WebElementFacade btnmasbuscado;

    @FindBy(xpath = "//*[@id=\"tab-1\"]")
    private WebElementFacade btnultimo;

    @FindBy(xpath = "//*[@id=\"card-cladt13-distributivaLoUltimo3\"]/a/p")
    private WebElementFacade btnplanf;

    @FindBy(xpath = "//*[@id=\"_com_liferay_site_navigation_breadcrumb_web_portlet_SiteNavigationBreadcrumbPortlet_breadcrumbs-defaultScreen\"]//a")
    private WebElementFacade btninicioLU;

    @FindBy(xpath = "//*[@id=\"btn-cladt13-distributivaLoUltimo\"]/button")
    private WebElementFacade btnvermas;

    @FindBy(xpath = "//*[@id=\"tab-3\"]/span")
    private WebElementFacade btnmasvalorado;

    @FindBy(xpath = "//*[@id=\"card-cladt13-distributivaMasValorado0\"]/a/p")
    private WebElementFacade btngestorresiduo;

    @FindBy(xpath = "//*[@id=\"card-cladt13-distributivaMasBuscado2\"]//p")
    private WebElementFacade btnservicio;

    @FindBy(xpath = "//*[contains(text(),'Espacios Protegidos')][1]")
    private WebElementFacade btnbiodiversidad;

    @FindBy(xpath = "//*[contains(text(),'Atmósfera')][1]")
    private WebElementFacade carrusel;

    @FindBy(xpath = "//*[contains(text(),'Atmósfera')][1]")
    private WebElementFacade carrusel_move;

    @FindBy(xpath = "//*[@id=\"slick-slide23\"]/div/a/h5")
    private WebElementFacade noticia;

    @FindBy(xpath = "//button[@class=\"evr-btn evr-btn__secondary\"][1]")
    private WebElementFacade categorianoticia;

    @FindBy(xpath = "//button[@class=\"evr-btn evr-btn__secondary\"]")
    private WebElementFacade vertodo;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_eKAK0hUFAay8_searchTextInputMinimize\"]")
    private WebElementFacade textnoticia;
    public void clickBuscador() throws InterruptedException {
        txtbuscador.click();

    }

    public void escribimosenelBuscador(String tema) throws InterruptedException {
    txttema.sendKeys(tema+ "\n");

    }


    public void clickarVentanaVisitante()throws InterruptedException {

        btnelement.click();
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

    public void clickarMasBuscado() throws InterruptedException {
        btnmasbuscado.click();
    }

    public void clickarLoUltimo() throws InterruptedException{
         btnultimo.click();
    }

    public void clickarPlanForestal() throws InterruptedException{
        btnplanf.click();
    }

    public void clickarInicioLU()throws InterruptedException{
        btninicioLU.click();

    }

    public void clickarVerMas() throws InterruptedException {
        btnvermas.click();
    }

    public void clickarMasValorado() throws InterruptedException{
        btnmasvalorado.click();
    }

    public void clickarGestoresResiduos() throws InterruptedException{
        btngestorresiduo.click();
    }

    public void clickarServicios() throws InterruptedException{
        btnservicio.click();
    }

    public void ubicarCarrusel() throws InterruptedException {
        Thread.sleep(3000);
    }

    public void clickarGeodiversidad() throws InterruptedException {

      btnbiodiversidad.click();

    }

    public void deslizarElemento() throws InterruptedException{
        getDriver().navigate().back();
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


    public void deslizarnoticia() throws InterruptedException{
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

    public void clickarNoticia()throws InterruptedException {
        noticia.click();
    }

    public void clickarcategoria()throws InterruptedException {
        categorianoticia.click();
        textnoticia.sendKeys("El Consejo de Gobierno" + "\n");
        getDriver().navigate().back();
    }

    public void clickarTodos()throws InterruptedException {
        vertodo.click();
    }


}
