package org.medioAmbiente.PPB005.CAP_F_001_04.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB005.CAP_F_001_04.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB005-CAPF00104 - Accedo al portal$")
    public void Accedo_al_portal() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Cuando("^PPB005-CAPF00104 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB005-CAPF00104 - Mostrar seccion noticias$")
    public void Mostrar_Seccion_Noticias() throws InterruptedException {
        myStep.mostrarSeccionNoticias();
    }

    @Y("^PPB005-CAPF00104 - Accedo a noticia$")
    public void Accedo_A_Noticia() throws InterruptedException {
        myStep.accedoANoticia();
    }

}

