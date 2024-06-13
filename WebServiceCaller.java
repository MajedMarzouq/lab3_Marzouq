/**
 * Project: SpaceGame Marzouq
 * Purpose Details: Base class for all game objects
 * Course: IST 242
 * Author: [Majed Marzouq]
 * Date Developed: 5/24/2024
 * Last Date Changed: 6/13/2024
 * Revision: 1.9
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class WebServiceCaller {
    public static void main(String[] args) {
        try {
            // URL of the web service
            String url = "http://localhost:8000/gameData";

            // Create a URL object
            URL obj = new URL(url);

            // Open a connection to the URL
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            // Set the request method to POST
            con.setRequestMethod("POST");
            con.setDoOutput(true);

            // Set request headers
            con.setRequestProperty("Content-Type", "application/json");

            // JSON data to send
            String jsonInputString = "{\"shiptype\": \"Scout\", \"ammo\": 50, \"health\": 5, \"speed\": 10}";

            // Send the JSON data
            try(OutputStream os = con.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Get the response code
            int responseCode = con.getResponseCode();
            System.out.println("Response Code : " + responseCode);

            // Read and print the response from the web service
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Print the response
            String responseString = response.toString();
            System.out.println("Response: " + responseString);

            // Parse the JSON response
            Gson gson = new Gson();
            JsonObject jsonResponse = gson.fromJson(responseString, JsonObject.class);
            String shiptype = jsonResponse.get("shiptype").getAsString();
            int ammo = jsonResponse.get("ammo").getAsInt();
            int health = jsonResponse.get("health").getAsInt();
            int speed = jsonResponse.get("speed").getAsInt();

            // Print the parsed values
            System.out.println("\nGame object deserialized from JSON string:");
            System.out.println("Ship type: " + shiptype);
            System.out.println("Ammo: " + ammo);
            System.out.println("Health: " + health);
            System.out.println("Speed: " + speed);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

