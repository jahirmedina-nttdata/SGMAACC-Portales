package org.medioAmbiente.PPB002.CAP_F_024_01.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_024_01.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF02401 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF02401 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF02401 - Aceptar las cookies$")
    public void Aceptar_LasCookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF02401 - Ubicarse en la seccion PROYECTOS EUROPEOS$")
    public void Ubicarse_En_La_Seccion_PROYECTOS_EUROPEOS() throws InterruptedException{
        myStep.ubicarseEnPROYECTOSEUROPEOS();
    }

    @Y("^PPB002-CAPF02401 - Deslizar componente$")
    public void Deslizar_Componente() throws InterruptedException{
        myStep.deslizarComponente();
    }

    @Y("^PPB002-CAPF02401 - Posicionar puntero en tarjeta$")
    public void Posicionar_Puntero_En_Tarjeta() throws InterruptedException{
        myStep.posicionarPunteroEnTarjeta();
    }

    @Y("^PPB002-CAPF02401 - Clickar Tarjeta$")
    public void Clickar_Tarjeta() throws InterruptedException{
        myStep.clickarTarjeta();
    }
}

