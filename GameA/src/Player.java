/**
 * Project: SpaceGame Marzouq
 * Purpose Details: Represents the player
 * Course: IST 242
 * Author: [Majed Marzouq]
 * Date Developed: 5/24/2024
 * Last Date Changed: 5/26/2024
 * Revision: 1.1
 */
public class Player extends Game {

    /**
     * The name of the player.
     */
    private String name;

    /**
     * The current score of the player.
     */
    private int score;

    /**
     * The current level of the player.
     */
    private int level;

    /**
     * The maximum score the player has achieved.
     */
    private int maxScore;

    /**
     * Constructor to initialize the player's attributes.
     *
     * @param name The name of the player.
     * @param score The current score of the player.
     * @param level The current level of the player.
     * @param maxScore The maximum score the player has achieved.
     */
    public Player(String name, int score, int level, int maxScore) {
        this.name = name;
        this.score = score;
        this.level = level;
        this.maxScore = maxScore;
    }

    /**
     * Gets the name of the player.
     *
     * @return The name of the player.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the player.
     *
     * @param name The name to set for the player.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the current score of the player.
     *
     * @return The current score of the player.
     */
    public int getScore() {
        return score;
    }

    /**
     * Sets the current score of the player.
     *
     * @param score The score to set for the player.
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * Gets the current level of the player.
     *
     * @return The current level of the player.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the current level of the player.
     *
     * @param level The level to set for the player.
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Gets the maximum score the player has achieved.
     *
     * @return The maximum score of the player.
     */
    public int getMaxScore() {
        return maxScore; // Corrected to return maxScore instead of score
    }

    /**
     * Sets the maximum score the player has achieved.
     *
     * @param maxScore The maximum score to set for the player.
     */
    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

    /**
     * Returns a string representation of the player object.
     *
     * @return A string containing the player's name, score, level, and max score.
     */
    @Override
    public String toString() {
        return "Player name='" + name + "', score=" + score + "', Level='" + level + "', Max Score='" + maxScore + "'";
    }
}

