import java.util.Scanner;
import java.math.BigInteger;

public class C {
 public static void main(String[] args) {
  final Scanner s = new Scanner(System.in);
  s.useDelimiter("\n|\r");
  for (int i = Integer.valueOf(s.next()); i > 0; i--) {
   String 
    sNum1 = "",
    sNum2 = "";
   s.next();
   int m = Integer.valueOf(s.next());
   for (int j = m; j > 0; j--) {
    final String str = s.next();
    args = str.split(" ");
    sNum1 = sNum1 + args[0];
    sNum2 = sNum2 + args[1];
   }
   BigInteger sum = new BigInteger(trimLeading(sNum1)).add(new BigInteger(trimLeading(sNum2)));
   String sSum = sum.toString();
   sSum = fixLength(sSum, m);
   System.out.println(sSum + (i != 1 ? "\n" : ""));
  }
 }

 public static String trimLeading(String str) {
  int nonZeroIndex = 0;
  for (int i = 0; i < str.length(); i++) {
   if (str.charAt(i) != '0') {
    nonZeroIndex = i;
    break;
   }
  }
  return str.substring(nonZeroIndex, str.length()); 
 }

 public static String fixLength(String num, int len) {
  if (num.length() > len) {
   for (int i = num.length(); i < len; i++) {
    num = num + "0";
   }
  } else if (num.length() < len) {
   num = num.substring(len);
  }
  return num;
 }
}
