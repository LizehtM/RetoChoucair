package co.com.choucair.certificacion.PruebaChoucair.models;

import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class DatesLogin {

    private String email;
    private String password;

    public DatesLogin(DataTable dataTable) {
        List<Map<String, String>> mapList = dataTable.asMaps(String.class, String.class);

        this.email = mapList.get(0).get("email");
        this.password = mapList.get(0).get("password");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
