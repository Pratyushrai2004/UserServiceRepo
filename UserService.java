public class UserService {
    public String greetUser(String name) {
        return "Hello, " + name;
    }

    // Main method to run the program
    public static void main(String[] args) {
        UserService userService = new UserService();
        System.out.println(userService.greetUser("World"));
    }
}
