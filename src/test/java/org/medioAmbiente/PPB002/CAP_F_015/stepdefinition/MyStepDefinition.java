package org.medioAmbiente.PPB002.CAP_F_015.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_015.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF015 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF015 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF015 - Aceptar las cookies$")
    public void Aceptar_Las_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }


    @Y("PPB002-CAPF015 - Ubicarte en la seccion Tambien te puede interesar$")
    public void Ubicarte_En_La_Seccion_Tambien_Te_Puede_Interesar() throws InterruptedException{
        myStep.ubicarteEnTambienTePuedeInteresar();
    }

    @Y("PPB002-CAPF015 - Clickar titulo de imagen$")
    public void Clickar_Titulo_De_Imagen() throws InterruptedException{
        myStep.clickarTituloDeImagen();
    }
}

