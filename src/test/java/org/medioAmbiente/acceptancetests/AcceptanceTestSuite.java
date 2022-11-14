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
     , tags = "(@PPB003-CAP_F_002 or @PPB003-CAP_F_048 or @PPB003-CAP_F_049 or @PPB003-CAP_F_050 or @PPB003-CAP_F_051 or @PPB003-CAP_F_053 or @PPB003-CAP_F_054 or @PPB003-CAP_F_056 or @PPB003-CAP_F_057 or @PPB003-CAP_F_120 or @PPB003-CAP_F_121 or @PPB003-CAP_F_122 or @PPB003-CAP_F_123 or @PPB003-CAP_F_124 or @PPB003-CAP_F_132)"

      //, tags = "@PPB003-CAP_F_123"
        )

public class AcceptanceTestSuite {}
