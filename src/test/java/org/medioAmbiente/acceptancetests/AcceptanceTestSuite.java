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
    //   , tags = "(@PPB004-CAP_FC_001 or @PPB004-CAP_FC_002 or @PPB004-CAP_FC_003 or @PPB004-CAP_FC_004 or @PPB004-CAP_FC_005 or @PPB004-CAP_FC_006 or @PPB004-CAP_FC_007 or @PPB004-CAP_FC_008 or @PPB004-CAP_FC_009 or @PPB004-CAP_FC_010 or @PPB004-CAP_FC_011 or @PPB004-CAP_FC_012 or @PPB004-CAP_FC_013 or @PPB004-CAP_FC_014 or @PPB004-CAP_FC_015 or @PPB004-CAP_FC_016 or @PPB004-CAP_FC_017 or @PPB004-CAP_FC_018 or @PPB004-CAP_FN_001 or @PPB004-CAP_FN_002 or  @PPB004-CAP_FN_003 or @PPB004-CAP_FN_004 or @PPB004-CAP_FN_005 or @PPB004-CAP_FN_006 or @PPB004-CAP_FN_007)"
   //  , tags = "(@PPB003-CAP_F_002 or @PPB003-CAP_F_048 or @PPB003-CAP_F_049 or @PPB003-CAP_F_050 or @PPB003-CAP_F_051 or @PPB003-CAP_F_053 or @PPB003-CAP_F_054 or @PPB003-CAP_F_056 or @PPB003-CAP_F_057 or @PPB003-CAP_F_120 or @PPB003-CAP_F_121 or @PPB003-CAP_F_122 or @PPB003-CAP_F_123 or @PPB003-CAP_F_124 or @PPB003-CAP_F_132)"

   //   , tags = "@PPB004-CAP_F_003"
)

public class AcceptanceTestSuite {}
