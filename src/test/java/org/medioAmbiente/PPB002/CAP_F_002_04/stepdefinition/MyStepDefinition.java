package org.medioAmbiente.PPB002.CAP_F_002_04.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_002_04.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF00204 - Cargando el Navegador$")
    public void CargandoElNavegador() throws InterruptedException {
        myStep.cargandoPortal();
    }
    @Cuando("^PPB002-CAPF00204 - Aceptamos las cookies$")
    public void AceptamosLasCookies()throws InterruptedException {
        myStep.acceptCookies();
    }

    @Y("^PPB002-CAPF00204 - Ubicarnos seccion noticia$")
    public void Ubicarnos_Seccion_Noticia() throws InterruptedException{
        myStep.ubicarNoticia();

    }

    @Y("^PPB002-CAPF00204 - Deslizar de izquierda a derecha noticia$")
    public void Deslizar_De_Izquierda_A_Derecha_Noticia()throws InterruptedException {
        myStep.deslizarnoticia();
    }

    @Y("^PPB002-CAPF00204 - Clickar en noticia$")
    public void Clickar_En_Noticia()throws InterruptedException {
        myStep.clickarNoticia();
    }

    @Y("^PPB002-CAPF00204 - Clickar en todas las noticias$")
    public void Clickar_En_Todas_Las_Noticias()throws InterruptedException {
        myStep.clickarTodos();

    }
}

