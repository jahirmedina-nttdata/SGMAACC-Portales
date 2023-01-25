package org.medioAmbiente.PPB002.CAP_F_008.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_008.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF008 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF008 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF008 - Ubicamos el apartado Destacados$")
    public void Ubicamos_El_Apartado_Destacados() throws InterruptedException{
        myStep.ubicarDestacados();
    }


    @Y("PPB002-CAPF008 - Clickar en Premios y concursos$")
    public void Clickar_En_Premios_Y_Concursos() throws InterruptedException{
        myStep.clickarPremiosConsurso();

    }
}

