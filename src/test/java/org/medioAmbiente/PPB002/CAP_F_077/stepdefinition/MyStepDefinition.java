package org.medioAmbiente.PPB002.CAP_F_077.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_077.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF077 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF077 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF077 - Aceptar las cookies$")
    public void Aceptar_Las_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }


    @Y("^PPB002-CAPF077 - Visualizar sin fecha$")
    public void Visualizar_SinFecha() throws InterruptedException {
        myStep.visualizarSinFecha();
    }

    @Y("^PPB002-CAPF077 - Visualizar sin subtitulo$")
    public void Visualizar_SinSubtitulo() throws InterruptedException {
        myStep.visualizarSinSub();
    }


    @Y("^PPB002-CAPF077 - Visualizar sin texto$")
    public void Visualizar_Sin_Texto() throws InterruptedException {
        myStep.visualizarSinTexto();
    }

    @Y("^PPB002-CAPF077 - Visualizar sin texto miniatura$")
    public void Visualizar_Sin_Texto_Miniatura() throws InterruptedException {
        myStep.visualizarSinTextominiatura();
    }

    @Y("^PPB002-CAPF077 - Visualizar sin video$")
    public void Visualizar_Sin_Video() throws InterruptedException {
        myStep.visualizarSinVideo();
    }

    @Y("^PPB002-CAPF077 - Visualizar sin notas$")
    public void Visualizar_Sin_Notas() throws InterruptedException {
        myStep.visualizarSinnotas();
    }

    @Y("^PPB002-CAPF077 - Visualizar sin autores$")
    public void Visualizar_Sin_Autores() throws InterruptedException {
        myStep.visualizarSinautor();
    }

    @Y("^PPB002-CAPF077 - Visualizar sin derechos$")
    public void Visualizar_Sin_Derechos() throws InterruptedException {
        myStep.visualizarSinderecho();
    }

    @Y("^PPB002-CAPF077 - Visualizar video$")
    public void Visualizar_Video() throws InterruptedException {
        myStep.visualizarvideo();
    }

    @Y("^PPB002-CAPF077 - Visualizar sin direccion$")
    public void Visualizar_Sin_Direccion() throws InterruptedException {
        myStep.visualizarSindireccion();
    }
}

