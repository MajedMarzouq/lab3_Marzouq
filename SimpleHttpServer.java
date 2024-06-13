/**
 * Project: SpaceGame Marzouq
 * Purpose Details: Base class for all game objects
 * Course: IST 242
 * Author: [Majed Marzouq]
 * Date Developed: 5/24/2024
 * Last Date Changed: 6/13/2024
 * Revision: 1.9
 */

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import java.nio.charset.StandardCharsets;

public class SimpleHttpServer {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/gameData", new MyHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }

    static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // Read the request body
            InputStream requestBody = exchange.getRequestBody();
            String body = new String(requestBody.readAllBytes(), StandardCharsets.UTF_8);

            System.out.println("Received: " + body);

            // Create the JSON response
            String response = "{\"shiptype\": \"Scout\", \"ammo\": 50, \"health\": 5, \"speed\": 10}";

            // Send the JSON response
            exchange.sendResponseHeaders(200, response.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}
