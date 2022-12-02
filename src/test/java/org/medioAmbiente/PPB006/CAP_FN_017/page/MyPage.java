package org.medioAmbiente.PPB006.CAP_FN_017.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("/medioambiente/portal/web/cambio-climatico/causas")


public class MyPage extends PageObject {

    private String prntw;
    private String popwnd;
    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_lQeVQ3Vak808\"]//div[2]//div/div[3]/div[1]/a")
    private WebElementFacade Apartado;


    public void visualizarCAPFN007()  throws InterruptedException{
            Apartado.click();
            Apartado.click();
    }
}