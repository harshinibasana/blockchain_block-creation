package edu.okcu;
import java.util.Arrays;
public class Hash {
    public int getHash(String value) {
        return value.hashCode();
    }

    public int getHash(String [] array) {
        return Arrays.hashCode(array);
    }

    public int getHash(int [] array) {
        return Arrays.hashCode(array);
    }
}
