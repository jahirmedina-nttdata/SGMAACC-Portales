package org.medioAmbiente.PPB002.CAP_F_103.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/home")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;
    @FindBy(xpath = "(//li//span[contains(text(),'SERVICIOS')])[1]")
    private WebElementFacade Servicios;

    @FindBy(xpath = "(//li//span[contains(text(),'BIBLIOTECA, PUBLICACIONES Y MULTIMEDIA')])[1]")
    private WebElementFacade Biblioteca_Publicaciones;

    @FindBy(xpath = "//a[@title=\"Informes periódicos\"]")
    private WebElementFacade Informes_Periodicos;

    @FindBy(xpath = "//a[@title=\"Informe de Medio Ambiente en Andalucía\"]")
    private WebElementFacade Informe_MA;

    @FindBy(xpath = "//a[@title=\"Informe de Medio Ambiente en Andalucía 2020\"]")
    private WebElementFacade Informe_MA2020;

    @FindBy(xpath = "(//div[@data-placement=\"bottom\"]/a/img)[1]")
    private WebElementFacade Descargar_PDF;

    @FindBy(xpath = "(//div/a[@href=\"/medioambiente/portal/documents/20151/35851693/iMA2020.pdf/48eb86ad-576e-36c0-c576-af2583974201?t=1643201915257\"]/img)[1]")
    private WebElementFacade Descargar;
    public void posicionarServicios() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Servicios)
                .perform();
    }

    public void clickarBlibliotecaPublicacionesyMultimedia()throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Biblioteca_Publicaciones)
                .perform();
        Biblioteca_Publicaciones.click();
    }

    public void clickarInformesPeriodicos()throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1)[6]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 350)");
        Informes_Periodicos.click();
    }

    public void clickarInformeMA()throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1)[6]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 350)");
        Informe_MA.click();
    }

    public void clickarInformeMA2020()throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1)[6]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 600)");
        Informe_MA2020.click();
    }

    public void clickarDescargarPDF()throws InterruptedException {
        WebElement Element = getDriver().findElement(By.xpath("//*[contains(text(),'gustaría')]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);

        Actions actions = new Actions(getDriver());
        actions.moveToElement(Descargar_PDF)
                .perform();

        Descargar.click();
        waitFor(10).second();
    }

}
