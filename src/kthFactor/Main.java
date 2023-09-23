package kthFactor;

import java.util.ArrayList;

class Solution {
       public int kthFactor(int n, int k) {
           ArrayList<Integer> factorsList = factors( n );
           System.out.println(factorsList);
           if ( factorsList.size() >= k ) {
               return factorsList.get(k-1);
           }
           else {
               return -1;
           }
       }
       private ArrayList<Integer> factors( int n ) {
          ArrayList<Integer> factorsList = new ArrayList<>();
          for (int i = 1; i <= n; i++) {
             if (n % i == 0) {
                factorsList.add(i);
             }
          }

          return factorsList;
       }

}

public class Main {

   public static void main( String[] args ) {

      Solution solution = new Solution();

      System.out.println( solution.kthFactor( 12, 3 ) );
      System.out.println( solution.kthFactor( 7, 2 ) );
      System.out.println( solution.kthFactor( 4, 4 ) );

   }

}

