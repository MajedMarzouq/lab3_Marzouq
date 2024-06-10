import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Project: SpaceGame Marzouq
 * Purpose Details: Base class for all game objects
 * Course: IST 242
 * Author: [Majed Marzouq]
 * Date Developed: 5/24/2024
 * Last Date Changed: 6/9/2024
 * Revision: 1.7
 */
public class Game {

    /**
     * The main method is the entry point of the application.
     * It creates instances of the game objects and prints their details.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Disable MongoDB logging to SEVERE level to reduce log noise
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        // Create instances of MySQL and MongoDB classes
        Mysql mySQL = new Mysql();
        Mongo mongo = new Mongo();

        // Insert health points into MySQL and MongoDB
        System.out.println("Insert Health Point MySQL");
        mySQL.insertShipHealth(100);
        System.out.println("Insert Health Point MongoDB");
        mongo.insertShipHealth(200);

        // Update health points in MySQL and MongoDB
        System.out.println("Update Health Point MySQL");
        mySQL.updateShipHealth(2, 300);
        System.out.println("Update Health Point MongoDB");
        mongo.updateShipHealth(1, 100);

        // Read health points from MySQL and MongoDB
        System.out.println("Read Health Point MySQL");
        int healthPoints_mysql = mySQL.readShipHealth(1);
        System.out.println(healthPoints_mysql);

        System.out.println("Read Health Point Mongo");
        int healthPoints_mongo = mongo.readShipHealth(1);
        System.out.println(healthPoints_mongo);

        // Delete health points from MySQL and MongoDB
        System.out.println("Delete Health Point MySQL");
        mySQL.deleteShipHealth(2);
        System.out.println("Delete Health Point MongoDb");
        mongo.deleteShipHealth(1);
    }

    /**
     * Converts the given string to a string representation.
     *
     * @param string The string to be converted.
     * @return The string representation of the given string.
     */
    public String toString(String string) {
        return string;
    }
}
