/**
 * Project: SpaceGame Marzouq
 * Purpose Details: Base class for all game objects
 * Course: IST 242
 * Author: [Majed Marzouq]
 * Date Developed: 5/24/2024
 * Last Date Changed: 6/2/2024
 * Revision: 1.4
 */

import com.mongodb.client.*;
import org.bson.Document;

public class Mongo {
    // MongoDB connection details
    private static final String URL = "mongodb://localhost:27017";
    private static final String DataBase = "spacegame_db";
    private static final String Collection = "ship";

    /**
     * Inserts a document with the given health points into the ship collection.
     *
     * @param health The health points to be inserted.
     */
    public void insertShipHealth(int health) {
        try (MongoClient mongoClient = MongoClients.create(URL)) {
            MongoDatabase database = mongoClient.getDatabase(DataBase);
            MongoCollection<Document> collection = database.getCollection(Collection);

            // Insert a document
            Document newDocument = new Document("id", 1).append("healthpoints", health);
            collection.insertOne(newDocument);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Updates the health points of the document with the given ID in the ship collection.
     *
     * @param id The ID of the document to be updated.
     * @param health The new health points to be set.
     */
    public void updateShipHealth(int id, int health) {
        try (MongoClient mongoClient = MongoClients.create(URL)) {
            MongoDatabase database = mongoClient.getDatabase(DataBase);
            MongoCollection<Document> collection = database.getCollection(Collection);

            // Update the document
            Document updatedDocument = new Document("$set", new Document("healthpoints", health));
            collection.updateOne(new Document("id", id), updatedDocument);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Reads the health points of the document with the given ID from the ship collection.
     *
     * @param id The ID of the document whose health points are to be read.
     * @return The health points of the document.
     */
    public int readShipHealth(int id) {
        try (MongoClient mongoClient = MongoClients.create(URL)) {
            MongoDatabase database = mongoClient.getDatabase(DataBase);
            MongoCollection<Document> collection = database.getCollection(Collection);

            // Read the document
            FindIterable<Document> documents = collection.find(new Document("id", id));
            for (Document document : documents) {
                return document.getInteger("healthpoints");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * Deletes the document with the given ID from the ship collection.
     *
     * @param id The ID of the document to be deleted.
     */
    public void deleteShipHealth(int id) {
        try (MongoClient mongoClient = MongoClients.create(URL)) {
            MongoDatabase database = mongoClient.getDatabase(DataBase);
            MongoCollection<Document> collection = database.getCollection(Collection);

            // Delete the document
            collection.deleteMany(new Document("id", id));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
