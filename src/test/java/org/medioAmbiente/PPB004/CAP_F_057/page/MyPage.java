package org.medioAmbiente.PPB004.CAP_F_057.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/caza-y-pesca/")



public class MyPage extends PageObject {

    @FindBy(xpath = "(//div[@class=\"slick-list draggable\"])[2]")
    private WebElementFacade anuncio;

    @FindBy(xpath = "//*[@id=\"slick-slide03\"]")
    private WebElementFacade anuncio2;

    @FindBy(xpath = "(//a[contains(text(),'Publicada en BOJA la resolución')])[3]")
    private WebElementFacade Puntero;

    @FindBy(xpath = "//button[contains(text(),'4')]")
    private WebElementFacade Bullets;

    @FindBy(xpath = "(//a[contains(text(),'Publicada en BOJA la resolución')])[3]")
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
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Publicada en BOJA la resolución')])[3]")));
        Detalle_Anuncio.click();
        getDriver().navigate().back();
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
