import java.util.Scanner;

public class E {
 public static void main(String[] args) {
  final Scanner s = new Scanner(System.in);
  s.useDelimiter("\n|\r");
  final int cases = Integer.valueOf(s.next());
  for (int i = 0; i < cases; i++) {
   int num = Integer.valueOf(s.next());
   args = s.next().split(" ");
   double[] nums = new double[args.length];
   for (int j = 0; j < nums.length; j++) {
    nums[j] = Double.valueOf(args[j]);
   }
   double sum = 0;
   nums = sort(nums);
   while (nums.length != 1) {
    final double[] dNums = nums;
    nums = new double[dNums.length - 1];
    for (int k = 0; k  < nums.length; k++) {
     nums[k] = (dNums[k] + dNums[k + 1]) / 2.0D;
    }
   }
   System.out.println("Case #" + (i + 1) + ": " + trunc(nums[0]));
  }
 }

 public static String trunc(double d) {
  String num = new Double(Math.round(d * 1000.0D) / 1000.0D).toString();
  String trunc = num.substring(num.indexOf("."), num.length());
  for (int i = 4 - trunc.length(); i > 0; i--) {
   num += "0";
  }
  return num;
 }

 public static double[] sort(double[] darr) {
  boolean swapMade = true;
  while (swapMade) {
   swapMade = false;
   for (int i = 0; i < darr.length - 1; i++) {
    if (darr[i] > darr[i + 1]) {
     swapMade = true;
     double d1 = darr[i];
     darr[i] = darr[i + 1];
     darr[i + 1] = d1;
    }
   }
  }
  return darr;
 }
}
