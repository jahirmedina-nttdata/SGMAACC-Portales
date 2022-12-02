package org.medioAmbiente.PPB003.CAP_F_064.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/noticias-detalle/-/asset_publisher/pUmOGVAxEAjQ/content/el-milano-real-anida-en-c-c3-b3rdoba/20151")


public class MyPage extends PageObject {

    private String prntw;
    private String popwnd;
    @FindBy(xpath = "//*[@id=\"heading\"]/div[1]/div/div[1]/h1/a/img[1]")
    private WebElementFacade Logo_Junta;

    @FindBy(xpath = "//*[@id=\"heading\"]/div[1]/div/div[2]/h1/a/img[1]")
    private WebElementFacade Logo_Ventana;

    @FindBy(xpath = "//*[@id=\"layout_56\"]")
    private WebElementFacade Menu;

    @FindBy(xpath = "//*[@id=\"layout_67\"]")
    private WebElementFacade Submenu;

    @FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/div/div[1]/figure/a/img")
    private WebElementFacade Ventana_Visitante;

    @FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/div/div[1]/div/figure[1]/a/img")
    private WebElementFacade Twitter;

    @FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/div/div[1]/div/figure[2]/a/img")
    private WebElementFacade Facebook;

    @FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/div/div[1]/div/figure[3]/a/img")
    private WebElementFacade Instagram;

    @FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/div/div[1]/div/figure[4]/a/img")
    private WebElementFacade Pinterest;

    @FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/div/div[2]/figure[2]/a/img")
    private WebElementFacade Logo_Junta_footer;

    @FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/div/div[2]/figure[1]/a/img")
    private WebElementFacade Logo_Union;

    @FindBy(xpath = "//*[@id=\"footer\"]//p[1]/a")
    private WebElementFacade Conocenos;

    @FindBy(xpath = "//*[@id=\"footer\"]//p[7]/a")
    private WebElementFacade Contacto;

    @FindBy(xpath = "//*[@id=\"footer\"]//p[2]/a")
    private WebElementFacade Enlace_Interes;

    @FindBy(xpath = "//*[@id=\"footer\"]//p[3]/a")
    private WebElementFacade Mapa_Web;

    @FindBy(xpath = "//*[@id=\"footer\"]//p[4]/a")
    private WebElementFacade Manuales;

    @FindBy(xpath = "//*[@id=\"footer\"]//p[5]/a")
    private WebElementFacade Accesibilidad;

    @FindBy(xpath = "//*[@id=\"footer\"]//p[6]/a")
    private WebElementFacade Condiciones_Uso;


    public void visualizarCAPF048() throws InterruptedException {
        Logo_Junta.click();
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

        Logo_Ventana.click();
    }

    public void visualizarCAPF049() throws InterruptedException {
        getDriver().navigate().back();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Menu)
                .perform();
        actions.moveToElement(Submenu)
                .perform();
        Submenu.click();
    }

    public void visualizarCAPF057() throws InterruptedException {
        getDriver().navigate().back();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Ventana_Visitante.click();
        getDriver().navigate().back();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
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

        Facebook.click();
        Set<String> wndf = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i2 = wndf.iterator();
        prntw = i2.next();
        popwnd = i2.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Instagram.click();
        Set<String> wndi = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i3 = wndi.iterator();
        prntw = i3.next();
        popwnd = i3.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Pinterest.click();
        Set<String> wndp = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i4 = wndp.iterator();
        prntw = i4.next();
        popwnd = i4.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Logo_Junta_footer.click();
        Set<String> wndj = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i5 = wndj.iterator();
        prntw = i5.next();
        popwnd = i5.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Logo_Union.click();
        Set<String> wndu = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i6 = wndu.iterator();
        prntw = i6.next();
        popwnd = i6.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Conocenos.click();
        getDriver().navigate().back();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Contacto.click();
        getDriver().navigate().back();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Enlace_Interes.click();
        getDriver().navigate().back();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Mapa_Web.click();
        getDriver().navigate().back();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Manuales.click();
        getDriver().navigate().back();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Accesibilidad.click();
        getDriver().navigate().back();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Condiciones_Uso.click();
    }
}
