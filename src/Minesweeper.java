
public class Minesweeper 
{
	public static void main(String v[])
	{
		boolean[][] matrix = {{true, false, false},
		          {false, false, false}};
		int[][] res = minesweeper(matrix);
		for(int i=0; i<=matrix.length-1; i++)
	    {
	        for(int j=0; j<=(matrix[0].length-1); j++)
	        {
	        	System.out.print(res[i][j]+" ");
	        }
	        System.out.println();
	    }
	}

	static int[][] minesweeper(boolean[][] matrix) 
	{
	    int[][] result = new int[matrix.length][matrix[0].length];
	    System.out.println(matrix[0].length);
	    int counter = 0;
	    for(int i=0; i<matrix.length; i++)
	    {
	        for(int j=0; j<(matrix[0].length); j++)
	        {
	            System.out.println(i+" "+j);
	            counter = 0;
	                if(i==0 && j==0)
	                {
	                    if(matrix[i+1][j+1])
	                        counter++;
	                    if(matrix[i][j+1])
	                        counter++;
	                    if(matrix[i+1][j])
	                        counter++;
	                }
	                else if(i==0 && j>0 && j<(matrix[0].length-1))
	                {
	                    if(matrix[i][j-1])
	                        counter++;
	                    if(matrix[i+1][j+1])
	                        counter++;
	                    if(matrix[i+1][j-1])
	                        counter++;
	                    if(matrix[i][j+1])
	                        counter++;
	                    if(matrix[i+1][j])
	                        counter++;
	                }
	                else if(i>0 && j==0 && i<(matrix.length-1))
	                {
	                    if(matrix[i+1][j])
	                        counter++;
	                    if(matrix[i-1][j])
	                        counter++;
	                    if(matrix[i][j+1])
	                        counter++;
	                    if(matrix[i+1][j+1])
	                        counter++;
	                    if(matrix[i-1][j+1])
	                        counter++;
	                }
	                else if(i==0 && j==(matrix[0].length-1))
	                {
	                	if(matrix[i][j-1])
	                		counter++;
	                	if(matrix[i+1][j])
	                		counter++;
	                	if(matrix[i+1][j-1])
	                		counter++;
	                }
	                else if(i==(matrix.length)-1 && j==0)
	                {
	                	if(matrix[i][j+1])
	                		counter++;
	                	if(matrix[i-1][j])
	                		counter++;
	                	if(matrix[i-1][j+1])
	                		counter++;
	                }
	                else if(i==(matrix.length-1) && j==(matrix[0].length-1))
	                {
	                	if(matrix[i][j-1])
	                		counter++;
	                	if(matrix[i-1][j])
	                		counter++;
	                	if(matrix[i-1][j-1])
	                		counter++;
	                }
	                else if(i==(matrix.length-1) && j>0 && j<(matrix[0].length-1))
	                {
	                	if(matrix[i][j-1])
	                		counter++;
	                	if(matrix[i][j+1])
	                		counter++;
	                	if(matrix[i-1][j-1])
	                		counter++;
	                	if(matrix[i-1][j])
	                		counter++;
	                	if(matrix[i-1][j+1])
	                		counter++;
	                }
	                else if(i>0 && i<(matrix[0].length-1) && j==(matrix[0].length-1))
	                {
	                	if(matrix[i-1][j])
	                		counter++;
	                	if(matrix[i-1][j-1])
	                		counter++;
	                	if(matrix[i+1][j])
	                		counter++;
	                	if(matrix[i+1][j-1])
	                		counter++;
	                	if(matrix[i][j-1])
	                		counter++;
	                }
	                else
	                {
	                    if(matrix[i][j+1])
	                        counter++;
	                    if(matrix[i][j-1])
	                        counter++;
	                    if(matrix[i-1][j+1])
	                        counter++;
	                    if(matrix[i-1][j])
	                        counter++;
	                    if(matrix[i-1][j-1])
	                        counter++;
	                    if(matrix[i+1][j+1])
	                        counter++;
	                    if(matrix[i+1][j])
	                        counter++;
	                    if(matrix[i+1][j-1])
	                        counter++;
	                }
	                result[i][j] = counter;                
	        }
	    }
	    return result;
	}

}
