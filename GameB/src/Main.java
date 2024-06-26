/**
 * Project: SpaceGame Marzouq
 * Purpose Details: Base class for all game objects
 * Course: IST 242
 * Author: [Majed Marzouq]
 * Date Developed: 5/24/2024
 * Last Date Changed: 6/13/2024
 * Revision: 1.9
 */

public class Main {
    /**
     * Main method to start the application and initiate message receiving.
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        // Starts listening for messages using the MessageReceiver class
        MessageReceiver.receive();
    }
}
