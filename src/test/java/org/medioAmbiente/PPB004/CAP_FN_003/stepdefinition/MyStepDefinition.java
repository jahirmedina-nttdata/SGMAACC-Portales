package org.medioAmbiente.PPB004.CAP_FN_003.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_FN_003.step.MyStep;

import java.net.URISyntaxException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;



    @Dado("^PPB004-CAPFN003 - Accedo al portal$")
    public void Accedo_Al_Portal() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB004-CAPFN003 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB004-CAPFN003 - Visualizar CAP_FC_001$")
    public void Visualizar_CAP_FC_01() throws InterruptedException {
        myStep.ejecutarFC01();
    }

    @Y("^PPB004-CAPFN003 - Visualizar CAP_FC_002$")
    public void Visualizar_CAP_FC_02() throws InterruptedException {
        myStep.ejecutarFC02();
    }

    @Y("^PPB004-CAPFN003 - Visualizar CAP_FC_003$")
    public void Visualizar_CAP_FC_03() throws InterruptedException {
        myStep.ejecutarFC03();
    }

    @Y("^PPB004-CAPFN003 - Visualizar CAP_FC_004$")
    public void Visualizar_CAP_FC_04() throws InterruptedException, URISyntaxException {
        myStep.ejecutarFC04();
    }
}

