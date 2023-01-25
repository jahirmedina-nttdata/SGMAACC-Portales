package org.medioAmbiente.PPB001.CAP_F_014.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import java.net.URI;
import java.net.URISyntaxException;


@DefaultUrl("/medioambiente/portal/buscador-audios")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_8PWoVRSqGtFp_searchTextInput\"]")
    private WebElementFacade Buscador_Especifico;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_RBLh8ZKfwq6q_searchTextInput\"]")
    private WebElementFacade Buscador_Texto_Video;

    @FindBy(xpath = "//label[@class=\"evr-form-search__more-filter\"]")
    private WebElementFacade Apartado_Avanzada;

    @FindBy(xpath = "//*[@id=\"evr-formFilters\"]/div[2]/div[2]/label")
    private WebElementFacade Busqueda_Avanzada;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_8PWoVRSqGtFp_startDate\"]")
    private WebElementFacade Fecha;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_RBLh8ZKfwq6q_startDate\"]")
    private WebElementFacade Fecha_Video;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_8PWoVRSqGtFp_searchButton\"]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_RBLh8ZKfwq6q_searchButton\"]")
    private WebElementFacade btnBuscar_Video;

    @FindBy(xpath = "//*[@id=\"evr-formFilters\"]/div[2]/button[2]/span")
    private WebElementFacade btnLimpiar;

    @FindBy(xpath = "//*[@id=\"evr-formFilters\"]/div[2]/button[2]/span")
    private WebElementFacade btnLimpiar_Video;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_8PWoVRSqGtFp_category0-button\"]")
    private WebElementFacade Lista_Tema;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_RBLh8ZKfwq6q_category0-button\"]")
    private WebElementFacade ListaTema_Video;

    @FindBy(xpath = "//div[contains(text(),'Biodiversidad')]")
    private WebElementFacade Tema;

    @FindBy(xpath = "//div[contains(text(),'Agua')]")
    private WebElementFacade Tema_Video;

    public void buscarImagenPorTexto() throws InterruptedException, URISyntaxException {
        getDriver().get(new URI(getDriver().getCurrentUrl()).resolve("/medioambiente/portal/buscador-imagenes").toString());
        Buscador_Especifico.sendKeys("Reserva" + "\n");
    }

    public void buscarImagenPorTema() throws InterruptedException {
        btnLimpiar.click();
        Busqueda_Avanzada.click();
        Lista_Tema.click();
        Tema.click();
        btnBuscar.click();
    }

    public void buscarImagenPorFecha() throws InterruptedException {
        btnLimpiar.click();
        Fecha.sendKeys("05/02/2021");
        btnBuscar.click();
    }

    public void buscarImagenPorFiltros() throws InterruptedException {
        btnLimpiar.click();
        Buscador_Especifico.sendKeys("Berreo de Ciervo");
        Fecha.sendKeys("01/02/2021");
        Lista_Tema.click();
        Tema.click();
        btnBuscar.click();
    }

    public void buscarVideoPorTexto() throws InterruptedException, URISyntaxException {
        getDriver().get(new URI(getDriver().getCurrentUrl()).resolve("/medioambiente/portal/buscador-videos").toString());
        Buscador_Texto_Video.sendKeys("Webinar");
        btnBuscar_Video.click();
    }

    public void buscarVideoPorTema() throws InterruptedException {
        btnLimpiar_Video.click();
        Apartado_Avanzada.click();
        ListaTema_Video.click();
        Tema_Video.click();
        btnBuscar_Video.click();
    }

    public void buscarVideoPorFecha() throws InterruptedException {
        btnLimpiar_Video.click();
        Fecha_Video.sendKeys("05/02/2021");
        btnBuscar_Video.click();
    }

    public void buscarVideoPorFiltros() throws InterruptedException {
        btnLimpiar_Video.click();
        Buscador_Texto_Video.sendKeys("Jornada");
        Fecha_Video.sendKeys("02/02/2021");
        ListaTema_Video.click();
        Tema_Video.click();
        btnBuscar_Video.click();
    }
}
