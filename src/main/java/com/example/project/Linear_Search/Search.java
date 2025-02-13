package com.example.project.Linear_Search;
import java.util.ArrayList;

public class Search {
    // A. write a static method named linearSearchFirst that returns the FIRST index
    // a target int is found in an array of ints (both the target and int array
    // should be accepted as parameters); return -1 if target is not found
    // BE SURE TO USE EARLY RETURN (more efficient)
    public static int linearSearchFirst(int[] elements, int target) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == target) {
                return i; // Return the first index found
            }
        }
        return -1; // Return -1 if not found
    }


    // B. write a second static method named linearSearchLast that returns the LAST index
    // a target int is found in an array of ints (both the target and int array
    // should be accepted as parameters); return -1 if target is not found
    // FIGURE OUT A WAY TO DO THIS THAT STILL USES AN EARLY RETURN!!!!!
    public static int linearSearchLast(int[] elements, int target) {
        for (int i = elements.length - 1; i >= 0; i--) {
            if (elements[i] == target) {
                return i; // Return the last index found
            }
        }
        return -1; // Return -1 if not found
    }

    // C. write a third static method named linearSearchFound that has the same parameters
    // as linearSearchFirst and linearSearchLast but instead of returning an index,
    // it returns true if target is found or false if target is not found
    // AGAIN, BE SURE TO USE EARLY RETURN!
    public static boolean linearSearchFound(int[] elements, int target) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == target) {
                return true; // Return true if found
            }
        }
        return false; // Return false if not found
    }

    // D. write a fourth static method named linearSearchCount that has the same parameters
    // as linearSearchFirst and linearSearchLast and returns the NUMBER OF TIMES the target
    // appears in the array
    public static int linearSearchCount(int[] elements, int target) {
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == target) {
                count++; // Increment count when target is found
            }
        }
        return count; // Return the total count
    }

    // E. add FOUR more static methods which are the OVERLOADED versions of the four method above
    // (same method name, different parameter types/order) except they take an ArrayList of Integers
    // rather than an array of ints; they should all otherwise work the same way (for this, it is
    // OK to either copy/paste code and change it to work with arraylists instead, or you can figure
    // out a way to call the 4 methods above; up to you)
    public static int linearSearchFirst(ArrayList<Integer> elements, int target) {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i) == target) {
                return i; // Return the first index found
            }
        }
        return -1; // Return -1 if not found
    }

    public static int linearSearchLast(ArrayList<Integer> elements, int target) {
        for (int i = elements.size() - 1; i >= 0; i--) {
            if (elements.get(i) == target) {
                return i; // Return the last index found
            }
        }
        return -1; // Return -1 if not found
    }


    public static boolean linearSearchFound(ArrayList<Integer> elements, int target) {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i) == target) {
                return true; // Return true if found
            }
        }
        return false; // Return false if not found
    }

    public static int linearSearchCount(ArrayList<Integer> elements, int target) {
        int count = 0;
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i) == target) {
                count++; // Increment count when target is found
            }
        }
        return count; // Return the total count
    }


}