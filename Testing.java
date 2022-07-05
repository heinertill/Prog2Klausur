import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Testing {

    public static void main(String[] args) {
    try {
        throw new NullPointerException("");
    } catch (IOException e) {
        System.out.println("IO") ;
    } catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("index") ;
    } catch(RuntimeException e) {
        System.out.println("RT") ;
    } finally {
        System.out.println("!") ;
    }
    }
}
