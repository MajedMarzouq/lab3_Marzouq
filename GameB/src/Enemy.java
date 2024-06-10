/**
 * Project: SpaceGame Marzouq
 * Purpose Details: Represents an enemy
 * Course: IST 242
 * Author: [Majed Marzouq]
 * Date Developed: 5/24/2024
 * Last Date Changed: 5/26/2024
 * Revision: 1.1
 */
public class Enemy extends Game {

    /**
     * The strength of the enemy.
     */
    private int strength;

    /**
     * The defense of the enemy.
     */
    private int defense;

    /**
     * The attack power of the enemy.
     */
    private int attackPower;

    /**
     * Constructor to initialize the enemy's attributes.
     *
     * @param strength The strength of the enemy.
     * @param defense The defense of the enemy.
     * @param attackPower The attack power of the enemy.
     */
    public Enemy(int strength, int defense, int attackPower) {
        this.strength = strength;
        this.defense = defense;
        this.attackPower = attackPower;
    }

    /**
     * Gets the strength of the enemy.
     *
     * @return The strength of the enemy.
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Sets the strength of the enemy.
     *
     * @param strength The strength to set for the enemy.
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * Gets the defense of the enemy.
     *
     * @return The defense of the enemy.
     */
    public int getDefense() {
        return defense;
    }

    /**
     * Sets the defense of the enemy.
     *
     * @param defense The defense to set for the enemy.
     */
    public void setDefense(int defense) {
        this.defense = defense;
    }

    /**
     * Gets the attack power of the enemy.
     *
     * @return The attack power of the enemy.
     */
    public int getAttackPower() {
        return attackPower;
    }

    /**
     * Sets the attack power of the enemy.
     *
     * @param attackPower The attack power to set for the enemy.
     */
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    /**
     * Returns a string representation of the enemy object.
     *
     * @return A string containing the enemy's strength, defense, and attack power.
     */
    @Override
    public String toString() {
        return "Enemy strength='" + strength + "', defense='" + defense + "', attackPower='" + attackPower + "'";
    }
}

