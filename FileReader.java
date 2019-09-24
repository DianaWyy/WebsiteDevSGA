//I worked on the homework assignment alone, using only course materials.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) throws FileNotFoundException {
        File commandsFile = new File(args[0]);
        Scanner sc = new Scanner(commandsFile);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            Scanner s = new Scanner(line);
            if (line.contains("allcaps")) {
                System.out.println(allCaps(line.split(" ")[1]));
            }
            if (line.contains("power")) {
                String[] arguments =  line.split(" ");
                int base = Integer.parseInt(arguments[1]);
                int power = Integer.parseInt(arguments[2]);
                System.out.println(power(base, power));
            }
            if (line.contains("substring")) {
                String[] arguments = line.split(" ");
                String str = arguments[1];
                int startIndex = Integer.parseInt(arguments[2]);
                int endIndex = Integer.parseInt(arguments[3]);
                System.out.println(makeSubstring(str, startIndex, endIndex));
            }


        }

    }


    // place the three required static methods here
    public static String allCaps(String str) {
        return str.toUpperCase();
    }

    public static double power(int base, int power) {
        return Math.pow(base, power);
    }
    public static String makeSubstring(String str, int startIndex, int endIndex) {
        if  (startIndex < 0 || endIndex > str.length()) {
            return "Invalid command";
        }
        return str.substring(startIndex, endIndex);

    }
}
