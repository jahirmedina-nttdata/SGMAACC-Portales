package org.medioAmbiente.PPB002.CAP_F_024.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_024.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF024 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF024 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF024 - Aceptar las cookies$")
    public void Aceptar_LasCookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF024 - Ubicarse en el apartado Destacados$")
    public void Ubicarse_En_El_Apartado_Destacados() throws InterruptedException{
        myStep.ubicarseEnDestacados();
    }

    @Y("^PPB002-CAPF024 - Clickar Contenido$")
    public void Clickar_Contenido() throws InterruptedException{
        myStep.clickarContenido();
    }
}

