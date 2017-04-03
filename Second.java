import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
/**
 * A simple example program that reads a text file into a String using Files.lines and stream.
 */
public class secondSecond {
    public static void main(String[] args) throws IOException {
        String contents = Files.lines(Paths.get("C:\\Users\\TM36271\\Documents\\NetBeansProjects\\First")).collect(Collectors.joining("\n"));
        try {
  FileOutputStream out = new FileOutputStream(new File("binSecond"));
} catch (FileNotFoundException e) {
}
    }
}
