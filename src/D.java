import java.util.Scanner;

public class D {
 public static void main(String[] args) {
  final Scanner s = new Scanner(System.in);
  s.useDelimiter("\n|\r");
  int caseCount = Integer.valueOf(s.next());
  for (int i = 0; i < caseCount; i++) {
   final int n = Integer.valueOf(s.next());
   int[] board = new int[(int)Math.pow(n, 2)];
   int zeroIndex = 0;
   for (int j = 0; j < n; j++) {
    final String[] row = s.next().split(" ");
    for (int k = 0; k < n; k++) {
     int index = (j * n) + k;
     if ((board[index] = Integer.valueOf(row[k])) == 0) {
      zeroIndex = index; 
     }
    }
   }
   int totalSwaps = 0;
   boolean swapMade = true;
   while (swapMade) {
    swapMade = false;
    int index = -1;
    for (int k = 0; k < board.length; k++) {
     if (board[k] == zeroIndex) {
      index = k;
      break;
     }
    }
    if (index != zeroIndex) {
     swapMade = true;
     board[zeroIndex] = board[index];
     board[index] = 0;
     zeroIndex = index;
     totalSwaps += 1;
    } else {
     int outOfPlace = -1;
     for (int k = 0; k < board.length; k++) {
      if (k == zeroIndex) {
       continue;
      }
      if (board[k] != k) {
       outOfPlace = k;
       break;
      }
     }
     if (outOfPlace != -1) {
      swapMade = true;
      board[zeroIndex] = board[outOfPlace];
      board[outOfPlace] = 0;
      zeroIndex = outOfPlace;
      totalSwaps += 1;
     }
    }
   }
   System.out.println("Case " + (i + 1) + ": " + totalSwaps);
  }
 }
}
