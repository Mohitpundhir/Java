public class Jagged
	{
		public static void main(String []arg)
			{
				

				
						int a[][]=new int[3][];
						
						a[0]=new int[3];
						a[1]=new int[2];	
						a[2]=new int[1];

						a[0][0]=1;
						a[0][1]=2;
						a[0][2]=3;
						a[1][0]=4;
						a[1][1]=5;
						a[2][0]=6;

						for(int i=0;i<a.length;i++)
							{
								for(int j=0;j<a[i].length;j++)
									{
										System.out.print(a[i][j]+" ");
									}

										System.out.println();
							}
						
	
					}
					
			}	
	
