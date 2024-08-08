package ReadFileLineByLine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("src/ReadFileLineBYLine/file1.txt");
        try(Stream<String> line = Files.lines(path)){
            line.forEach(System.out::println);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}