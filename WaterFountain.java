// I worked on the homework assignment alone, using only course materials
/**
 * This class represents a WaterFountain object
 * @author Bandhan Patel
 * @version 1.0.0
 */
public class WaterFountain {
    private String modelName;
    private boolean requiresMaintenance;
    private int cupsPoured;

    private static int totalWaterFountains = 0;
    public static final String SOFTWARE_VERSION = "2.0.0";

  /**
   * Creates a WaterFountain
   * @param modelName  Name of the model
   * @param cupsPoured Number of cups initially poured
   */
    public WaterFountain(String modelName, int cupsPoured) {
        this.modelName = modelName;
        this.cupsPoured = cupsPoured;
        this.requiresMaintenance = false;
        totalWaterFountains++;
    }

  /**
   * Return the name of the model
   * @return modelName
   */
    public String getModelName() {
        return modelName;
    }

  /**
   * Sets the name of the model
   * @param name Name of the model
   */
    public void setModelName(String name) {
        this.modelName = name;
    }

  /**
   * Returns whether the fountain requires maintenance or not.
   * @return requiresMaintenance
   */
    public boolean getRequiresMaintenance() {
        return requiresMaintenance;
    }

  /**
   * Sets the maintenance requirement status
   * @param value Whether the machine requires maintenance or not ?
   */
    public void setRequiresMaintenance(boolean value) {
        this.requiresMaintenance = value;
    }

 /**
  * Returns the number of cups poured
  * @return cupsPoured
  */
    public int getCupsPoured() {
        return cupsPoured;
    }

  /**
   * Sets the number of cups poured
   * @param cups number of cups poured
   */
    public void setCupsPoured(int cups) {
        this.cupsPoured = cups;
    }

  /**
   * Returns total number of water fountains
   * @return totalWaterFountains
   */
    public static int getTotalWaterFountains() {
        return totalWaterFountains;
    }

  /**
   * Increments number of cups by 1 when the method is accessed.
   */
    public void pourCup() {
        if (!requiresMaintenance) {
            cupsPoured++;
        }
    }

  /**
   * Checks the equality of two objects.
   * @param  other Other WaterFountain object
   * @return whether the objects are equal or not.
   *
   */
    public boolean equals(WaterFountain other) {
      // No need to check software version because it is a constant value
        return modelName.equalsIgnoreCase(other.modelName) && cupsPoured == other.cupsPoured;
    }

  /**
   * Returns a String representation of the WaterFountain object
   * @return String
   */
    public String toString() {
        if (requiresMaintenance) {
            return modelName + " has poured " + cupsPoured
                + " cups, requires maintenance, and is running version: "
                + SOFTWARE_VERSION;
        }
        return modelName + " has poured " + cupsPoured
            + " cups, does not require maintenance, and is running version: "
            + SOFTWARE_VERSION;
    }

}
