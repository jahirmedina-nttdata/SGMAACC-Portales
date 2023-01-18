package org.medioAmbiente.PPB006.CAP_FN_023.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FN_023.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFN023 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFN023 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }


    @Y("^PPB006-CAPFN023 - Ubicarse en la seccion Tambien te puede interesar$")
    public void Ubicarse_En_La_Seccion_Tambien_Te_Puede_Interesar()throws InterruptedException {
        myStep.ubicarseEnLaSeccionTambienTePuedeInteresar();
    }

    @Y("^PPB006-CAPFN023 - Visualiza el titulo$")
    public void Visualiza_El_Titulo()throws InterruptedException {
        myStep.visualizaTitulo();
    }

    @Y("^PPB006-CAPFN023 - Navegar en el componente$")
    public void Navegar_En_El_Componente()throws InterruptedException {
        myStep.navegarEnElComponente();
    }

    @Y("^PPB006-CAPFN023 - Posicionar puntero en texto$")
    public void Posicionar_Puntero_En_Texto()throws InterruptedException {
        myStep.posicionarPunteroEnTexto();
    }

}

