package org.medioAmbiente.PPB003.CAP_F_067.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.List;
import java.util.Set;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/agenda-detalle/-/asset_publisher/8V5Nnbc5fv7a/content/turismo-de-estero.-motor-para-la-diversificaci-c3-b3n-empresarial/20151")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@class=\"jssocials-share-link evr-social-network__jssocials-share-link\"]/i")
    private WebElementFacade Activar;

    @FindBy(xpath = "//div[@class=\"jssocials-share jssocials-share-email\"]/a")
    private WebElementFacade Correo;

    @FindBy(xpath = "//div[@class=\"jssocials-share jssocials-share-facebook\"]/a")
    private WebElementFacade Facebook;

    @FindBy(xpath = "//div[@class=\"jssocials-share jssocials-share-twitter\"]/a")
    private WebElementFacade Twitter;

    @FindBy(xpath = "//div[@class=\"jssocials-share jssocials-share-pinterest\"]/a")
    private WebElementFacade Pinterest;

    private String prntw;
    private String popwnd;
    public void visualizarTitulo() throws InterruptedException {
        waitFor(1).second();
        List<WebElement> titulo = getDriver().findElements(By.xpath("//p[@class=\"evr-article-layout__title\"]"));
        if (titulo.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Titulo");
        }
    }

    public void visualizarTexto() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 850)");
        waitFor(1).second();
        List<WebElement> text = getDriver().findElements(By.xpath("//div[@class=\"evr-article-layout__paragraph evr-article-layout__description\"]"));
        if (text.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Texto");
        }
    }

    public void visualizarImagen() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, - document.body.scrollHeight)");
        List<WebElement> img = getDriver().findElements(By.xpath("//figure[@class=\"evr-article-layout__paragraph-fig\"]"));
        if (img.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Texto");
        }
    }

    public void visualizarCampoFecha() throws InterruptedException {
        List<WebElement> img = getDriver().findElements(By.xpath("//div[@class=\"evr-box-event__body\"]"));
        if (img.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Texto");
        }
    }


    public void compartirPorFacebook() throws InterruptedException {
        Facebook.click();
        Set<String> wnd = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        prntw = i.next();
        popwnd = i.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);
    }


    public void compartirPorTwitter() throws InterruptedException {
        Twitter.click();
        Set<String> wnd = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        prntw = i.next();
        popwnd = i.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);
    }

    public void compartirPorPinterest() throws InterruptedException {
        Activar.click();
        Pinterest.click();
        Set<String> wnd = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        prntw = i.next();
        popwnd = i.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);
    }


    public void compartirPorCorreo() throws InterruptedException {
        Correo.click();
        getDriver().close();
    }


}
