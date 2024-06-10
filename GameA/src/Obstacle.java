/**
 * Project: SpaceGame Marzouq
 * Purpose Details: Represents an obstacle
 * Course: IST 242
 * Author: [Majed Marzouq]
 * Date Developed: 5/24/2024
 * Last Date Changed: 5/26/2024
 * Revision: 1.1
 */
public class Obstacle extends Game {

    /**
     * The damage caused by the obstacle.
     */
    private int damage;

    /**
     * The type of the obstacle.
     */
    private char type;

    /**
     * The X position of the obstacle.
     */
    private double positionX;

    /**
     * The Y position of the obstacle.
     */
    private double positionY;

    /**
     * The size of the obstacle.
     */
    private int size;

    /**
     * Constructor to initialize the obstacle's attributes.
     *
     * @param damage The damage caused by the obstacle.
     * @param type The type of the obstacle.
     * @param positionX The X position of the obstacle.
     * @param positionY The Y position of the obstacle.
     * @param size The size of the obstacle.
     */
    public Obstacle(int damage, char type, double positionX, double positionY, int size) {
        this.damage = damage;
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
        this.size = size;
    }

    /**
     * Gets the damage caused by the obstacle.
     *
     * @return The damage caused by the obstacle.
     */
    public int getDamage() {
        return damage;
    }

    /**
     * Sets the damage caused by the obstacle.
     *
     * @param damage The damage to set for the obstacle.
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * Gets the type of the obstacle.
     *
     * @return The type of the obstacle.
     */
    public char getType() {
        return type;
    }

    /**
     * Sets the type of the obstacle.
     *
     * @param type The type to set for the obstacle.
     */
    public void setType(char type) {
        this.type = type;
    }

    /**
     * Gets the X position of the obstacle.
     *
     * @return The X position of the obstacle.
     */
    public double getPositionX() {
        return positionX;
    }

    /**
     * Sets the X position of the obstacle.
     *
     * @param positionX The X position to set for the obstacle.
     */
    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    /**
     * Gets the Y position of the obstacle.
     *
     * @return The Y position of the obstacle.
     */
    public double getPositionY() {
        return positionY;
    }

    /**
     * Sets the Y position of the obstacle.
     *
     * @param positionY The Y position to set for the obstacle.
     */
    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }

    /**
     * Gets the size of the obstacle.
     *
     * @return The size of the obstacle.
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets the size of the obstacle.
     *
     * @param size The size to set for the obstacle.
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Returns a string representation of the obstacle object.
     *
     * @return A string containing the obstacle's damage, type, positionX, positionY, and size.
     */
    @Override
    public String toString() {
        return "Obstacle damage='" + damage + "', type=" + type + "', positionX='" + positionX + "', positionY='" + positionY + "', size='" + size + "'";
    }
}


