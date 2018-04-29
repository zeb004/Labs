import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class binarysearch {
public static void main(String[] args) {

    String[] names={"Adam","Bob","Carrol","John","Kelly","Linda","Mike","Stanley","Tim","Zoe"};


        String Item = "Nancy";

        System.out.println("The location is:");
        System.out.println(binarySearch(names, Item));
}
public static int binarySearch(String[] a, String x) {
    int low = 0;
    int high = a.length - 1;
    int mid;

    while (low <= high) {
        mid = (low + high) / 2;
        System.out.println("Now at position"+" "+mid);

        if (a[mid].compareTo(x) < 0) {
            low = mid + 1;
        } else if (a[mid].compareTo(x) > 0) {
            high = mid - 1;
        } else {
            return mid;
        }
    }
System.out.println("String Not Found");
    return -1;

}
}
