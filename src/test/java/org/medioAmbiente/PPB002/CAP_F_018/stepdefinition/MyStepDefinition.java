package org.medioAmbiente.PPB002.CAP_F_018.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_018.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF018 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF018 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF018 - Aceptar las cookies$")
    public void Aceptar_LasCookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF018 - Clickar flecha siguiente$")
    public void Clickar_Flecha_Siguiente() throws InterruptedException{
        myStep.clickarFlechaSiguiente();
    }

    @Y("^PPB002-CAPF018 - Clickar flecha anterior$")
    public void Clickar_Flecha_Anterior() throws InterruptedException{
        myStep.clickarFlechaAnterior();
    }

    @Y("^PPB002-CAPF018 - Clickar bullet$")
    public void Clickar_Bullet() throws InterruptedException{
        myStep.clickarBullet();
    }

    @Y("^PPB002-CAPF018 - Clickar enlace$")
    public void Clickar_Enlace() throws InterruptedException{
        myStep.clickarEnlace();
    }


}

