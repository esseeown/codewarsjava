public class DigPow {
  
  public static long digPow(int n, int p) {
    int s = 0;
    String nstr = String.valueOf(n);
    for (int i = 0; i < nstr.length(); i++)
    {
      s += (int) Math.pow(nstr.charAt(i) - '0', p + i);
    }
    if (s % n ==0)
    {
      return s / n;
    }  else return -1;
  } 
}