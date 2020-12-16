package br.com.serenitybddtemplate.dbsteps;

import br.com.serenitybddtemplate.utils.DBUtils;
import br.com.serenitybddtemplate.utils.GeneralUtils;
import net.thucydides.core.annotations.Step;

public class UsersDBSteps {

    private String sqlPath = "src/test/java/br/com/serenitybddtemplate/sqls/users/";



    @Step("zerar base")
    public void executaQuery( String query) {
        try {
            String pathQuery = GeneralUtils.getFileContentAsString(sqlPath + query);
            DBUtils.executarQuery(pathQuery);
        } catch (Exception ignored) {

        }
    }
}
