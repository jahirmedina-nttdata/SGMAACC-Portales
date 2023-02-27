package org.medioAmbiente.PPB004.CAP_F_003.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_F_003.step.MyStep;

import java.net.URISyntaxException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;



    @Dado("^PPB004-CAPF003 - Accedo al portal$")
    public void Accedo_Al_Portal() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB004-CAPF003 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB004-CAPF003 - Visualizar CAP_F_050$")
    public void Visualizar_CAP_F_050() throws InterruptedException {
        myStep.ejecutarF050();
    }

    @Y("^PPB004-CAPF003 - Visualizar CAP_F_051$")
    public void Visualizar_CAP_F_051() throws InterruptedException {
        myStep.ejecutarF051();
    }

    @Y("^PPB004-CAPF003 - Visualizar CAP_F_052$")
    public void Visualizar_CAP_F_052() throws InterruptedException {
        myStep.ejecutarF052();
    }

    @Y("^PPB004-CAPF003 - Visualizar CAP_F_053$")
    public void Visualizar_CAP_F_053() throws InterruptedException, URISyntaxException {
        myStep.ejecutarF053();
    }
}

