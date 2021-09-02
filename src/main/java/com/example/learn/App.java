package com.example.learn;
import java.util.*;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        App a = new App();
        int[] nums = {1,0,2};
        int result = a.arrayNesting(nums);
        System.out.println(result);
    }

    public int arrayNesting(int[] nums) {
        Set<Integer> s = new HashSet<>();
        Random rand = new Random();
        int r = rand.nextInt(nums.length);
        int n = nums[r];
        
        while(!s.contains(n)){
            s.add(n);
            n = nums[n];
        }
        
        return s.size();
    }
}
