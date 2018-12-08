import java.util.Scanner;

public class A {
 public static void main(String[] args) {
  final Scanner s = new Scanner(System.in);
  s.useDelimiter("\n|\r");
  for (int i = Integer.valueOf(s.next()); i > 0; i--) {
   int openCount = 0;
   final String str = s.next();
   for (int j = 0; j < str.length(); j++) {
    if (openCount < 0) {
     break;
    }
    final char c = str.charAt(j);
    if (c == '{') {
     openCount += 1;
    } else if (c == '}') {
     openCount -= 1;
    }
   }
   System.out.println((openCount == 0 ? "T" : "F"));
  }
 }
}
