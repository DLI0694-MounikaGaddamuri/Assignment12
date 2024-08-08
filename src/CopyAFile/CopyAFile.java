package CopyAFile;

import java.io.IOException;
import java.nio.file.*;

public class CopyAFile {
    public static void main(String[] args) {
        try {
            Path destination_path = Paths.get("src/CopyAFile/destination.txt");
            if (Files.exists(destination_path))
                System.out.println("File already exists.");
            else {
                Files.createFile(destination_path);
                System.out.println( destination_path.getFileName()+" created.");
            }
            Path source_path = Paths.get("src/CopyAFile/source.txt");

            Files.copy(source_path,destination_path, StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e){e.printStackTrace();}

    }
}
