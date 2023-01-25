package org.medioAmbiente.PPB002.CAP_F_019.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_019.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF019 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF019 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF019 - Aceptar las cookies$")
    public void Aceptar_LasCookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF019 - Ubicarse en la seccion Que puedo hacer$")
    public void Ubicarse_En_La_Seccion_Que_Puedo_Hacer() throws InterruptedException{
        myStep.ubicarseSeccionQuePuedoHacer();
    }

    @Y("^PPB002-CAPF019 - Posicionar puntero en el texto$")
    public void Posicionar_Puntero_En_El_Texto() throws InterruptedException{
        myStep.posicionarPuntero();
    }

    @Y("^PPB002-CAPF019 - Comprobar que navegue al contenido$")
    public void Comprobar_Que_Navegue_Al_Contenido() throws InterruptedException{
        myStep.comprobarQueNavegueAlContenido();
    }
}

