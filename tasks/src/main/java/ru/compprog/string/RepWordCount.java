package ru.compprog.string;

/**
 * Given an integer, , find and print the number of letter a's in the first  letters  infinite string.
 */
public class RepWordCount {

  public static void main(String[] args) {

    System.out.println(repeatedString("aba", 10));
  }

  static long repeatedString(String s, long n) {
    int occur = 0;
    int lengStr = s.length();

    StringBuilder sb = new StringBuilder();

    for(int i = 0; i != n; ) {
      int j = 0;

      while(j<lengStr && i != n) {
        sb.append(s.charAt(j));
        if(sb.toString().charAt(i)=='a') {
          occur++;
        }
        j++;
        i++;
      }
    }
    return occur;

  }
}

/**
 * static long repeatedString(String s, long n) {
 *         long count =0;
 *         for(char c : s.toCharArray()){
 *         if(c == 'a')
 *         count++;
 *         }
 *
 *         long factor = (n/s.length());
 *         long rem = (n%s.length());
 *         count =  factor*count  ;
 *         for(int i=0;i<rem;i++){
 *         if(s.charAt(i)=='a')
 *                 count++;
 *         }
 *                 return count;
 *
 *     }
 */
