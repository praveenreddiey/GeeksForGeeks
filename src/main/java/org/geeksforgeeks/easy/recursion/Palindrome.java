package org.geeksforgeeks.easy.recursion;

public class Palindrome {
    public static boolean palindromeOrNot(String s) {
        if (s.length() == 0 || s == null)
            return false;
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        return s.equals(reverse);
    }

    public static boolean palindromeOrNotUsingRecursion(String s, int start, int end) {

        if (start >= end)
            return true;
        return (s.charAt(start) == s.charAt(end) && palindromeOrNotUsingRecursion(s, start + 1, end - 1));
    }
}
