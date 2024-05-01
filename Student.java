public class Student extends User {
    String matricNo = "BHU/22/04/05/0043";
    String adminNo = " jdejkedjdfjeekfer";


    public String registerCourse() {
        if (matricNo.equals("") || adminNo.equals((""))){
            return "you can't register course";
        }else {
            return "Succesful";
        }
    }

    public String uploadResult(String password) {
        return "Result uploaded for " + matricNo + " with password: " + password;
    }
}
