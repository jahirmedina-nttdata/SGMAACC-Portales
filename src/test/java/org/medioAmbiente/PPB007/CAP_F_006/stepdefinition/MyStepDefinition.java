package org.medioAmbiente.PPB007.CAP_F_006.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB007.CAP_F_006.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB007-CAPF006 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB007-CAPF006 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB007-CAPF006 - Visualizar CAPF038 Componentes Basicos$")
    public void Visualizar_CAPF038_Componentes_Basicos() throws InterruptedException{
        myStep.visualizarCAPF038();
    }

    @Y("^PPB007-CAPF006 - Visualizar CAPF040 Componente Directo A$")
    public void Visualizar_CAPF040_Componente_Directo_A() throws InterruptedException{
        myStep.visualizarCAPF040();
    }
}

