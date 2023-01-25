package org.medioAmbiente.PPB002.CAP_F_007.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/guest/actualidad/participa-y-colabora")


public class MyPage extends PageObject {

    @FindBy(xpath = "//button[@aria-label=\"Next\"]")
    private WebElementFacade Siguiente_Imagen;

    @FindBy(xpath = "//button[@aria-label=\"Previous\"]")
    private WebElementFacade Anterior_Imagen;

    @FindBy(xpath = "//button[contains(text(),'1')]")
    private WebElementFacade Bullet;

    @FindBy(xpath = "//button[contains(text(),'2')]")
    private WebElementFacade Bullet_2;

    @FindBy(xpath = "(//a[@title=\"Voluntarios para la recuperación del terreno afectado tras el incendio de Moguer (Huelva)\"])[2]")
    private WebElementFacade Enlace;



    public void clickarFlechaSiguiente() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Siguiente_Imagen.click();
    }

    public void clickarFlechaAnterior() throws InterruptedException {
        Anterior_Imagen.click();
    }

    public void clickarBullet() throws InterruptedException{
        Bullet.click();
        waitFor(1).second();
        Bullet_2.click();
    }

    public void clickarEnlace() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title=\"Voluntarios para la recuperación del terreno afectado tras el incendio de Moguer (Huelva)\"])[2]")));
        Enlace.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@id=\"evr-menu-block__title-principal\"]")));
    }
}
