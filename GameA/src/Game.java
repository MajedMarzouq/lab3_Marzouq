/**
 * Project: SpaceGame Marzouq
 * Purpose Details: Base class for all game objects
 * Course: IST 242
 * Author: [Majed Marzouq]
 * Date Developed: 5/24/2024
 * Last Date Changed: 6/9/2024
 * Revision: 1.7
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

        // Example serialization and message sending
        String gameData = "Example Game,Level 1";
        send(gameData);
    }

    /**
     * Sends serialized game data to a RabbitMQ queue.
     * @param message The game data to send as a string.
     */
    public static void send(String message) {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost"); // Ensure RabbitMQ is running on localhost
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            System.out.println(" [x] Sent '" + message + "'");
        } catch (Exception e) {
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


