package Assignment1;

import java.util.Scanner;

 interface character {
	void show();
	}

	public class Character1 {
		
		public static void main(String[] args) {

			character m = ()->{
				Scanner sc = new Scanner (System.in);
				System.out.println("Enter Index No:");
				int n= sc.nextInt();
				String s1="Kaluram";
				for(int i=0;i<s1.length();i++)
				{
					if(i==n)
					{
						System.out.println(s1.charAt(i));
					}
				}
				
				};
				m.show();
				}

	}


