package org.medioAmbiente.PPB001.CAP_F_107.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/publicaciones?categoryVal=")


public class MyPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_pagination\"]/li[11]/a")
    private WebElementFacade Paginador;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_pagination\"]/li[11]/a")
    private WebElementFacade Ultima_Pagina;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_pagination\"]/li[12]/a")
    private WebElementFacade Siguiente;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_pagination\"]/li[1]/a")
    private WebElementFacade Anterior;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_pagination\"]/li[2]/a")
    private WebElementFacade Primera_Pagina;

    public void seleccionarPaginador() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Paginador.click();
    }

    public void clickarSiguientePag() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Siguiente.click();
    }

    public void clickarSiguienteUltimaPag() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Ultima_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Ultima_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Ultima_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Ultima_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Ultima_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Ultima_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Ultima_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Ultima_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Ultima_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Ultima_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Ultima_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Ultima_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Ultima_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Ultima_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Ultima_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Siguiente.click();
    }

    public void clickarAnterior() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Anterior.click();

    }

    public void clickarAnteriorPrimeraPag() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Primera_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Primera_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Primera_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Primera_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Primera_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Primera_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Primera_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Primera_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Primera_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Primera_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Primera_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Primera_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Primera_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Primera_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Primera_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Primera_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Primera_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Primera_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Primera_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Primera_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]//table/tbody/tr[1]")));
        Anterior.click();
    }

}
