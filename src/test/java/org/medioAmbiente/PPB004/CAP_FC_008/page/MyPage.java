package org.medioAmbiente.PPB004.CAP_FC_008.page;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/caza-y-pesca/")



public class MyPage extends PageObject {

    public void mostrarTexto() throws InterruptedException{
        waitFor(5).second();
    }
}
