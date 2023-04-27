package org.medioAmbiente.PPB002.CAP_F_076.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_076.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF076 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF076 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF076 - Aceptar las cookies$")
    public void Aceptar_Las_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }


    @Y("^PPB002-CAPF076 - Mostrar sin fecha$")
    public void Mostrar_SinFecha() throws InterruptedException {
        myStep.visualizarSinFecha();
    }

    @Y("^PPB002-CAPF076 - Mostrar sin subtitulo$")
    public void Mostrar_SinSubtitulo() throws InterruptedException {

    }


    @Y("^PPB002-CAPF076 - Mostrar sin texto$")
    public void Mostrar_Sin_Texto() throws InterruptedException {

    }

    @Y("^PPB002-CAPF076 - Mostrar sin texto miniatura$")
    public void Mostrar_Sin_Texto_Miniatura() throws InterruptedException {

    }

    @Y("^PPB002-CAPF076 - Mostrar sin audio$")
    public void Mostrar_Sin_Audio() throws InterruptedException {

    }

    @Y("^PPB002-CAPF076 - Mostrar sin video$")
    public void Mostrar_Sin_Video() throws InterruptedException {

    }

    @Y("^PPB002-CAPF076 - Mostrar sin notas$")
    public void Mostrar_Sin_Notas() throws InterruptedException {

    }

    @Y("^PPB002-CAPF076 - Mostrar sin autores$")
    public void Mostrar_Sin_Autores() throws InterruptedException {

    }

    @Y("^PPB002-CAPF076 - Clickar Play$")
    public void Clickar_Play() throws InterruptedException {

    }

    @Y("^PPB002-CAPF076 - Mostrar sin direccion$")
    public void Mostrar_Sin_Direccion() throws InterruptedException {

    }
}

