import java.util.logging.Logger;

public class R00_IDS03_J {
    
    private static final Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());

    public static void main(String[] args) {
        // Assuming loginSuccessful and username are defined elsewhere
        boolean loginSuccessful = true; // Example value
        String username = "exampleUser"; // Example value
        
        logLoginStatus(loginSuccessful, username);
    }

    public static void logLoginStatus(boolean loginSuccessful, String username) {
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }
    }
}
