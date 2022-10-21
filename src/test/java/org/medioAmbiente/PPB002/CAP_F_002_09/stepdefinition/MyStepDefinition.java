package org.medioAmbiente.PPB002.CAP_F_002_09.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_002_09.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF00209 - Accedemos el Portal Web MB$")
    public void Accedemos_El_PortalWebMB() throws InterruptedException {
        myStep.accedemosalPortal();
    }

    @Y("^PPB002-CAPF00209 - Aceptar las cookies04$")
    public void Aceptar_Las_Cookies04() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF00209 - Clickar en lo Mas Buscado$")
    public void Clickar_En_Lo_MasBuscado() throws InterruptedException{
        myStep.clickarMasBuscado();
    }

    @Y("^PPB002-CAPF00209 - Clickar en Servicios$")
    public void Clickar_En_Servicios() throws InterruptedException{
        myStep.clickarServicios();
    }

}

