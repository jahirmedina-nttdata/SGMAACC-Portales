package org.medioAmbiente.PPB002.CAP_F_085.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_085.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF085 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF085 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF085 - Aceptar las cookies$")
    public void Aceptar_Las_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }


    @Y("^PPB002-CAPF085 - Visualizar sin fecha$")
    public void Visualizar_SinFecha() throws InterruptedException {
        myStep.visualizarSinFecha();
    }

    @Y("^PPB002-CAPF085 - Visualizar sin subtitulo$")
    public void Visualizar_SinSubtitulo() throws InterruptedException {
        myStep.visualizarSinSub();
    }


    @Y("^PPB002-CAPF085 - Visualizar sin texto$")
    public void Visualizar_Sin_Texto() throws InterruptedException {
        myStep.visualizarSinTexto();
    }

    @Y("^PPB002-CAPF085 - Visualizar sin texto miniatura$")
    public void Visualizar_Sin_Texto_Miniatura() throws InterruptedException {
        myStep.visualizarSinTextominiatura();
    }


    @Y("^PPB002-CAPF085 - Visualizar sin creditos$")
    public void Visualizar_Sin_Creditos() throws InterruptedException{
        myStep.visualizarSinCreditos();
    }

    @Y("^PPB002-CAPF085 - Visualizar sin fichero$")
    public void VisualizarSinFichero()throws InterruptedException {
        myStep.visualizarSinFichero();
    }

    @Y("^PPB002-CAPF085 - Visualizar sin url$")
    public void Visualizar_Sin_Url() throws InterruptedException{
        myStep.visualizarSinUrl();
    }

    @Y("^PPB002-CAPF085 - Visualizar sin imagen$")
    public void Visualizar_Sin_Imagen()throws InterruptedException {
        myStep.visualizarSinImage();
    }

    @Y("^PPB002-CAPF085 - Visualizar sin url biblioteca$")
    public void Visualizar_Sin_Url_Biblioteca()throws InterruptedException {
        myStep.visualizarSinBliblioteca();
    }

    @Y("^PPB002-CAPF085 - Visualizar sin serie$")
    public void Visualizar_Sin_Serie()throws InterruptedException {
        myStep.visualizarSinSerie();
    }

    @Y("^PPB002-CAPF085 - Visualizar sin autor$")
    public void Visualizar_Sin_Autor() throws InterruptedException {
        myStep.visualizarSinActor();
    }

    @Y("^PPB002-CAPF085 - Visualizar sin notas$")
    public void Visualizar_Sin_Notas()throws InterruptedException {
        myStep.visualizarSinNotas();
    }

    @Y("^PPB002-CAPF085 - Visualizar sin archivos$")
    public void Visualizar_Sin_Archivos()throws InterruptedException  {
        myStep.visualizarSinArchivos();
    }

    @Y("^PPB002-CAPF085 - Visualizar sin derechos$")
    public void Visualizar_Sin_Derechos()throws InterruptedException {
        myStep.visualizarSinDerechos();
    }

    @Y("^PPB002-CAPF085 - Clickar descarga$")
    public void Clickar_Descarga()throws InterruptedException {
        myStep.clickarDercarga();
    }

    @Y("^PPB002-CAPF085 - Clickar documento$")
    public void Clickar_Documento()throws InterruptedException {
        myStep.clickarDocument();
    }

    @Y("^PPB002-CAPF085 - Clickar url$")
    public void Clickar_Url() throws InterruptedException{
        myStep.clickarUrl();
    }

    @Y("^PPB002-CAPF085 - Clickar interactivo$")
    public void Clickar_Interactivo() throws InterruptedException {
        myStep.clickarInteractivo();
    }

    @Y("^PPB002-CAPF085 - Clickar enlace biblioteca$")
    public void Clickar_Enlace_Biblioteca()throws InterruptedException {
        myStep.clickarEnlaceBibli();
    }
}

