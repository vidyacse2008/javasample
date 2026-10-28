/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

/**
 *
 * @author vidyasrinivasan
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Javasample {
   public static void main(String args[]){
    /*System.out.println(findDuplicates(List.of("S1","S2","S1","S3","S2","S1"))); // [S1, S2]
    System.out.println(findDuplicates(List.of("S1","S2","S3")));               // []
    System.out.println(findDuplicates(List.of()));  
    System.out.println(countDuplicates(List.of("S1","S2","S1","S3","S2","S1")));
    System.out.println(reverseString("LabKey")); // {S1=3, S2=2, S3=1}*/
    //System.out.println(checkPalindrome("madam"));
    System.out.println(nonrepeatingChar("maddam"));
   }

   public static List<String> findDuplicates(List<String> sampleIds) {
    Set<String> duplicates = new HashSet<>();
    Set<String> seen = new HashSet<>();
     for(String id : sampleIds){
        if(!seen.add(id)){
                duplicates.add(id);
            }
        }
     return new ArrayList<>(duplicates);
}
public static Map<String,Integer> countDuplicates(List<String> sampleIds) {
    Map<String,Integer> countMap = new HashMap<>();
     for(String id : sampleIds){
       countMap.put(id, countMap.getOrDefault(id, 0) + 1);     
}
return countMap;
}
public static String reverseString(String word){
   StringBuilder reverseWord= new StringBuilder();
   for(int j = word.length() -1 ; j >=0 ; j--){
     reverseWord.append(word.charAt(j));
   }
   return reverseWord.toString();
}
public static boolean checkPalindrome(String word){
  return Javasample.reverseString(word).equals(word);
}
public static String nonrepeatingChar(String word){
    Map<String,Integer> counts = new LinkedHashMap<>();
    for(int i = 0 ; i < word.length(); i++){
        counts.put(word.charAt(i)+"",counts.getOrDefault(word.charAt(i)+"",0)+1);
    }
    for (Map.Entry<String, Integer> e : counts.entrySet()) {
        if(e.getValue() == 1){
            return e.getKey();
        }    
}
return "";
}
}