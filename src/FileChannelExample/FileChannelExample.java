package FileChannelExample;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelExample {
    public static void main(String[] args) {
        // Writing to a file using FileChannel
        try (RandomAccessFile writer = new RandomAccessFile("example.txt", "rw");
             FileChannel writeChannel = writer.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(64);
            String data = "Hello, this is a test.";

            buffer.clear();
            buffer.put(data.getBytes());
            buffer.flip();

            while (buffer.hasRemaining()) {
                writeChannel.write(buffer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Reading from a file using FileChannel
        try (RandomAccessFile reader = new RandomAccessFile("example.txt", "r");
             FileChannel readChannel = reader.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(64);

            int bytesRead = readChannel.read(buffer);
            while (bytesRead != -1) {
                buffer.flip();

                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }

                buffer.clear();
                bytesRead = readChannel.read(buffer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
