//I worked on the homework assignment alone, using only course materials.

/**
* This class represents a Bar object
* @author Bandhan Patel
* @version 1.0.0
*/
public class Bar {

    private String chocolateType; //Stores the type of Chocolate
    private int barLength; //Stores the length of Bar
    private int barWidth; // Stores the width of Bar

    /**
     * Constructor for the Bar Class
     * @param chocolateType Chocolate Type
     * @param barLength     Bar Length
     * @param barWidth      Bar Width
     */
    public Bar(String chocolateType, int barLength, int barWidth) {
        this.chocolateType = chocolateType;
        this.barLength = barLength;
        this.barWidth = barWidth;
    }

    /**
    * Returns the Perimeter of the Bar
    * @return Perimeter of the Bar
    */
    public int getPerimeter() {
        return 2 * (barLength + barWidth);
    }

   /**
   * Returns the Area of the Bar
   * @return Area of the Bar
   */
    public int getArea() {
        return barLength * barWidth;
    }

   /**
   * Checks whether the Bar is a square or not
   * @return true or false value after checking whether the bar is a Square
   */
    public boolean isSquare() {
        if (barLength == barWidth) {
            return true;
        }
        return false;
    }

    /**
     * This method takes in two doubles and returns the cost of the Bar
     * @param  chocolateCost Cost of Chocolate
     * @param  trimCost      Cost of Trim
     * @return total;     Total cost of the bar
     */
    public double calculateCost(double chocolateCost, double trimCost) {
        double total = getArea() * chocolateCost + getPerimeter() * trimCost;
        return total;
    }

    /**
     * Returns the details of the Chocolate Bar
     * @return Details of the Bar
     */
    public String getDetails() {
        if (isSquare()) {
            return "Square " + getArea() + " piece bar of " + chocolateType + " chocolate";
        }
        return barLength + " by " + barWidth + " bar of " + chocolateType + " chocolate";
    }

    /**
     * Draws a figure of the bar.
     */
    public void drawBar() {
        char c = chocolateType.toUpperCase().charAt(0);

        for (int i = 1; i <= barLength; i++) {
            for (int j = 1; j <= barWidth; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
