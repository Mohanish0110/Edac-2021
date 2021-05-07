import java.util.*;


class ArrayMatrixAdd
{

  public static void main(String []args)
 {
  
    Scanner sc1 = new Scanner(System.in);
    int[][] arr = new int[2][2];
	int[][] arr1 = new int[2][2];
	int[][] sum= new int[2][2];
	
	
	//----------------enter array element as 1  matrix---------------
	
	System.out.println("Enter First Matrix");
	
	for( int i=0; i<=arr.length-1 ; i++)
	{
	   	for(int j=0 ; j<=arr.length-1 ; j++)
		{
			 System.out.print("Enter array element:");
			 arr[i][j]=sc1.nextInt();
			
			
		}
		
	}
	//------------------------------printing First matrix------------------------
	   System.out.println("First Matrix");
	 
	 for( int[] x : arr  )
	 {
		 for(int y : x)
		 {
			 System.out.print(y+" ");
		 }
		 System.out.println();
	 }
	 
	 
	
	   
	
	//----------------enter array element as 2  matrix---------------
	
	System.out.println("Enter second Matrix");
	
	for( int i=0; i<=arr1.length-1 ; i++    )
	{
	   	for(int j=0 ; j<=arr1.length-1 ; j++)
		{
			 System.out.print("Enter array element:");
			 arr1[i][j]=sc1.nextInt();
			
			
		}
		
	}
	
	    System.out.println(" ");
		
	 //----------------------printing second matrix--------------------
	 
	    System.out.println("second Matrix");
	 
	 for(int[] x:arr1 )
	 {
		 for(int y:x)
		 {
			 System.out.print(y+" ");
		 }
		 System.out.println();
	 }
	
	
	//---------------Addition of 2 matrix---------------------------
	//Addition:
	  System.out.println("Addition of Matrix = ");
	  
	  
	  
	  for(int i=0;i<2;i++)//Row
	  {
		for(int j=0;j<2;j++)//Cols
		{
			sum[i][j]= arr[i][j] + arr1[i][j];
			//System.out.print(c[i][j]+" ");
		}
		//System.out.println();
	  }
	  
	  //---------------------printing Addition of two  matrix---------------------
	  
	  for(int i=0;i<2;i++)//Row
	  {
		for(int j=0;j<2;j++)//Cols
		{
			
			System.out.print(sum[i][j]+" ");
		}
		System.out.println();
	 }
	
	
	
   	 
	 
	 
	   
	 
	 
	 
    } 
 } 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 