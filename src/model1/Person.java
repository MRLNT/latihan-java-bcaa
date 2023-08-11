package model1;

public class Person {
    private String firstName;
    private String lastName;
    private String domicile;
    private Integer birthYear;
    private String progrLangFav;

    public void setFirstName(String fName){
        firstName = fName;
    }

    public void setLastName(String lName){
        lastName = lName;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    public String getDomicile() {
        return this.domicile;
    }

    public void setBirthYear(Integer bYear){
        birthYear = bYear;
    }

    public void setProgrLangFav(String ProgrLangFav) {
        this.progrLangFav = ProgrLangFav;
    }

    public String getProgrLangFav() {
        return this.progrLangFav;
    }

    public String getNamaLengkap(){
        return firstName + " " + lastName;
    }

    public Integer getUsia(){
        return 2023 - birthYear;
    }
    
}
