package ByteBufferToFile;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ByteBufferToFile {
    public static void main(String[] args) {
        String filePath = "src/ByteBufferToFile/output.txt";

        try (FileOutputStream fos = new FileOutputStream(filePath);
             FileChannel fileChannel = fos.getChannel())
        {
                String data = "Hello, this is data to write to the file.";
                ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());

                while (buffer.hasRemaining()) {
                    fileChannel.write(buffer);
                }
                System.out.println("Data written to " + filePath);
        } catch (Exception e) {
                    e.printStackTrace();
                }
    }
}
