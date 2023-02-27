package org.medioAmbiente.PPB006.CAP_F_019.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/web/cambio-climatico/efectos-e-impactos")


public class MyPage extends PageObject {

    private String prntw;
    private String popwnd;
    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_YWwsgummGP4O\"]//div[2]//div/div[3]/div[1]/a")
    private WebElementFacade Apartado;


    @FindBy(xpath = "//*[@id=\"collapseService1\"]//a")
    private WebElementFacade Enlace;


    public void visualizarCAPF109() throws InterruptedException {
        Apartado.click();
        Enlace.click();
        getDriver().navigate().back();
        Apartado.click();
        Apartado.click();
    }
}