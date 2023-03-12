package level1.javaclass.exceptions;

import java.io.FileNotFoundException;
import java.net.SocketException;

public class Main {
    public static void main(String[] args) {
        try {
            doSomethingDangerous();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }

    public static void doSomethingDangerous() throws FileNotFoundException, SocketException {
        try {
            readFile("");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error occurred");
            throw e;
        }
    }

    public static void readFile(String path) throws FileNotFoundException, SocketException  {
        if (path == null) {
            throw new FileNotFoundException();
        }
        throw new SocketException();
    }
}
