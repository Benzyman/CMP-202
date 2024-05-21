public class Person {
    private  String schoolName = "Bingham Uni";
    private String name;
    private String password;
    private String matricNo;
    private String staffNo;


    public Person() {
        this.name = name;
        this.password = password;
        this.schoolName = schoolName;
        this.matricNo = matricNo;
    }

    public Person(String schoolName, String name, String password, String staffNo) {
        this.schoolName = schoolName;
        this.name = name;
        this.password = password;
        this.staffNo = staffNo;
    }

    String getName() {
        return name;
    }

    String getPassword() {
        return password;
    }

    void setName(String name){
        this.name = "prince";
    }

    void setPassword(String password) {
        this.password = password;
    }
}
