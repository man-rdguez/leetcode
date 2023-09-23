package kSetBits;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
   public int sumIndicesWithKSetBits(List<Integer> nums, int k) {

      int sum = 0;

      for ( int i = 0; i < nums.size(); i++ ) {
         if ( isK( binary(i), k ) ) {
            sum = sum + nums.get(i);
         }
      }

      System.out.println("sum: " + sum);

      return sum;
   }


   private boolean isK( ArrayList<Integer> bin, int k ) {

      int count = 0;

      for ( int number : bin ) {
         if ( number == 1 ) {
            count++;
         }

      }

      return count == k;
   }

   private ArrayList<Integer> binary( int number ) {

      int quotient = number;
      int remainder = 0;

      ArrayList<Integer> list = new ArrayList<>();

      while ( quotient != 0 ) {
         remainder = quotient % 2;
         list.add( remainder );

         quotient /= 2;
      }

      return list.;
   }

}

public class Main {

   public static void main(String[] args) {

      Solution solution = new Solution();

      List<Integer> list = new ArrayList<>( Arrays.asList( 5, 10, 1, 5, 2 ) );
      int k = 1;
      int sum = solution.sumIndicesWithKSetBits(list, k);
      System.out.println( "sum = " + sum );

      list = new ArrayList<>( Arrays.asList( 4,3,2,1 ) );
      k = 2;
      sum = solution.sumIndicesWithKSetBits(list, k);
      System.out.println( "sum = " + sum );
   }

}
