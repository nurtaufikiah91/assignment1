package first;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import static java.nio.charset.StandardCharsets.UTF_8;
import java.util.Scanner;

/**
 *
 * @author Nurtaufikiah
 */
public class assignmentOne {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        //create text file and write characters into it
        File file = new File("first.txt");

        try (Writer writer = new BufferedWriter(new FileWriter(file))) {
            String contents = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
             writer.write(contents);
        } catch (IOException e) {
        }
        
        //read the content of text file and create bin file
        Scanner inputStream = null;
         try {
             inputStream = new Scanner (new FileInputStream ("first.txt"));
            try (FileOutputStream fos = new FileOutputStream("second.dat")) {
                String contents = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
                byte[] bytes;
                 bytes = contents.getBytes(UTF_8);
                writer.write(contents);
            }
         }
         catch (FileNotFoundException e){
    }    
}}
  
