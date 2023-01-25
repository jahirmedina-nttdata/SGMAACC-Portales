package org.medioAmbiente.PPB002.CAP_F_090.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/home")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;
    @FindBy(xpath = "(//li[@class=\"evr-main-navigation__portal-item dropdown\"])[2]")
    private WebElementFacade Actualidad;

    @FindBy(xpath = "(//span[contains(text(),'NOTICIAS Y DESTACADOS')])[1]")
    private WebElementFacade Noticias_Destacados;

    @FindBy(xpath = "(//h1)[6]")
    private WebElementFacade Validar_Pagina;


    public void posicionarSobreMenu() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Actualidad)
                .perform();
    }

    public void pulsarSubmenu()throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Noticias_Destacados)
                .perform();
        Noticias_Destacados.click();
    }

    public void validarNavegacion()throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),'Noticias y destacados')])[2]")));

        String validacion = Validar_Pagina.getText();
        if(validacion.equals("Noticias y destacados")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("Pagina incorrecta");
        }
    }
}
