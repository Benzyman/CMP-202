public class User {
    String name;
    String password;

    void login() {
        System.out.println("Logging");
    }

    String register() {
        if (name.equals("") || password.equals("")) {
            return "Invalid Login";
        } else {
            return "Success";
        }
    }
}
