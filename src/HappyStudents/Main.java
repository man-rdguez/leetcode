package HappyStudents;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
The student is selected and the total number of selected students is strictly greater than nums[i].
The student is not selected and the total number of selected students is strictly less than nums[i].
*/

class Solution {
   public int countWays(List<Integer> nums) {
      System.out.println(nums);

      List<Integer> sortedList = nums.stream().sorted().collect( Collectors.toList() );
      int ways = 0;
      System.out.println("sortedList: " + sortedList);

      int selected = 0;
      int idx  = -1;

      do {
         if ( selected == 0 ) {
            if ( selected < sortedList.get( idx + 1 ) ) {
               ways++;
            }
         } else if ( selected < sortedList.size() ) {
            if ( selected > sortedList.get( idx ) && selected < sortedList.get( idx + 1 ) ) {
               ways++;
            }
         } else if ( selected > sortedList.get( idx ) ) {
            ways++;
         }

         System.out.println( "ways: " + ways );

         selected++;
         idx++;

      } while ( selected <= sortedList.size() );

      return ways;
   }

}
public class Main {

   public static void main(String[] args) {

      // Test with at least two cases
      List<Integer> list = new ArrayList<>(Arrays.asList( 6,0,3,3,6,7,2,7 ) );
      Solution solution = new Solution();
      System.out.println( solution.countWays( list ) );

      list = new ArrayList<>(Arrays.asList( 1,1 ) );
      solution = new Solution();
      System.out.println( solution.countWays( list ) );
   }

}
