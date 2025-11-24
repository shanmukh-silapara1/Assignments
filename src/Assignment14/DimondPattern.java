package Assignment14;

public class DimondPattern {

	public static void main(String[] args) {
		//initialization 
		int n=5;
		
		//upper pyramid
		for(int i=1;i<=n;i++)
		{
			int p=1;
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				if((k%2)==0)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(p);
					p++;
				}
			}
			System.out.println();
		}
		
		//lower pyramid
		for(int i=n;i>=1;i--)
		{
			int p=1;
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				if((k%2)==0)
				{
					System.out.print(p);
					p++;
				}
				else
				{
					System.out.print(" ");
					
				}
			}
			System.out.println();
		}
	}

}
