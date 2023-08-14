package model1;

public class Person {
    private String firstName;
    private String lastName;
    private String domisili;
    private Integer birthYear;
    private String progrLangFav;

    public void setFirstName(String fName){
        firstName = fName;
    }

    public void setLastName(String lName){
        lastName = lName;
    }

    public String getNamaLengkap(){
        return firstName + " " + lastName;
    }

    public void setDomisili(String domicile) {
        domisili = domicile;
    }

    public String getDomisili() {
        return domisili;
    }

    public void setBirthYear(Integer bYear){
        birthYear = bYear;
    }

    public Integer getUsia(){
        return 2023 - birthYear;
    }

    public void setProgrLangFav(String ProgrLangFav) {
        this.progrLangFav = ProgrLangFav;
    }

    public String getProgrLangFav() {
        return this.progrLangFav;
    }    
}
