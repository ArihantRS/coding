/*Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's.
 You must do it in place.*/
public class Prog3 {
     public static void matrix(int[][] matrix){

         boolean isZeroCol = false;
         boolean isZeroRow = false;
         for (int i = 0; i < matrix.length; i++) { //check the first column
             if (matrix[i][0] == 0) {
                 isZeroCol = true;
                 break;
             }
         }
         for (int i = 0; i < matrix[0].length; i++) { //check the first row
             if (matrix[0][i] == 0) {
                 isZeroRow = true;
                 break;
             }
         }
         for (int i = 1; i < matrix.length; i++) { //check except the first row and column
             for (int j = 1; j < matrix[0].length; j++)
                 if (matrix[i][j] == 0) {
                     matrix[i][0] = 0;
                     matrix[0][j] = 0;
                 }
         }
         for (int i = 1; i < matrix.length; i++) { //process except the first row and column
             for (int j = 1; j < matrix[0].length; j++)
                 if (matrix[i][0] == 0 || matrix[0][j] == 0)
                     matrix[i][j] = 0;
         }
         if (isZeroCol) { //handle the first column
             for (int i = 0; i < matrix.length; i++)
                 matrix[i][0] = 0;
         }
         if (isZeroRow) { //handle the first row
             for (int i = 0; i < matrix[0].length; i++)
                 matrix[0][i] = 0;
         }
         /*for(int i=0;i< m.length;i++)
             for(int j=0;j<m[0].length;j++)
                 if(m[i][j]==0)
                 { m[0][j]=0;m[i][0]=0;}
      

         for(int i=0;i< m.length;i++)               in my solution if first row and column had 0
             for(int j=0;j<m[0].length;j++)         then all first row will become 0
                 if(m[0][j]==0||m[i][0]==0)         therefore on every comparison afterwards every element
                     m[i][j]=0;                     will be 0 as m[i][0] or m[0][j] is 0

         for(int i=0;i< m.length;i++) {
             for (int j = 0; j < m[0].length; j++)
                 System.out.print(m[i][j]);
             System.out.println(" ");
         }*/


     }

    public static void main(String[] args) {
        int[][] m={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        for(int i=0;i< m.length;i++) {
            for (int j = 0; j < m[0].length; j++)
                System.out.print(m[i][j]);
            System.out.println();
        }
        System.out.println();
        matrix(m);
    }
    }
