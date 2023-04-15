import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Exercise480 {
    public static void main(String[] args) {
        try {
            final AsynchronousServerSocketChannel listener = AsynchronousServerSocketChannel.open();
            InetSocketAddress address = new InetSocketAddress("localhost", 5000);
            listener.bind(address);

            listener.accept(null, new CompletionHandler<AsynchronousSocketChannel, Void>() {

                public void completed(AsynchronousSocketChannel channel, Void attribute) {
                    try {
                        System.out.println("Server: completed method executing");
                        while (true) {
                            ByteBuffer buffer = ByteBuffer.allocate(32);
                            Future<Integer> readFuture = channel.read(buffer);
                            Integer number = readFuture.get();
                            System.out.println("Server: Message received: " + new String(buffer.array()));
                        }
                    } catch (InterruptedException | ExecutionException ex) {
                        ex.printStackTrace();
                    }
                }

                @Override
                public void failed(Throwable exc, Void attachment) {
                    System.out.println("Server: CompletionHandler exception");
                    exc.printStackTrace();
                }
            });
            while (true) {

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
