import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Janek Taras on 5/13/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        File f = new File("output.txt");
        FileWriter writer;

        try {
            writer = new FileWriter(f);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        String output = "";
        String input;
        do
        {
            input = s.nextLine();
            System.out.println(input);
            output = output.concat(input).concat("\n");


        }while(!input.equals("exit"));
        if(writer!=null) try {
            System.out.println(output);
            writer.write(output);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
