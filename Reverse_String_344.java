/**
 * Write a function that takes a string as input and returns the string
 * reversed.
 * 
 * Example: Given s = "hello", return "olleh".
 * 
 * @author Liang-yu
 *
 */
public class Reverse_String_344 {
public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        return sb.append(s).reverse().toString();
    }
}
