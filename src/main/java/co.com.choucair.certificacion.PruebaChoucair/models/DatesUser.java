package co.com.choucair.certificacion.PruebaChoucair.models;

import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class DatesUser {

    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String language;
    private String password;

    public DatesUser(DataTable dataTable) {
        List<Map<String, String>> mapList = dataTable.asMaps(String.class, String.class);

        this.firstName = mapList.get(0).get("firstName");
        this.lastName = mapList.get(0).get("lastName");
        this.email = mapList.get(0).get("email");
        this.dateOfBirth = mapList.get(0).get("dateOfBirth");
        this.language = mapList.get(0).get("language");
        this.password = mapList.get(0).get("password");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
