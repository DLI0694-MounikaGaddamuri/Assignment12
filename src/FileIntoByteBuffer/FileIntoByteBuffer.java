package FileIntoByteBuffer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileIntoByteBuffer {
    public static void main(String[] args) {
        try(RandomAccessFile writer = new RandomAccessFile("src/FileIntoByteBuffer/file.txt","rw");
            FileChannel writeChannel = writer.getChannel()){
            ByteBuffer buffer = ByteBuffer.allocate((int) writeChannel.size());
            writeChannel.read(buffer);

            buffer.flip();
            while(buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
