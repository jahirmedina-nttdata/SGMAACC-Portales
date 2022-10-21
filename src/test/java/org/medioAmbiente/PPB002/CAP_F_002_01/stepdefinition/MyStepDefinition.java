package org.medioAmbiente.PPB002.CAP_F_002_01.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_002_01.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF00201 - Cargando el Portal Web$")
    public void Cargando_El_Portal_Web() throws InterruptedException {
        myStep.cargandoPortal();
    }

    @Cuando("^PPB002-CAPF00201 - Aceptar las cookies01")
    public void Aceptar_Cookies01() throws InterruptedException {
        myStep.acceptCookies();
    }

    @Y("^PPB002-CAPF00201 - hacemos click en buscador$")
    public void Hacemos_Click_En_Buscador() throws InterruptedException {
        myStep.clickBuscador();
    }

    @Y("^PPB002-CAPF00201 - escribimos \"([^\"]*)\" en el buscador y pulsamos enter$")
    public void Escribimos_En_El_Buscador_Ypulsamos_Enter(String tema) throws InterruptedException {
        myStep.escribimosenelBuscador(tema);
    }

    @Entonces("^PPB002-CAPF00201 - visualizamos la filtracion de la busquedad")
    public void Visualizamos_La_Filtracion_De_La_Busquedad() throws InterruptedException{
        myStep.filtracionBusquedad();
    }

}

