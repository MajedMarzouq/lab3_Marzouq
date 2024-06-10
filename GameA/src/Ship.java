/**
 * Project: SpaceGame Marzouq
 * Purpose Details: Represents the ship
 * Course: IST 242
 * Author: [Majed Marzouq]
 * Date Developed: 5/24/2024
 * Last Date Changed: 5/26/2024
 * Revision: 1.1
 */
public class Ship extends Game {

    /**
     * The health of the ship.
     */
    private int health;

    /**
     * The color of the ship.
     */
    private String color;

    /**
     * The speed of the ship.
     */
    private int speed;

    /**
     * Constructor to initialize the ship's attributes.
     *
     * @param health The health of the ship.
     * @param speed The speed of the ship.
     * @param color The color of the ship.
     */
    public Ship(int health, int speed, String color) {
        this.health = health;
        this.color = color;
        this.speed = speed;
    }

    /**
     * Gets the health of the ship.
     *
     * @return The health of the ship.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets the health of the ship.
     *
     * @param health The health to set for the ship.
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Gets the color of the ship.
     *
     * @return The color of the ship.
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the ship.
     *
     * @param color The color to set for the ship.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets the speed of the ship.
     *
     * @return The speed of the ship.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the speed of the ship.
     *
     * @param speed This is the speed of the ship.
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Returns a string representation of the ship object.
     *
     * @return A string containing the ship's health, color, and speed.
     */
    @Override
    public String toString() {
        return "Ship health='" + health + "', Color='" + color + "', Speed='" + speed + "'";
    }
}
