package org.medioAmbiente.PPB003.CAP_F_028.page;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;



@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/do-c3-b1ana-18/255035")


public class MyPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_Jlbxh2qB3NwR_5757911\"]//div[2]/section[1]//div[1]/div/h2/a")
    private WebElementFacade Disfruta_Playas;

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_WpxxCbdlbsGU_5754251\"]//section//div[1]/p/span")
    private WebElementFacade Validar_Ficha;


    public void desplazarAlApartado() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 1000)");
        j.executeScript("window.scrollBy(0, 1000)");
    }

    public void clickarFicha() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Disfruta_Playas.click();
    }

    public void validarFicha() throws InterruptedException  {

        String validar = Validar_Ficha.getText();
        if(validar.equals("Disfrutar de Sus Playas")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Ficha");
        }
    }
}
