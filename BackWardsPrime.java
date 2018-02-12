public class BackWardsPrime {
	
	public static String backwardsPrime(long start, long end) {  
    String result = "";
    for (long i = start; i <= end; i++)
    {
      if (isPrime(i) && isPrime(reverseNumber(i)) && i !=reverseNumber(i))
      {
        result = result + i + " ";
      }
    }
    
    String finalresult = result.trim();
    return finalresult;
	}
  
  public static boolean isPrime(long num) {
    if (num > 2 && num % 2 == 0)
    {
      return false;
    }
    
    int top = (int) Math.sqrt(num) + 1;
    for (int i = 3; i < top; i += 2)
    {
      if (num % i ==0)
      {
        return false;
      }
    }
    
    return true;
  }
  
  public static long reverseNumber(long num) {
    String temp = "";
    while (num > 0) 
    {
      temp += num % 10;
      num /= 10;
    }
    
    return Long.parseLong(temp);
  }
}
  