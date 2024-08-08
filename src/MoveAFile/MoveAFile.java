package MoveAFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoveAFile {
    public static void main(String[] args) {
        try {
            Path file1 = Paths.get("src/MoveAFile/file1.txt");
            if (Files.exists(file1))
                System.out.println("File already exists.");
            else {
                Files.createFile(file1);
                System.out.println(file1.getFileName()+" created.");
            }
            Path target = Paths.get("src/CopyAFile/source.txt");

            Files.move(file1,target, StandardCopyOption.REPLACE_EXISTING);

        }catch(IOException e){e.printStackTrace();}
    }
}
