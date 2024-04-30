class Admin extends User {
    String staffNo;

    void uploadResults(String course, float score) {
        System.out.println(course + " " + score);
        // No return statement here since the method is void
    }
}
