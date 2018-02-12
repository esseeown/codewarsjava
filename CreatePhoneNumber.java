public class Kata {
  public static String createPhoneNumber(int[] numbers) {
     String asd = "(";
     for (int i = 0; i < 3; i++)
     {
        asd += numbers[i];
     }
     asd += ") ";
     
     for (int i = 3; i < 6; i++)
     {
       asd += numbers[i];
     }// Your code here!
     asd += "-";
     for (int i = 6; i < numbers.length; i++)
     {
       asd += numbers[i];
     }
     
     return asd;
  }
}