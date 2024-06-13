/**
 * Project: SpaceGame Marzouq
 * Purpose Details: Base class for all game objects
 * Course: IST 242
 * Author: Majed Marzouq
 * Date Developed: 5/24/2024
 * Last Date Changed: 6/13/2024
 * Revision: 1.9
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Game {

    private final static String QUEUE_NAME = "gameData";

    /**
     * Main method to set up database logging, initialize connections, and send game data.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Set MongoDB logging to SEVERE to reduce verbosity
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        // Database connections
        Mysql mySQL = new Mysql();
        Mongo mongo = new Mongo();

        // Example data for multiple ships
        String[] shipData = {
                "Scout 50 5 10",
                "Destroyer 20 100 3",
                "Fighter 10 75 6"
        };

        // Send each ship's data to RabbitMQ
        for (String data : shipData) {
            send(data);
        }
    }

    /**
     * Sends serialized game data to a RabbitMQ queue.
     * @param message The game data to send as a string.
     */
    public static void send(String message) {
        // Create a connection factory for RabbitMQ
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost"); // Ensure RabbitMQ is running on localhost

        // Try-with-resources to auto-close connection and channel
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            // Declare the queue to send the message to
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            // Publish the message to the queue
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            System.out.println(" [x] Sent '" + message + "'");
        } catch (Exception e) {
            // Print stack trace if an exception occurs
            e.printStackTrace();
        }
    }

    /**
     * Returns the string representation of an object.
     * @param string The string to be returned.
     * @return The same string passed as an argument.
     */
    public String toString(String string) {
        return string;
    }
}


