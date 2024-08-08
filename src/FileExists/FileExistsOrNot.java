package FileExists;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExistsOrNot {

    public static boolean fileExistsOrNot(Path file_path){
        if(Files.exists(file_path))
            return true;
        return false;
    }

    public static void main(String[] args) {

        Path file_path = Paths.get("src/FileExists/file1.txt");
        if(fileExistsOrNot(file_path))
            System.out.println(file_path.getFileName()+" exists.");
        else
            System.out.println(file_path.getFileName()+" doesn't exists.");
    }
}
