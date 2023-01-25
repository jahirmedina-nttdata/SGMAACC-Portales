package org.medioAmbiente.PPB002.CAP_F_021.page;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;


@DefaultUrl("/medioambiente/portal/web/guest/areas-tematicas")


public class MyPage extends PageObject {




    public void visualizarContenido() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        waitFor(1).second();
        j.executeScript("window.scrollBy(0, 300)");
        waitFor(1).second();
        j.executeScript("window.scrollBy(0, 300)");

    }


}
