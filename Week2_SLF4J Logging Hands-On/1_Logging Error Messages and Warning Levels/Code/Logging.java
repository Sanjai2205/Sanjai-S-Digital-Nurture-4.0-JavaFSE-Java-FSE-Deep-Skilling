import java.util.logging.Logger;
import java.util.logging.Level;

public class Logging {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        logger.setLevel(Level.ALL);

        logger.severe("This is an error message (SEVERE)");
        logger.warning("This is a warning message (WARNING)");
        logger.info("This is an info message (INFO)");
    }
}
