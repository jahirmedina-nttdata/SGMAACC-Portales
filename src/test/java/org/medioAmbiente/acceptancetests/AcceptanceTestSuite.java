package org.medioAmbiente.acceptancetests;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"html:target/build/cucumber-html-report"
                        , "pretty:target/build/cucumber-pretty.txt"
                        , "json:target/build/cucumber.json"},
        stepNotifications=true,
        features="src/test/resources/features",
        glue="org.medioAmbiente"
    //   , tags = "(@PPB002-CAP_F_017 or @PPB002-CAP_F_093)"
 //    , tags = "(@PPB007-CAP_FN_001 or @PPB007-CAP_FN_003 or @PPB007-CAP_FN_004 or @PPB007-CAP_FN_006 or @PPB007-CAP_FC_001 or @PPB007-CAP_FC_015)"
        , tags = "@PPB002-CAP_F_093"
        )

public class AcceptanceTestSuite {}
