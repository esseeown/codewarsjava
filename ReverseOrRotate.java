class RevRot {
    
    public static String revRot(String strng, int sz) {
        if (sz <= 0 || strng == null || strng.equals("") ||strng.length() < sz)
        {
            return "";
        }// your code
        
        String[] chunks = new String[strng.length() / sz];
        String  result = "";


        for (int i = 0; i < strng.length() / sz; i++)
        {
            chunks[i] = strng.substring(i * sz, (i + 1) * sz);
            int[] sum = new int[chunks.length];

            for(int j = 0; j < chunks[i].length(); j++)
            {
               int x = Character.getNumericValue(chunks[i].charAt(j));
               sum[i] += (int) Math.pow(x, 2);

            }

            if(sum[i] % 2 == 0)
            {
                StringBuffer buffer = new StringBuffer(chunks[i]);
                buffer.reverse();
                result += buffer;
            }
            else
            {
                char asd = chunks[i].charAt(0);
                chunks[i] = chunks[i].substring(1) + asd;
                result += chunks[i];
            }
        }

        return result;
    }
}