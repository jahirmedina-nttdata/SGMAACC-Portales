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


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/home")


public class MyPage extends PageObject {

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

    public void clickarGeodiversidad() throws InterruptedException {

      btnbiodiversidad.click();

    }

    public void deslizarElemento() throws InterruptedException{
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

    public void clickarNoticia()throws InterruptedException {
        noticia.click();
    }

    public void clickarcategoria()throws InterruptedException {
        categorianoticia.click();
        textnoticia.sendKeys("El Consejo de Gobierno" + "\n");

    }

    public void clickarTodos()throws InterruptedException {
        vertodo.click();
    }


}
