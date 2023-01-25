package org.medioAmbiente.PPB002.CAP_F_091.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_091.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class MyStep extends ScenarioSteps {

    private MyPage page;
    private String prntw;
    private String popwnd;
    //private String driver;
    public static WebDriver driver;

    @net.thucydides.core.annotations.Step
    public void cargandoNavegador() throws InterruptedException {
        page.open();
        getDriver().manage().window().maximize();
    }

    @net.thucydides.core.annotations.Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
        j.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
    }

    @net.thucydides.core.annotations.Step
    public void pulsarPortalCazaPescaContinental() throws InterruptedException {
        page.pulsarPortalCazaPescaContinental();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarPortalAndaluzCambioClimatico() throws InterruptedException {
        page.pulsarPortalAndaluzCambioClimatico();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarVentanaVisitante() throws InterruptedException {
        page.pulsarVentanaVisitante();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarCanalAdministracionElectronica() throws InterruptedException {
        page.pulsarCanalAdministracionElectronica();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarPlanInfoca() throws InterruptedException {
        page.pulsarPlanInfoca();
    }
    @net.thucydides.core.annotations.Step
    public void pulsarEmbalsesPrecipitaciones() throws InterruptedException {
        page.pulsarEmbalsesPrecipitaciones();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarCalidadDelAire() throws InterruptedException {
        page.pulsarCalidadDelAire();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarCatalogoInformacion() throws InterruptedException {
        page.pulsarCatalogoInformacion();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarEstadisticas() throws InterruptedException {
        page.pulsarEstadisticas();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarTwitter() throws InterruptedException {
        page.pulsarTwitter();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarFacebook() throws InterruptedException {
        page.pulsarFacebook();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarInstagram() throws InterruptedException {
        page.pulsarInstagram();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarYoutube() throws InterruptedException {
        page.pulsarYoutube();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarTwitterREDIAM() throws InterruptedException {
        page.pulsarTwitterREDIAM();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarFacebookREDIAM() throws InterruptedException {
        page.pulsarFacebookREDIAM();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarInstagramREDIAM() throws InterruptedException {
        page.pulsarInstagramREDIAM();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarYoutubeREDIAM() throws InterruptedException {
        page.pulsarYoutubeREDIAM();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarLikedinREDIAM() throws InterruptedException {
        page.pulsarLikedinREDIAM();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarLogoCAGPDS() throws InterruptedException {
        page.pulsarLogoCAGPDS();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarLogoUnionEuropea() throws InterruptedException {
        page.pulsarLogoUnionEuropea();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarMapaWeb() throws InterruptedException {
        page.pulsarMapaWeb();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarProteccionDatos() throws InterruptedException {
        page.pulsarProteccionDatos();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarAccesibilidad() throws InterruptedException {
        page.pulsarAccesibilidad();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarCondicionesUso() throws InterruptedException {
        page.pulsarCondicionesUso();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarRSS() throws InterruptedException {
        page.pulsarRSS();
    }

}