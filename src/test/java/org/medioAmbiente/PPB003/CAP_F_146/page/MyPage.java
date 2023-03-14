package org.medioAmbiente.PPB003.CAP_F_146.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/galería-multimedia?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_searchButton\"]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_category2-button\"]")
    private WebElementFacade Tipo_Equipamiento;

    @FindBy(xpath = "//div[contains(text(),'ÁREA RECREATIVA')]")
    private WebElementFacade Area_Recreativa;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_pagination\"]/li[6]/a")
    private WebElementFacade Pagina_5;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_pagination\"]/li[10]/a")
    private WebElementFacade Ultima_Pagina;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_pagination\"]/li[11]/a")
    private WebElementFacade Siguiente;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_pagination\"]/li[1]/a")
    private WebElementFacade Anterior;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_pagination\"]/li[2]/a")
    private WebElementFacade Primera_Pagina;

    public void seleccionarPaginador5() throws InterruptedException {
        Tipo_Equipamiento.click();
        Area_Recreativa.click();
        btnBuscar.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"reflex-grid\"])[2]")));
        Pagina_5.click();
    }

    public void clickarSiguientePag() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"reflex-grid\"])[2]")));
        Siguiente.click();
    }

    public void clickarSiguienteUltimaPag() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"reflex-grid\"])[2]")));
        Ultima_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"reflex-grid\"])[2]")));
        Siguiente.click();
    }

    public void clickarAnterior() throws InterruptedException {
        Anterior.click();
    }

    public void clickarAnteriorPrimeraPag() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"reflex-grid\"])[2]")));
        Primera_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"reflex-grid\"])[2]")));
        Anterior.click();
    }

}
