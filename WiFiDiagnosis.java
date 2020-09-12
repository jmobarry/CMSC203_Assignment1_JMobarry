import java.util.Scanner; // Needed for the Scanner class
import javax.swing.JOptionPane; // Needed for the initial dialogue box

public class WiFiDiagnosis {

	public static void main(String[] args) {
		
		System.out.println("If you have a problem with internet connectivity, this Wifi Diagnosis might work.");
		System.out.print( "\n" );
		System.out.println("First step: reboot your computer");
		System.out.print("Are you able to connect with the internet? (yes or no)\n");
		  String input;
		  Scanner keyboard = new Scanner(System.in);
		  input = keyboard.nextLine();
		
		if (input.equals("yes")){
			System.out.print("Rebooting the computer seems to work"); 
			System.exit(0);
		}
		else if (input.equals("no")) {
			System.out.println("Second step: reboot your router"); 
			
			System.out.print("Now are you able to connect with the internet? (yes or no)\n");
			input = keyboard.nextLine();
			if (input.equals("yes")){
				System.out.print("Rebooting the router seems to work"); 
				System.exit(0);
			}
			else if (input.equals("no")) {
				System.out.println("Third step: make sure that the cables to your router are plugged in firmly and your router is getting power");
				
				System.out.print("Now are you able to connect with the internet? (yes or no)\n");
				input = keyboard.nextLine();
				if (input.equals("yes")){
					System.out.print("Checking the router's cables seemed to work"); 
					System.exit(0);
				}
					else if (input.equals("no")) {
						System.out.println("Fourth step: move the computer closer to your router"); 
						System.out.print("Now are you able to connect with the internet? (yes or no)\n");
						input = keyboard.nextLine();
						if (input.equals("yes")){
							System.out.print("Moving the computer closer to the router seemed to work"); //Dialogue box advising that moving the computer seemed to work
							System.exit(0);
						}
							else if (input.equals("no")) {
								System.out.println("Fifth step: Contact your ISP"); 
								System.out.println("Make sure your ISP is hooked up to your router.");
								System.exit(0);
								}
						}		
			
					}
	
keyboard.close();

				}
			}
		}
