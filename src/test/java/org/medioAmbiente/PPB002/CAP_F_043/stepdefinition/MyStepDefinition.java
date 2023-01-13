package org.medioAmbiente.PPB002.CAP_F_043.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_043.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF043 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF043 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF043 - Aceptar las cookies$")
    public void Aceptar_LasCookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF043 - Visualizar componente Mas sobre Catalogo$")
    public void Visualizar_Componente_Mas_Sobre_Catalogo() throws InterruptedException{
        myStep.visualizarMasSobreCatalogo();
    }

    @Y("^PPB002-CAPF043 - Posicionar puntero en enlace$")
    public void Posicionar_Puntero_En_Enlace() throws InterruptedException{
        myStep.posicionarPuntero();
    }

    @Y("^PPB002-CAPF043 - Clickar enlace$")
    public void Clickar_Enlace() throws InterruptedException{
        myStep.clickarEnlace();
    }
}

