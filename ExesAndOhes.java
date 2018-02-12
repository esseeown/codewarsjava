public class XO {
  
  public static boolean getXO (String str) {
        boolean xo = false;
        str = str.toLowerCase();
        int sumX = 0;
        int sumO = 0;
        for (int i = 0; i < str.length(); i++)
        {
            char result = str.charAt(i);
            if (result == 'x')
            {
                sumX += 1;
            }
            if (result == 'o')
            {
                sumO += 1;
            }
        }

        if (sumX == 0 && sumO == 0)
            xo = true;

        if (sumX == sumO)
            xo = true;
 // Good Luck!!
     return xo;
   }
}