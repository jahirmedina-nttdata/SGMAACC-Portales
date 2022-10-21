package org.medioAmbiente.PPB003.CAP_F_106.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"layout_56\"]")
    private WebElementFacade Menu;

    @FindBy(xpath = "//*[@id=\"layout_60\"]/a")
    private WebElementFacade SubMenu;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_pagination\"]/li[6]/a")
    private WebElementFacade Paginador;

    public void accederEspaciosNaturales() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Menu)
                .perform();
        actions.moveToElement(SubMenu)
                .perform();
        SubMenu.click();
    }

    public void Visualizar_Paginador() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_pagination\"]/li[6]/a")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
    }

    public void seleccionarPaginador() throws InterruptedException {
        Paginador.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Resultados')]")));
    }
}
