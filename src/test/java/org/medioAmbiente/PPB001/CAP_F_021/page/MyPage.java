package org.medioAmbiente.PPB001.CAP_F_021.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import java.sql.*;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/buscador-de-espacios-naturales-y-equipamientos?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_category2_input\"]")
    private WebElementFacade Tipo_Equipamiento;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_category2_itemList\"]/ul/li[1]")
    private WebElementFacade Area_Recreativa;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_category1-button\"]")
    private WebElementFacade Lista_Provincias;

    @FindBy(xpath = "//div[contains(text(),'ALMERÍA')]")
    private WebElementFacade Almeria;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_searchButton\"]")
    private WebElementFacade btnBuscar;


    public void seleccionarAreaRecreativa() throws InterruptedException {
        Tipo_Equipamiento.click();
        Area_Recreativa.click();
    }

    public void seleccionarAlmeria() throws InterruptedException {
        Lista_Provincias.click();
        Almeria.click();
    }

    public void clickarBuscar() throws InterruptedException {
        btnBuscar.click();
    }

    public void validarResultado() throws InterruptedException, SQLException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 1000)");
     //   try{
     //       Class.forName("oracle.jdbc.OracleDriver");
     //   }
    //    catch (ClassNotFoundException e)
      //  {
        //    e.printStackTrace();
    //    }
    //    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@10.229.19.20:1521:OINT01", "LIFERAYMG", "LIFERAYMG");
    //    Statement stmt = conn.createStatement();
    //    ResultSet rset = stmt.executeQuery("SELECT * FROM ACERVOMG.AV_V_TOTAL_TIPOEQ_PROV WHERE tipoequipamiento like '%ÁREA RECREATIVA%' AND provincia like '%ALMERÍA%'");
     //   while (rset.next())
     //       System.out.println(rset.getString(1));
    }

}
