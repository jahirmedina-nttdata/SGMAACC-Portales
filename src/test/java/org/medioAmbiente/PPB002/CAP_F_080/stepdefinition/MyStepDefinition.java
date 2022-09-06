package org.medioAmbiente.PPB002.CAP_F_080.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_080.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF080 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF080 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF080 - Aceptar las cookies$")
    public void Aceptar_Las_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }


    @Y("^PPB002-CAPF080 - Visualizar sin fecha$")
    public void Visualizar_SinFecha() throws InterruptedException {
        myStep.visualizarSinFecha();
    }

    @Y("^PPB002-CAPF080 - Visualizar sin subtitulo$")
    public void Visualizar_SinSubtitulo() throws InterruptedException {
        myStep.visualizarSinSub();
    }

    @Y("^PPB002-CAPF080 - Visualizar sin imagen$")
    public void Visualizar_SinImagen() throws InterruptedException {
        myStep.visualizarSinImagen();
    }

    @Y("^PPB002-CAPF080 - Visualizar sin Pieimagen$")
    public void Visualizar_Sin_Pieimagen() throws InterruptedException {
        myStep.visualizarSinPie();
    }

    @Y("^PPB002-CAPF080 - Visualizar sin texto$")
    public void Visualizar_SinTexto() throws InterruptedException {
        myStep.visualizarSinTexto();
    }


    @Y("^PPB002-CAPF080 - Visualizar sin autor$")
    public void Visualizar_Sin_Autor() throws InterruptedException {
        myStep.visualizarSinAutor();
    }

    @Y("^PPB002-CAPF080 - Visualizar sin localizacion$")
    public void Visualizar_Sin_Localizacion() throws InterruptedException {
        myStep.visualizarSinlocalizacion();
    }

    @Y("^PPB002-CAPF080 - Visualizar sin derechos$")
    public void ppbCAPFVisualizarSinDerechos() throws InterruptedException {
        myStep.visualizarSinderecho();
    }
}

