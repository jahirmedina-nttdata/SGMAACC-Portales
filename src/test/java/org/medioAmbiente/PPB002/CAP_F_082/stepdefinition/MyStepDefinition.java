package org.medioAmbiente.PPB002.CAP_F_082.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_082.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF082 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF082 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF082 - Aceptar las cookies$")
    public void Aceptar_Las_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF082 - Mostrar contenido del detalle$")
    public void Mostrar_Contenido_Del_Detalle() throws InterruptedException {
        myStep.mostrarContenidoDelDetalle();
    }

    @Y("^PPB002-CAPF082 - Mostrar sin fecha$")
    public void Mostrar_SinFecha() throws InterruptedException {

    }

    @Y("^PPB002-CAPF082 - Mostrar sin subtitulo$")
    public void Mostrar_SinSubtitulo() throws InterruptedException {

    }

    @Y("^PPB002-CAPF082 - Mostrar sin texto$")
    public void Mostrar_SinTexto() throws InterruptedException {

    }


    @Y("^PPB002-CAPF082 - Mostrar sin texto miniatura$")
    public void Mostrar_Sin_Texto_Miniatura() throws InterruptedException {

    }

    @Y("^PPB002-CAPF082 - Mostrar sin serie inicio$")
    public void Mostrar_Sin_Serie_Inicio() throws InterruptedException {

    }

    @Y("^PPB002-CAPF082 - Mostrar sin serie final$")
    public void Mostrar_Sin_Serie_Final() throws InterruptedException {

    }

    @Y("^PPB002-CAPF082 - Mostrar sin fecha de datos$")
    public void Mostrar_Sin_Fecha_De_Datos() throws InterruptedException {

    }

    @Y("^PPB002-CAPF082 - Mostrar sin Url$")
    public void Mostrar_Sin_Url() throws InterruptedException {

    }

    @Y("^PPB002-CAPF082 - Mostrar sin visor$")
    public void Mostrar_Sin_Visor() throws InterruptedException {
        myStep.mostrarSinVisor();
    }

    @Y("^PPB002-CAPF082 - Mostrar sin caracteristicas servicio$")
    public void Mostrar_Sin_Caracteristicas_Servicio() throws InterruptedException {
    }

}

