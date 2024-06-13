/**
 * Project: SpaceGame Marzouq
 * Purpose Details: Base class for all game objects
 * Course: IST 242
 * Author: Majed Marzouq
 * Date Developed: 5/24/2024
 * Last Date Changed: 6/9/2024
 * Revision: 1.7
 */

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class MessageSender {
    private final static String QUEUE_NAME = "gameData";

    /**
     * Sends a message to a specified RabbitMQ queue.
     * @param message The message to be sent.
     */
    public static void send(String message) {
        // Create a connection factory for RabbitMQ
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");

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
}
