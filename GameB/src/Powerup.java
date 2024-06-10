/**
 * Project: SpaceGame Marzouq
 * Purpose Details: Represents a power-up
 * Course: IST 242
 * Author: [Majed Marzouq]
 * Date Developed: 5/24/2024
 * Last Date Changed: 5/26/2024
 * Revision: 1.1
 */
public class Powerup extends Game {

    /**
     * The effect of the power-up.
     */
    private String effect;

    /**
     * The shield boost provided by the power-up.
     */
    private String shieldBoost;

    /**
     * Constructor to initialize the power-up's attributes.
     *
     * @param effect The effect of the power-up.
     * @param shieldBoost The shield boost provided by the power-up.
     */
    public Powerup(String effect, String shieldBoost) {
        this.effect = effect;
        this.shieldBoost = shieldBoost;
    }

    /**
     * Gets the effect of the power-up.
     *
     * @return The effect of the power-up.
     */
    public String getEffect() {
        return effect;
    }

    /**
     * Sets the effect of the power-up.
     *
     * @param effect The effect to set for the power-up.
     */
    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * Gets the shield boost provided by the power-up.
     *
     * @return The shield boost of the power-up.
     */
    public String getShieldBoost() {
        return shieldBoost;
    }

    /**
     * Sets the shield boost provided by the power-up.
     *
     * @param shieldBoost The shield boost to set for the power-up.
     */
    public void setShieldBoost(String shieldBoost) {
        this.shieldBoost = shieldBoost;
    }

    /**
     * Returns a string representation of the power-up object.
     *
     * @return A string containing the power-up's effect and shield boost.
     */
    @Override
    public String toString() {
        return "PowerUp effect='" + effect + "', shieldBoost='" + shieldBoost + "'";
    }
}
