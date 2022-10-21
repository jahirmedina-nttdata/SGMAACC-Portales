package org.medioAmbiente.PPB002.CAP_F_002_03.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_002_03.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF00203 - Cargando el Navegador$")
    public void CargandoEl_Navegador() throws InterruptedException {
        myStep.cargandoPortal();
    }

    @Cuando("^PPB002-CAPF00203 - Aceptamos las cookies$")
    public void Aceptamos_Las_Cookies() throws InterruptedException {
        myStep.acceptCookies();
    }

    @Y("^PPB002-CAPF00203 - Ubicarnos en el carrusel$")
    public void Ubicarnos_En_ElCarrusel() throws InterruptedException {
        myStep.ubicarCarrusel();
    }

    @Y("^PPB002-CAPF00203 - Clickar en elemento Geodiversidad$")
    public void Clickar_En_Elemento_Geodiversidad() throws InterruptedException {
        myStep.clickarGeodiversidad();
    }
    @Y("^PPB002-CAPF00203 - Deslizar de izquierda a derecha$")
    public void Deslizar_De_Izquierda_A_Derecha()throws InterruptedException  {
        myStep.deslizarElemento();
    }

    @Y("^PPB002-CAPF00203 - Clickar en elemento$")
    public void Clickar_En_Elemento()throws InterruptedException {
        myStep.clickarElemento();
    }
}

