/**
 * Project: SpaceGame Marzouq
 * Purpose Details: Base class for all game objects
 * Course: IST 242
 * Author: [Majed Marzouq]
 * Date Developed: 5/24/2024
 * Last Date Changed: 6/9/2024
 * Revision: 1.7
 */

import com.rabbitmq.client.*;

public class MessageReceiver {
    private final static String QUEUE_NAME = "gameData";

    /**
     * Sets up a connection to RabbitMQ, declares a queue, and starts listening for messages.
     */
    public static void receive() {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost"); // Make sure RabbitMQ is running on localhost

        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

            DeliverCallback deliverCallback = (consumerTag, delivery) -> {
                String message = new String(delivery.getBody(), "UTF-8");
                System.out.println(" [x] Received '" + message + "'");
                String[] dataParts = message.split(",");
                System.out.println("Game: " + dataParts[0]);
                System.out.println("Level: " + dataParts[1]);
            };
            channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> {});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
