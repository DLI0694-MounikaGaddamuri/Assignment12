package WriteDataToFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class WriteDataToAFile {
    public static void main(String[] args) {
        Path p = Paths.get("src/WriteDataToFile/textFile.txt");
        List<String> data = Arrays.asList("Hello!","This is a java program.","Writing data from collection of lines.");
        try{
            Files.write(p,data, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
            System.out.println("Completed!");
        }catch(IOException e){e.printStackTrace();}
    }
}
