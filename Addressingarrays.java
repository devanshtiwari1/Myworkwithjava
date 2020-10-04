package devansh;
public class Addressingarrays {
	public static void main(String args[])
	{
		int[][] arr=new int[][]
		{
			new int[] { 1,2,3 },
					new int[] { 4,5,6 },
			new int[] { 8,9 },
		};
		for(int i=0;i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
		
				System.out.print(arr[i][j]+" ");
				}
		System.out.println();
		}
		}
	}

