public class Matrix {
    
    public static int determinant(int[][] matrix) {
        int s;
        int sum = 0;
        
        if (matrix.length == 1)
        {
          return matrix[0][0];
        }
        
        for (int i = 0; i < matrix.length; i++)
        {
          int[][] smatrix = new int[matrix.length - 1][matrix.length - 1];
          
          for (int j = 1; j < matrix.length; j++)
          {
            for (int k = 0; k < matrix.length; k++)
            {
              if (k < i)
              {
                smatrix[j - 1][k] = matrix[j][k];
              }
              else if (k > i)
              {
                smatrix[j - 1][k - 1] = matrix[j][k];
              }
            }
          }
          
          if (i % 2 == 0)
          {
            s = 1;
          }
          else
          {
            s = -1;
          }
          
          sum += s * matrix[0][i] * determinant(smatrix);
        }
        
        return sum;
        
    }
}