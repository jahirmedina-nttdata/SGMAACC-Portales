package org.medioAmbiente.PPB002.CAP_F_079.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_079.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF079 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF079 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF079 - Aceptar las cookies$")
    public void Aceptar_Las_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }


    @Y("^PPB002-CAPF079 - Visualizar sin fecha$")
    public void Visualizar_SinFecha()throws InterruptedException {
        myStep.visualizarSinFecha();
    }

    @Y("^PPB002-CAPF079 - Visualizar sin subtitulo$")
   public void Visualizar_SinSubtitulo() throws InterruptedException{
       myStep.visualizarSinSub();
    }

    @Y("^PPB002-CAPF079 - Visualizar sin imagen$")
    public void Visualizar_SinImagen() throws InterruptedException{
        myStep.visualizarSinImagen();
    }

    @Y("^PPB002-CAPF079 - Visualizar sin texto$")
    public void Visualizar_SinTexto()throws InterruptedException {
        myStep.visualizarSinTexto();
    }

    @Y("^PPB002-CAPF079 - Visualizar sin fecha desde-hasta$")
    public void Visualizar_Sin_Fecha_DesdeHasta() throws InterruptedException {
        myStep.visualizarSinFechaDesde();
    }

    @Y("^PPB002-CAPF079 - Visualizar sin direccion$")
    public void Visualizar_SinDireccion() throws InterruptedException {
        myStep.visualizarSinDireccion();
    }

    @Y("^PPB002-CAPF079 - Visualizar sin provincia$")
    public void Visualizar_Sin_Provincia() throws InterruptedException{
        myStep.visualizarSinProvincia();
    }

    @Y("^PPB002-CAPF079 - Visualizar sin programa$")
    public void Visualizar_Sin_Programa()throws InterruptedException {
        myStep.visualizarSinPrograma();
    }

    @Y("^PPB002-CAPF079 - Visualizar sin descargar$")
    public void Visualizar_Sin_Descargar()throws InterruptedException {
        myStep.visualizarSinDescarga();
    }

    @Y("^PPB002-CAPF079 - Visualizar sin destinatario$")
    public void Visualizar_Sin_Destinatario() throws InterruptedException{
        myStep.vizualizaSinDestinatario();
    }

    @Y("^PPB002-CAPF079 - Visualizar sin contacto$")
    public void Visualizar_Sin_Contacto() throws InterruptedException {
        myStep.visualizarSinContacto();
    }

    @Y("^PPB002-CAPF079 - Visualizar sin enlace$")
    public void VisualizarSinEnlace()throws InterruptedException {
        myStep.visualizarSinEnlace();
    }
}

