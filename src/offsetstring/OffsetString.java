/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offsetstring;

import java.util.Arrays;

/**
 *
 * @author xristos
 */
public class OffsetString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 String str = "abcdef"; 
     char[] A = str.toCharArray();
	 int offset=3;
     int len = A.length;
     offset %= len;
     reverse(A, 0, len - offset - 1);
     reverse(A, len - offset, len - 1);
     reverse(A, 0, len - 1);
     System.out.println(Arrays.toString(A));
    }

    private static void reverse(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
    
}
