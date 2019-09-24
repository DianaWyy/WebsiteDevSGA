//I worked on the homework assignment alone, using only course materials
/**
 * This class represents a User object
 * @author Bandhan Patel
 * @version 1.0
 */
public class User {
    private String username;
    private int password;
    private static int numUsers = 0;
    private static User newestUser = null;
    private static boolean displayNewest = true;

    /**
     * Creates a new User object
     * @param username Username
     * @param password Password
     */
    public User(String username, int password) {
        this.username = username;
        this.password = password;
        numUsers++;
        User.newestUser = this;

    }


    /**
     * Sets the value of displayNewest
     * @param displayNewest Boolean value
     */
    public static void setDisplayNewest(boolean displayNewest) {
        User.displayNewest = displayNewest;
    }

    /**
     * Returns the number of users
     * @return number of users
     */
    public static int getNumUsers() {
        return numUsers;
    }

    /**
     * Returns the username
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Displays a Welcome message
     * @return Welcome message
     */
    public static String getWelcomeMessage() {
        if (numUsers == 0) {
            return "This site doesn't have any users yet!";
        }
        if (!displayNewest) {
            return "Welcome to our site! We have " + numUsers + " user(s) and counting!";
        }
        return newestUser.username + " just joined our site! Please give them a warm welcome!";
    }

    /**
     * Changes the current password
     * @param usernameInput Current username
     * @param passwordInput Current password
     * @param newPassword   New Password
     */
    public void changePassword(String usernameInput, int passwordInput, int newPassword) {
        if (usernameInput.equals(username) && passwordInput == password) {
            password = newPassword;
        }
    }

    /**
     * Checks whether the login is correct or not
     * @param  usernameInput Username
     * @param  passwordInput Password
     * @return Whether the login is valid or not
     */
    public boolean validLogin(String usernameInput, int passwordInput) {
        if (usernameInput.equals(username) && passwordInput == password) {
            return true;
        }
        return false;
    }




}
