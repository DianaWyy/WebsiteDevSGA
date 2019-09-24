import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PoemReader {

    /*
        Do not modify the "throws FileNotFoundException" in the method headers!

        You don't have to worry about exceptions for now, but removing this
        statement from the headers will make your code not compile.
     */

    public static void printFile(File file) throws FileNotFoundException {
      Scanner sc = new Scanner(file);
      while(sc.hasNextLine())
      {
        System.out.println(sc.nextLine());
      }
    }

    public static int wordCount(File file, String word)
        throws FileNotFoundException {
          int count = 0;
          Scanner sc=new Scanner(file);
          while(sc.hasNextLine())
          {
            String l = sc.nextLine().replaceAll("\\p{Punct}", "");
            Scanner line=new Scanner(l);
            while(line.hasNext()) {
              if(line.next().equalsIgnoreCase(word)) {
                count++;
              }
            }

          }
          return count;
    }

    public static int findLastOccurrence(File file, String word)
        throws FileNotFoundException {
            // Assume that the first line in the file is 'Line 0'
            return 0;
    }

    public static void main(String[] args) throws FileNotFoundException {
        // The filename should be passed as an argument in the command line

        /*

        Testing:

        1) Try printing the file using the printFile method
        2) Try counting how many times the word "time" appears. Should be 4
        3) Try checking the last line the word "time" appears. Should be line 34

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter file path:");
        String path= input.nextLine();
        File f= new File(path);
        printFile(f);
        System.out.println("Running wordCount():");
        System.out.println("Enter word to be searched:");
        String word = input.next();
        System.out.println("The word "+word+" appers "+wordCount(f,word)+" times");
    }

}
