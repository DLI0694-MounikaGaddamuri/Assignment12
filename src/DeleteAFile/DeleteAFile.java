package DeleteAFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteAFile {
    public static void main(String[] args){
        try {
            Path file_path = Paths.get("src/DeleteAFile/file.txt");
            Files.delete(file_path);
        }catch(IOException e) {
            System.out.println("File doesn't exist.");
        }
    }
}
