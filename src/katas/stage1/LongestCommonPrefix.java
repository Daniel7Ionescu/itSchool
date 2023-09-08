package katas.stage1;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] stringArray = {"flower","flow","flight"};
        PrefixSolution prefix = new PrefixSolution();
        System.out.println(prefix.longestCommonPrefix(stringArray));
    }
}

class PrefixSolution{
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int charCounter = 0;

        //check for easy issues
        if(strs == null || strs.length == 0){
            return result;
        }

        //Sorts Strings based on chars, Method returns void, it just sorts the array
        Arrays.sort(strs);

        //just need to compare characters of the first and last string now, they have the least in common
        //comparing chars one by one
        while(charCounter < strs[0].length()){
            if(strs[0].charAt(charCounter) == strs[strs.length - 1].charAt(charCounter)){
                result += strs[0].charAt(charCounter);
                charCounter++;
            } else {
                return  result;
            }
        }

        return result;
    }
}