import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class FileHandler{
    //init array - using arrayList due to its dynamic size
    private ArrayList<Integer> data = new ArrayList<Integer>();

    // constructor
     FileHandler() throws FileNotFoundException {
        // status message
        System.out.println(">>> Initializing FileHandler...");

        int conv; //temp store for string 2 int

        //get file
        File input = new File("C:\\Users\\cclet\\Documents\\Projects\\Java\\heap_sort\\sample.txt");
        System.out.println("Selected File: " + input);
        Scanner reader = new Scanner(input);

        //store file contents in array
        while (reader.hasNextLine()) {
            conv = Integer.parseInt(reader.nextLine()); //covert to int from string
            data.add(conv);
        }

        // finish message
        System.out.println("Storing File Content...\n" +
                "Done!");

    }

    // data setter
    private void setData(ArrayList<Integer> data) {
        this.data = data;
    }

    // data getter
    public ArrayList<Integer> getData(){
        return data;
    }
}
