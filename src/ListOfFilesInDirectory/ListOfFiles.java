package ListOfFilesInDirectory;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ListOfFiles {
    public static void main(String[] args) {
        Path dir = Paths.get("src");

        try (Stream<Path> stream = Files.list(dir)) {
            stream.forEach(path -> {
                if (Files.isRegularFile(path)) {
                    System.out.println("File: " + path.getFileName());
                } else if (Files.isDirectory(path)) {
                    System.out.println("Directory: " + path.getFileName());
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
