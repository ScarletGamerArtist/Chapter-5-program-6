package AlannaBotscharowCh5pr5;
import java.util.Scanner; 
/*
 * Alanna Botscharow
 * 11/18
 */
public class Chapter5Program5 {

	
			public static void main(String[] args) {
				Scanner input = new Scanner(System.in); 
						
				//Prompt users for city name. (city1)
					//input
						//store city name into a variable.
				
					System.out.println("Enter the first city: ");
					
						String city1; 
						String city2; 
						String city3; 
						
						
						
						String temp; 
					
							city1 = input.nextLine(); 
					
						
				
				//Prompt users for another city. (city2)
					//input
						
				
							
							System.out.println("Enter the second city: ");
							
										city2 = input.nextLine(); 
				
				
				//if city1 compared to city2 < 0 
					//display cities in alphabetical order.
										

										System.out.println("Enter the third city: ");
										
													city3 = input.nextLine(); 
							

													
										
										
										//1,2,3,4,5
										
										if (city1.compareTo(city2)>0) {
											temp = city1;
											city1 = city2; 
											city2 = temp;
											
												
										}
										if (city2.compareTo(city3)>0) {
											temp = city2;
											city2 = city3;
											city3 = temp;
											if (city1.compareTo(city2)>0) {
												temp = city1;
												city1 = city2; 
												city2 = temp;
											}		
										}
										
										
										
										
										System.out.println("The alphabetical order of the cities are: " + city1 + ", " +
										city2 + ", " + city3); 
										

									
				
				
				
				
				
				
				
				
				
				
			}

		


	

}
