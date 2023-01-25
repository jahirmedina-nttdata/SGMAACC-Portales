package org.medioAmbiente.PPB003.CAP_F_078.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/espacio-personal")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade Usuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade Password;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_ReTFpDg2eNvQ\"]//div[1]/div/figure/a")
    private WebElementFacade Planifica_Visitas;

    @FindBy(xpath = "(//a[@title=\"Editar visita\"]//img)[1]")
    private WebElementFacade Eliminar_Visita;

    @FindBy(xpath = "//*[@id=\"_visitasmodule_INSTANCE_61L1Y8gTGInZ_editar-58472162\"]")
    private WebElementFacade Cancelar_Eliminacion;

    @FindBy(xpath = "//*[@id=\"_visitasmodule_INSTANCE_61L1Y8gTGInZ_editar-58472162\"]")
    private WebElementFacade Aceptar_Eliminacion;

    @FindBy(xpath = "//button[text()=\"Eliminar\"]")
    private WebElementFacade btnEliminar;

    @FindBy(xpath = "//span[@class=\"evr-article-collage-map__title\"]")
    private WebElementFacade Validar_Eliminacion;

    @FindBy(xpath = "//input[@id=\"_visitasmodule_INSTANCE_61L1Y8gTGInZ_title\"]")
    private WebElementFacade Visita;


    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'cmaot_testing testing')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Actions action = new Actions(getDriver());
        action.moveToElement(Planifica_Visitas).click().perform();
    }

    public void clikarEliminarVisita() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        Eliminar_Visita.waitUntilClickable();
        Actions action = new Actions(getDriver());
        action.moveToElement(Eliminar_Visita).click().perform();
    }

    public void clickarCancelar() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Edita tu visita')]")));
        Actions action = new Actions(getDriver());
        action.moveToElement(btnEliminar).click().perform();
        Alert alert = getDriver().switchTo().alert();
        alert.dismiss();
    }

    public void clickarAceptar() throws InterruptedException {
        btnEliminar.waitUntilClickable();
        String validar = Visita.getText();
        Actions action = new Actions(getDriver());
        action.moveToElement(btnEliminar).click().perform();
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
        if (validar == Validar_Eliminacion.getText()) {
            Assert.fail("No fue eliminado");
        } else {
            Assert.assertTrue(true);
        }
    }

}
