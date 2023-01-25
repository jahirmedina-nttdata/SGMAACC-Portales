package org.medioAmbiente.PPB002.CAP_F_024_01.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/guest/areas-tematicas/agua")


public class MyPage extends PageObject {

    @FindBy(xpath = "(//button[@aria-label=\"Previous\"])[2]")
    private WebElementFacade Flecha_Anterior;

    @FindBy(xpath = "(//div[@class=\"slick-list draggable\"])[2]")
    private WebElementFacade Deslizar;

    @FindBy(xpath = "//a[@title=\"SAID\"]")
    private WebElementFacade Posicionar_Puntero;

    @FindBy(xpath = "//a[@title=\"IMPRINTS\"]")
    private WebElementFacade Contenido;

    public void ubicarseEnPROYECTOSEUROPEOS() throws InterruptedException {
        WebElement Element = getDriver().findElement(By.xpath("//a[@title=\"Participación en la gestión del agua\"]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
    }

    public void deslizarComponente() throws InterruptedException {
        Flecha_Anterior.click();
        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(Deslizar,-300,0)
                .perform();
        waitFor(1).second();
        actions.dragAndDropBy(Deslizar,300,0)
                .perform();
    }

    public void posicionarPunteroEnTarjeta() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Posicionar_Puntero)
                .perform();
    }

    public void clickarTarjeta() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Contenido).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),'IMPRINTS')])[2]")));
    }
}
