package org.medioAmbiente.PPB004.CAP_FC_010.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/caza-y-pesca/")



public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"slick-slide01\"]")
    private WebElementFacade anuncio;

    @FindBy(xpath = "//*[@id=\"slick-slide03\"]")
    private WebElementFacade anuncio2;

    @FindBy(xpath = "//*[@id=\"slick-slide00\"]")
    private WebElementFacade Puntero;

    @FindBy(xpath = "//*[@id=\"slick-slide-control00\"]")
    private WebElementFacade Bullets;

    @FindBy(xpath = "//*[@id=\"slick-slide02\"]/div[1]/a")
    private WebElementFacade Detalle_Anuncio;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_WhzMUAwWgzEi\"]//div[2]//a")
    private WebElementFacade btn_Vermas;
    public void moverIzquierda() throws InterruptedException{
        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(anuncio,300,0)
             .perform();
    }

    public void moverDerecha() throws InterruptedException{
        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(anuncio,-300,0)
                .perform();
    }

    public void clickarBullets() throws InterruptedException{
        Bullets.click();
    }

    public void puntearCard() throws InterruptedException{
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Puntero)
                .perform();
    }
    public void clickarAnuncio() throws InterruptedException{
        Detalle_Anuncio.click();
    }

    public void puntearVertodo() throws InterruptedException{
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btn_Vermas)
                .perform();
    }

    public void clickarVertodo()throws InterruptedException {
        btn_Vermas.click();
    }


}
