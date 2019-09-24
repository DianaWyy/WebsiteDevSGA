// I worked on the homework assignment alone, using only course materials.
import java.util.Random;
/**
 * This class represents a Puppy object
 * @author Bandhan Patel
 * @version 1.0.0
 */
public class Puppy {
    private String name;
    private int age;
    private int health;

    private static Random rn = new Random();
    /**
     * Creates a new Puppy object
     * @param name   Name of the Puppy
     * @param age    Age of the Puppy
     * @param health Health of the Puppy
     */
    public Puppy(String name, int age, int health) {
        this.name = name;
        this.age = age;
        this.health = health;
    }

    /**
     * Creates a new Puppy object while randomly assigning age and health
     * @param name Name of the Puppy
     */
    public Puppy(String name) {
        this(name, rn.nextInt(15) + 1, 5 + rn.nextInt(35 - 5 + 1));
    }

    /**
     * Returns the name of the Puppy
     * @return Puppy's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the age of the Puppy
     * @return Puppy's age
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns Puppy's current Health
     * @return Current health
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets Puppy's Name
     * @param name Puppy's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets Puppy's Age
     * @param age Puppy's age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets Puppy's health
     * @param health Health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Returns a String representation of the object by overriding the toString() method
     * @return String representation
     */
    public String toString() {
        return name + " a puppy " + age + " years old with " + health + " health";
    }

    /**
     * Returns whether the puppy can be adopted
     * @return a true or false value
     */
    public boolean canAdopt() {
        if (health >= 50) {
            return true;
        }
        return false;
    }

    /**
     * Increases puppy's health when invoked
     */
    public void fetch() {
        health++;
    }

    /**
     * Increases puppy's health when invoked
     * @param inside Checks whether the puppy is inside or not
     */
    public void fetch(boolean inside) {
        if (inside) {
            health += 5;
        }
        health += 10;
    }

    /**
     * Increases puppy's health when invoked
     * @param distance Distance travelled
     */
    public void fetch(int distance) {
        health += (int) (distance / 10);
    }

}
