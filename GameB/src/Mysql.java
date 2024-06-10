/**
 * Project: SpaceGame Marzouq
 * Purpose Details: Base class for all game objects
 * Course: IST 242
 * Author: [Majed Marzouq]
 * Date Developed: 5/24/2024
 * Last Date Changed: 6/2/2024
 * Revision: 1.4
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Mysql {
    // Database connection details
    private static final String URL = "jdbc:mysql://localhost:3306/spacegamedb";
    private static final String USER = "root";
    private static final String PASSWORD = "IST888IST888";

    /**
     * Inserts the given health points into the ship table.
     *
     * @param health The health points to be inserted.
     */
    public void insertShipHealth(int health) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "INSERT INTO ship (HealthPoints) VALUES (?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, health);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Updates the health points of the ship with the given ID.
     *
     * @param id The ID of the ship to be updated.
     * @param health The new health points to be set.
     */
    public void updateShipHealth(int id, int health) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "UPDATE ship SET HealthPoints = ? WHERE Id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, health);
            statement.setInt(2, id);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Reads the health points of the ship with the given ID.
     *
     * @param id The ID of the ship whose health points are to be read.
     * @return The health points of the ship.
     */
    public int readShipHealth(int id) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "SELECT HealthPoints FROM ship WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt("HealthPoints");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * Deletes the ship with the given ID from the ship table.
     *
     * @param id The ID of the ship to be deleted.
     */
    public void deleteShipHealth(int id) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "DELETE FROM ship WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
