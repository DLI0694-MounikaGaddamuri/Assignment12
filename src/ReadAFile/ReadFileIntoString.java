package ReadAFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileIntoString {
    public static void main(String[] args) {
        try {
            Path file_path = Paths.get("src/ReadAFile/file.txt");
            if(Files.exists(file_path))
                System.out.println(file_path.getFileName()+" already exists.");
            else {
                Files.createFile(file_path);
                System.out.println(file_path.getFileName() + " created.");
            }
            String content = Files.readString(file_path);

            System.out.println("Content from the file is: \n"+content);
        }catch (IOException e) {System.out.println(e);}

    }
}
