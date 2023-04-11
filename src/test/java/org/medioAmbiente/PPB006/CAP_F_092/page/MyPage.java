package org.medioAmbiente.PPB006.CAP_F_092.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/cambio-climatico/iniciativas-y-proyectos-nacionales-e-internacionales")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_8CKBYys0VzIL\"]//div[2]/div[1]/a")
    private WebElementFacade Apartado;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_8CKBYys0VzIL\"]//div[2]/div[2]/a")
    private WebElementFacade Apartado2;

    @FindBy(xpath = "//*[@id=\"collapseService1\"]/div[1]//a")
    private WebElementFacade Enlace;

    @FindBy(xpath = "//*[@id=\"collapseService1\"]/div[2]/figure/img")
    private WebElementFacade Imagen;

    @FindBy(xpath = "//*[@id=\"editContainerDialog\"]/button")
    private WebElementFacade Close_Imagen;

    public void visualizarCAPF109() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Apartado2.click();
        waitFor(1).second();
        Apartado2.click();
        waitFor(1).second();
        Apartado.click();
        Enlace.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.titleContains("Climate-KIC"));
        getDriver().navigate().back();
       // Apartado.click();
       // Imagen.click();
      //  Close_Imagen.click();
       // Apartado.click();
    }
}