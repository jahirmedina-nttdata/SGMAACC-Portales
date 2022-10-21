package org.medioAmbiente.PPB003.CAP_F_029.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/do-c3-b1ana-18/255035")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_Jlbxh2qB3NwR_5757911\"]//div[3]/a/button")
    private WebElementFacade Descarga_Archivo;


    public void visualizarDescargas() throws InterruptedException {
        WebElement Element = getDriver().findElement(By.xpath("//span[contains(text(),'DESCARGAS')]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
    }

    public void clickarDescarga() throws InterruptedException {
        Descarga_Archivo.click();
        waitFor(3).second();
    }
}
