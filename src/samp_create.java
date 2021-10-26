/*
 * Charles Lett Jr.
 * October 20, 2021
 * program to generate a sample file of integer values for use in class projects/homework
 */

import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class samp_create {
    public static void main(String[] args) throws FileNotFoundException{
        String FileLocation = "C:\\Users\\cclet\\Documents\\Projects\\Java\\heap_sort\\sample.txt";
        // ^ specifies where to create the sample file
        // if using desktop as path, syntax should be similar to:
        //      - C:\\Users\\<YOUR_USERNAME_HERE>\\Desktop\\<FILENAME.txt>
        int numLength, val; // init var for number of values and random value
        Scanner uInput = new Scanner(System.in); // init user input for number of val
        Random rand = new Random(); // init for RNG

        // welcome message
        System.out.println("""
                Hello!
                Given that our assignments so far have required us to use a file containing numbers
                I decided to create a little program that creates said file automatically to avoid
                the headache of typing out random numbers for however many values are requested
                (For instance, the heap sort project requires a text file of 10 numbers)
                
                If you have any questions about using the program feel free to reach out on
                GroupMe or email me at: 'charles.lett@langston.edu'
                
                Good luck with your work! <3
                - Charles
                """);

        // collect num length for file
        System.out.println("How many values are required for your project/homework?");
        numLength = uInput.nextInt(); // store user input (num of val)

        // create file
        File newFile = new File(FileLocation); // create file
        PrintWriter writeFile = new PrintWriter(new FileOutputStream(newFile)); //init for file writer
        System.out.println("File created!\n > Path: " + newFile); // verify message

        // loop to generate/write values to file
        System.out.println("Beginning File Write..."); // write start message
        for (int i = 0; i < numLength; i++){
            val = rand.nextInt(999); // gen random num
            if (i == numLength - 1){
                // write random num to file; avoids empty line if at end of file
                writeFile.write(String.valueOf(val));
            }
            else{
                // write random num to file (every line)
                writeFile.write(String.valueOf(val) + "\n");
            }
        }

        // output to user with tips, finish message, etc.
        System.out.println("File Write Completed!"); // write finish message

        System.out.println("""
                ***NOTE***
                (AFTER RUN) If using an IDE like IntelliJ IDEA, you should be able to click on the line after '> Path:' to access the sample file.
                   > do this to verify everything worked!
                   > can also copy the line to use as your path for reading in the file!""");

        writeFile.close(); // close file writer

    }
}


