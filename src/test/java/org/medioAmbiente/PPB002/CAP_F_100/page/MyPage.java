package org.medioAmbiente.PPB002.CAP_F_100.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.charset.CodingErrorAction;
import java.util.Iterator;
import java.util.Set;


@DefaultUrl("/medioambiente/portal/home")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;

    @FindBy(xpath = "(//a[@title=\"Portal de la Caza y la Pesca Continental\"])[2]")
    private WebElementFacade Caza_Pesca;

    @FindBy(xpath = "(//a[@title=\"Portal Andaluz del Cambio Climático\"])[2]")
    private WebElementFacade Portal_Andaluz;

    @FindBy(xpath = "(//a[@title=\"Ventana del visitante\"])[2]")
    private WebElementFacade Ventana_Visitante;

    @FindBy(xpath = "(//a[@title=\"Canal de Administración Electrónica\"])[2]")
    private WebElementFacade Canal_Administracion;

    @FindBy(xpath = "//a[@title=\"Plan Infoca\"]")
    private WebElementFacade Plan_Infoca;

    @FindBy(xpath = "//a[@title=\"Embalses y precipitaciones\"]")
    private WebElementFacade Embalses_Precipitaciones;

    @FindBy(xpath = "//a[@title=\"Calidad del aire en Andalucía\"]")
    private WebElementFacade Calidad_Aire;

    @FindBy(xpath = "//a[@title=\"Catálogo de información\"]")
    private WebElementFacade Catalogo_Informacion;

    @FindBy(xpath = "//a[@title=\"Estadísticas\"]")
    private WebElementFacade Estadistica;

    @FindBy(xpath = "(//a[@title=\"Twitter\"]/img)[1]")
    private WebElementFacade icono_Twitter;

    @FindBy(xpath = "(//a[@title=\"Facebook\"]/img)[1]")
    private WebElementFacade icono_Facebook;

    @FindBy(xpath = "(//a[@title=\"Instagram\"]/img)[1]")
    private WebElementFacade icono_Instagram;

    @FindBy(xpath = "(//a[@title=\"Enlace - Youtube\"]/img)[1]")
    private WebElementFacade icono_Youtube;

    @FindBy(xpath = "(//a[@title=\"Twitter\"]/img)[2]")
    private WebElementFacade icono_TwitterREDIAM;

    @FindBy(xpath = "(//a[@title=\"Facebook\"]/img)[2]")
    private WebElementFacade icono_FacebookREDIAM;

    @FindBy(xpath = "(//a[@title=\"Instagram\"]/img)[2]")
    private WebElementFacade icono_InstagramREDIAM;

    @FindBy(xpath = "//a[@title=\"Enlace - Youtube REDIAM\"]/img")
    private WebElementFacade icono_YoutubeREDIAM;

    @FindBy(xpath = "//a[@title=\"Enlace - Linkedin REDIAM\"]/img")
    private WebElementFacade icono_LikedinREDIAM;

    @FindBy(xpath = "//a[@title=\"Junta de Andalucía\"]/img")
    private WebElementFacade Logo_CAGPDS;

    @FindBy(xpath = "//a[@title=\"Fondo Europeo de Desarrollo Regional\"]/img")
    private WebElementFacade Logo_UnionEuropea;

    @FindBy(xpath = "//a[@title=\"Mapa web\"]")
    private WebElementFacade Mapa_Web;

    @FindBy(xpath = "//a[@title=\"Protección de datos\"]")
    private WebElementFacade Proteccion_Datos;

    @FindBy(xpath = "//a[@title=\"Accesibilidad\"]")
    private WebElementFacade Accesibilidad;

    @FindBy(xpath = "//a[@title=\"Condiciones de uso\"]")
    private WebElementFacade Condiciones_Uso;

    @FindBy(xpath = "//a[@title=\"RSS\"]")
    private WebElementFacade RSS;


    public void pulsarPortalCazaPescaContinental()throws InterruptedException {
        Caza_Pesca.click();
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

    public void pulsarPortalAndaluzCambioClimatico()throws InterruptedException {
        Portal_Andaluz.click();
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

    public void pulsarVentanaVisitante()throws InterruptedException {
        Ventana_Visitante.click();
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

    public void pulsarCanalAdministracionElectronica()throws InterruptedException {
        Canal_Administracion.click();
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

    public void pulsarPlanInfoca()throws InterruptedException {
        Plan_Infoca.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1)[6]")));
        getDriver().navigate().back();
    }

    public void pulsarEmbalsesPrecipitaciones()throws InterruptedException {
        Embalses_Precipitaciones.click();
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

    public void pulsarCalidadDelAire()throws InterruptedException {
        Calidad_Aire.click();
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

    public void pulsarCatalogoInformacion()throws InterruptedException {
        Catalogo_Informacion.click();
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

    public void pulsarEstadisticas()throws InterruptedException {
        Estadistica.click();
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

    public void pulsarTwitter()throws InterruptedException {
        icono_Twitter.click();
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

    public void pulsarFacebook()throws InterruptedException {
        icono_Facebook.click();
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

    public void pulsarInstagram()throws InterruptedException {
        icono_Instagram.click();
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

    public void pulsarYoutube()throws InterruptedException {
        icono_Youtube.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'MedioAmbAND')])[1]")));
        getDriver().navigate().back();
    }

    public void pulsarTwitterREDIAM()throws InterruptedException {
        icono_TwitterREDIAM.click();
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

    public void pulsarFacebookREDIAM()throws InterruptedException {
        icono_FacebookREDIAM.click();
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

    public void pulsarInstagramREDIAM()throws InterruptedException {
        icono_InstagramREDIAM.click();
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

    public void pulsarYoutubeREDIAM()throws InterruptedException {
        icono_YoutubeREDIAM.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'REDIAM')])[1]")));
        getDriver().navigate().back();
    }

    public void pulsarLikedinREDIAM()throws InterruptedException {
        icono_LikedinREDIAM.click();
        getDriver().navigate().back();
    }

    public void pulsarLogoCAGPDS()throws InterruptedException {
        Logo_CAGPDS.click();
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

    public void pulsarLogoUnionEuropea()throws InterruptedException {
        Logo_UnionEuropea.click();
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

    public void pulsarMapaWeb()throws InterruptedException {
        Mapa_Web.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Inicio')])[2]")));
        getDriver().navigate().back();
    }

    public void pulsarProteccionDatos()throws InterruptedException {
        Proteccion_Datos.click();
        getDriver().navigate().back();
    }

    public void pulsarAccesibilidad()throws InterruptedException {
        Accesibilidad.click();
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

    public void pulsarCondicionesUso()throws InterruptedException {
        Condiciones_Uso.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),'Condiciones de uso')])[2]")));
        getDriver().navigate().back();
    }

    public void pulsarRSS()throws InterruptedException {
        RSS.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),'RSS')])[2]")));
        getDriver().navigate().back();

    }

}
