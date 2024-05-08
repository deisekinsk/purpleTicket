import java.util.Random;

public class User {

    private Random random;
    private int userID;
    private String userName;

    public User(String userName) {
        this.userName = userName;
        random = new Random();
        // nextInt(0 to 999) choose integer number | add 100 ensures a sequence of 3 numbers
        this.userID = random.nextInt(900) + 100;
    }

    public String toString() {
        return "User " + userName +
                " ID: " + userID;
    }
}