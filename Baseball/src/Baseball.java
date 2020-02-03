import java.util.Scanner;
import java.util.ArrayList;
public class Baseball
	{
		static Scanner userIntInput;
		static Scanner userStringInput;
		static double userPlayer;
		static boolean keepPlaying = true;
	
		static Scanner swing;
	public static void main(String[] args)
		{
				{
					playerMaker.playerLog();
					
					while  (keepPlaying) {
						intro();
						swinging();
						
					}
					}
		}
			
		public static void intro()
		{
		Scanner userIntInput = new Scanner(System.in);
		Scanner userStringInput = new Scanner(System.in);
		System.out.println("Welcome to the Baseball Game, are you ready to swing?");
		System.out.println(" 1 for yes, 2 for no.");
		int yesOrNo = userIntInput.nextInt();
			
			if(yesOrNo == 1)
				{
					keepPlaying = true;
				}
		
				else if (yesOrNo == 2)
					{
						keepPlaying = false;
						System.out.println("Have a nice day");
						System.exit(0);
					}
		}
		

		
		public static void swinging()
		{
			
			
			int swing = (int)(Math.random()*1000+1);
			if(swing >playerMaker.playerInfo.get(0).getAverage())
				{
					System.out.println("That is a strike");
				}
				
				else if(swing < playerMaker.playerInfo.get(0).getAverage())
				{
					System.out.println("That is a hit");
				}
				
			
		}
		
		}
	
		
		
			

	
