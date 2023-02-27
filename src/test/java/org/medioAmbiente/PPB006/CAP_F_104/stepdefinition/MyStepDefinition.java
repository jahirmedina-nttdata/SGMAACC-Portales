package org.medioAmbiente.PPB006.CAP_F_104.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_F_104.step.MyStep;

import java.net.URISyntaxException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPF104 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPF104 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPF104 - Visualizar buscador general$")
    public void Visualizar_Buscador_General()throws InterruptedException {
        myStep.visualizarBuscador();
    }

    @Y("^PPB006-CAPF104 - Acceder a buscador avanzado$")
    public void Acceder_A_Buscador_Avanzado() throws InterruptedException, URISyntaxException {
        myStep.accederBuscador();
    }

    @Y("^PPB006-CAPF104 - Buscar por Texto$")
    public void Buscar_Por_Texto()throws InterruptedException {
        myStep.buscarPorTexto();
    }

    @Y("^PPB006-CAPF104 - Buscar por Colectivo$")
    public void Buscar_Por_Colectivo()throws InterruptedException {
        myStep.buscarPorColectivo();
    }

    @Y("^PPB006-CAPF104 - Ordenar por fecha de publicacion ascendente$")
    public void Ordenar_Por_Fecha_De_Publicacion_Ascendente()throws InterruptedException {
        myStep.ordenarPorFechaDePublicacionAscendente();
    }

    @Y("^PPB006-CAPF104 - Ordenar por titulo ascendente$")
    public void Ordenar_Por_Titulo_Ascendente()throws InterruptedException {
        myStep.ordenarPorTituloAscendente();
    }


    @Y("^PPB006-CAPF104 - Ordenar por titulo descendente$")
    public void Ordenar_Por_Titulo_Descendente()throws InterruptedException {
        myStep.ordenarPorTituloDescendente();
    }

    @Y("^PPB006-CAPF104 - Buscar por Texto y colectivo$")
    public void Buscar_Por_Texto_Y_Colectivo()throws InterruptedException {
        myStep.buscarPorTextoYColectivo();
    }

    @Y("^PPB006-CAPF104 - Posicionar puntero en texto$")
    public void Posicionar_Puntero_En_Texto()throws InterruptedException {
        myStep.posicionarPunteroEnTexto();
    }

    @Y("^PPB006-CAPF104 - Visualizar paginacion$")
    public void Visualizar_Paginacion()throws InterruptedException {
        myStep.visualizarPaginacion();
    }

    @Y("^PPB006-CAPF104 - Pulsar paginador$")
    public void Pulsar_Paginador()throws InterruptedException {
        myStep.pulsarPaginador();
    }

    @Y("^PPB006-CAPF104 - Pulsar siguiente$")
    public void Pulsar_Siguiente()throws InterruptedException {
        myStep.pulsarSiguiente();
    }

    @Y("^PPB006-CAPF104 - Pulsar Ultima pagina$")
    public void Pulsar_Ultima_Pagina()throws InterruptedException {
        myStep.pulsarUltimaPagina();
    }

    @Y("^PPB006-CAPF104 - Pulsar anterior$")
    public void Pulsar_Anterior()throws InterruptedException {
        myStep.pulsarAnterior();
    }

    @Y("^PPB006-CAPF104 - Pulsar Primera pagina$")
    public void Pulsar_Primera_Pagina()throws InterruptedException {
        myStep.pulsarPrimeraPagina();
    }

    @Y("^PPB006-CAPF104 - Validar cantidad de resultados$")
    public void Validar_Cantidad_De_Resultados()throws InterruptedException {
        myStep.validarCantidadDeResultados();
    }

}

