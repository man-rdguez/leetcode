package HappyStudents;

import java.util.List;
import java.util.stream.Collectors;


/*
class Solution {

   public int countWays(List<Integer> nums) {

      System.out.println( nums );

      int ways = 0;

      if ( totStudentsGreaterThanAny( nums ) == true ) {
         ways++;
      }

      System.out.println( "ways: " + ways );

      //ways += zeroCases( nums );


      ways = countIncluded( nums );

      if ( noneIncludedCase( nums ) == true ) {
         ways++;
      }

      return ways;
   }

   private boolean totStudentsGreaterThanAny( List<Integer> nums ) {

      int totalStudents = nums.size();

      int i = 0;
      boolean totalStdsGreaterThanAny = true;

      while ( i < totalStudents && totalStdsGreaterThanAny ) {

         if ( nums.get(i) >= totalStudents ) {
            totalStdsGreaterThanAny = false;
         }

         i++;
      }

      return totalStdsGreaterThanAny;
   }

   private int zeroCases( List<Integer> nums ) {

      int cases = 0;

      for ( int i = 0; i < nums.size(); i++ ) {
         if ( nums.get(i) == 0 ) {
            cases++;
         }
      }

      return cases;
   }

   private int countIncluded( List<Integer> nums ) {

      List<Integer> sortedList = nums.stream().sorted().collect( Collectors.toList() );
      int cases = 0;

      System.out.println( "sortedList: " + sortedList );

      for ( int i = 0; i < nums.size(); i++ ) {
         if ( sortedList.get(i) < i + 1 ) {
            cases++;
         }
      }

      return cases;
   }


   private boolean noneIncludedCase( List<Integer> nums ) {

      List<Integer> sortedList = nums.stream().sorted().collect( Collectors.toList() );

      System.out.println( "sortedList: " + sortedList );

      boolean greaterThanZero = true;
      int i = 0;

      while ( i < nums.size() && greaterThanZero == true ) {
         if ( sortedList.get(i) <= 0 ) {
            greaterThanZero = false;
         }
         i++;
      }

      return greaterThanZero;
   }
}
*/

class Solution {
   public int countWays(List<Integer> nums) {
      System.out.println(nums);
      int ways = 0;
      ways = countIncluded(nums);
      if (noneIncludedCase(nums) == true) {
         ways++;
      }
      return ways;
   }

   private int countIncluded(List<Integer> nums) {
      List<Integer> sortedList = nums.stream().sorted().collect(Collectors.toList());
      int cases = 0;
      System.out.println("sortedList: " + sortedList);

      for (int i = 0; i < nums.size(); i++) {
         if (sortedList.get(i) < i + 1 && totSelLessThanAnyNonSel(i + 1, sortedList) == true) {
            cases++;
         }
      }
      return cases;
   }

   private boolean totSelLessThanAnyNonSel(int totSel, List<Integer> sortedList) {
      boolean lessThanAnyNonSel = true;
      int i = totSel;
      while (i < sortedList.size() && lessThanAnyNonSel == true) {
         if (sortedList.get(i) <= totSel) {
            lessThanAnyNonSel = false;
         }
         i++;
      }
      return lessThanAnyNonSel;
   }

   private boolean noneIncludedCase(List<Integer> nums) {
      List<Integer> sortedList = nums.stream().sorted().collect(Collectors.toList());
      System.out.println("sortedList: " + sortedList);
      boolean greaterThanZero = true;
      int i = 0;
      while (i < nums.size() && greaterThanZero == true) {
         if (sortedList.get(i) <= 0) {
            greaterThanZero = false;
         }
         i++;
      }

      return greaterThanZero;

   }

}
public class Main {
}
