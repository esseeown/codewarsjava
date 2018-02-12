public class Kata
{
    public static String expandedForm(int num)
    {
         String str = String.valueOf(num);
        String line = "";
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) != '0')
            {
                line += str.charAt(i);
                for (int j = 0; j < str.length() - i - 1; j++)
                {
                   line += "0";
                }

                line += " + ";
            }
        }

        line = line.substring(0, line.length() - 3);
        return line;
    }
}