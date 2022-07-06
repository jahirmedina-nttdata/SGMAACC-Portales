package org.medioAmbiente.ppb001.testCasesFamily001.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/buscador-de-espacios-naturales-y-equipamientos?categoryVal=")


public class Page extends PageObject {

    @FindBy(xpath = "//*[@id='mCSB_1_dragger_vertical']")
    private WebElementFacade scrollAceptarCookies;

    @FindBy(xpath = "//*[@id='accept-cookies']")
    private WebElementFacade btnAceptarCookies;

    @FindBy(xpath = "//*[@id=\"evr-formFilters\"]/fieldset/div/div[7]/button[1]")
    private WebElementFacade btnLimpiar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_v7hnFbl8Yg4X_searchButton\"]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//input[@id=\"_AssetSearchPlugin_INSTANCE_v7hnFbl8Yg4X_searchTextInput\"][@title=\"Buscar por palabras\"]")
    private WebElementFacade txtBusquedaPorPalabra;

    @FindBy(xpath = "//span[@id=\"_AssetSearchPlugin_INSTANCE_v7hnFbl8Yg4X_category0-button\"]")
    private WebElementFacade dropDownMenuEspaciosNaturales;

    @FindAll(@FindBy(xpath = "//ul[@id=\"_AssetSearchPlugin_INSTANCE_v7hnFbl8Yg4X_category0-menu\"]//li[@class='ui-menu-item']//div[@class='ui-menu-item-wrapper']"))
    private List<WebElementFacade> dropDownElementsEspaciosNaturales;

    @FindBy(xpath = "//span[@id=\"_AssetSearchPlugin_INSTANCE_v7hnFbl8Yg4X_category1-button\"]")
    private WebElementFacade dropDownMenuProvincias;

    @FindAll(@FindBy(xpath = "//ul[@id=\"_AssetSearchPlugin_INSTANCE_v7hnFbl8Yg4X_category1-menu\"]//li[@class='ui-menu-item']//div[@class='ui-menu-item-wrapper']"))
    private List<WebElementFacade> dropDownElementsProvincias;

    @FindBy(xpath = "//div[@id=\"_AssetSearchPlugin_INSTANCE_v7hnFbl8Yg4X_category2_multiSelect\"]")
    private WebElementFacade dropDownMenuTipoEquipamento;

    @FindAll(@FindBy(xpath = "//div[@id=\"_AssetSearchPlugin_INSTANCE_v7hnFbl8Yg4X_category2_itemList\"]//ul//li[@style=\"display: block;\"]"))
    private List<WebElementFacade> dropDownElementsTipoEquipamento;

    @FindBy(xpath = "//div[@id=\"_AssetSearchPlugin_INSTANCE_v7hnFbl8Yg4X_category2_itemList\"]/div/button[2]")
    private WebElementFacade dropDownBtnTipoEquipamentoAplicar;

    @FindBy(xpath = "//div[@class=\"evr-search-map__flex-wrap\"]//input[@id=\"check\"][@class=\"evr-search-map__checkbox\"]")
    private WebElementFacade checkBoxAccesible;

    @FindBy(xpath = "//div[@class=\"form-group input-select-wrapper\"]//span[@id=\"_AssetSearchPlugin_INSTANCE_v7hnFbl8Yg4X_espaciosNaturales-button\"]")
    private WebElementFacade dropDownMenuNombreEspacioNatural;

    @FindAll(@FindBy(xpath = "//div[@class=\"ui-selectmenu-menu ui-front ui-selectmenu-open\"]//ul[@id=\"_AssetSearchPlugin_INSTANCE_v7hnFbl8Yg4X_espaciosNaturales-menu\"]/li"))
    private List<WebElementFacade> dropDownElementsNombreEspacioNatural;

    public void interacturaScrollAceptarCookies() throws InterruptedException {
        scrollAceptarCookies.click();
    }

    public void aceptarCookies() throws InterruptedException {
        btnAceptarCookies.click();
    }

    public void clickLimpiarCampos() throws InterruptedException {
        btnLimpiar.waitUntilClickable();
        btnLimpiar.click();
    }

    public void clickBuscar() throws InterruptedException {
        btnBuscar.click();
    }

    public void escribirBusquedaPorPalabra(String entradaTexto) throws InterruptedException {
        txtBusquedaPorPalabra.waitUntilClickable();
        txtBusquedaPorPalabra.click();
        txtBusquedaPorPalabra.waitUntilEnabled();
        txtBusquedaPorPalabra.clear();
        txtBusquedaPorPalabra.sendKeys(entradaTexto + Keys.ENTER);
    }

    public void clickDropDownMenuEspaciosNaturales(String entradaTexto) throws InterruptedException {
        dropDownMenuEspaciosNaturales.click();

        for(int ii = 0; ii < dropDownElementsEspaciosNaturales.size(); ii ++){
            WebElementFacade currentElement = dropDownElementsEspaciosNaturales.get(ii);
            if(entradaTexto.equals(currentElement.getAttribute("innerText"))){
                currentElement.click();
                break;
            }
        }
    }

    public void clickDropDownProvincias(String entradaTexto) throws InterruptedException {
        dropDownMenuProvincias.click();

        for(int ii = 0; ii < dropDownElementsProvincias.size(); ii ++){
            WebElementFacade currentElement = dropDownElementsProvincias.get(ii);
            if(entradaTexto.equals(currentElement.getAttribute("innerText"))){
                currentElement.click();
                break;
            }
        }
    }

    public void clickDropDownMenuTipoEquipamento(String entradaTexto) throws InterruptedException {
        dropDownMenuTipoEquipamento.click();

        List<String> tipoDeEquipamentoTag = Arrays.asList(entradaTexto.split(":"));

        for(int ii = 0; ii < dropDownElementsTipoEquipamento.size(); ii ++){
            WebElementFacade currentElement = dropDownElementsTipoEquipamento.get(ii);
            if(tipoDeEquipamentoTag.contains(currentElement.getAttribute("innerText"))){
                currentElement.click();
            }
        }

        dropDownBtnTipoEquipamentoAplicar.click();
    }

    public void clickCheckBoxAccesible() throws InterruptedException {
        System.out.println(checkBoxAccesible.getAttribute("innerText"));
        checkBoxAccesible.waitUntilClickable();
        checkBoxAccesible.click();
    }

    public void clickDropDownMenuNombreEspacioNatural(String entradaTexto) throws InterruptedException {
        dropDownMenuNombreEspacioNatural.click();

        for(int ii = 0; ii < dropDownElementsNombreEspacioNatural.size(); ii ++){
            WebElementFacade currentElement = dropDownElementsNombreEspacioNatural.get(ii);
            if(entradaTexto.equals(currentElement.getAttribute("innerText"))){
                currentElement.click();
                break;
            }
        }
    }

}
