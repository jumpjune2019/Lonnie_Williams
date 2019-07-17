import java.io.*;
import java.util.*;
 
public class Phone {
	public static String help_msg=	"Press: H  Help   -  A  Add contact  -  S  Search  - Q  Exit :";
	public static void main(String[] args) {		
		System.out.println("\n\n***** Welcome to MyPhone Book *****\n\n");
		Scanner s=new Scanner(System.in);		
		for(;;){
				System.out.print("[Main Menu] "+help_msg+"\n:");
				String command=s.nextLine().trim();				
 
				if (command.equalsIgnoreCase("H")){					
					System.out.println(help_msg);
				}else if (command.equalsIgnoreCase("A")){
					//Adds new contact
					System.out.print("Type in contact details in the format: name, phone, city \n:");
					String line=s.nextLine().trim();
					String [] tmp=line.split(",");
					while(tmp.length!=3){
						System.out.print("Error, Try the format : name,lname,phone\n:");
						line=s.nextLine().trim();
						tmp=line.split(",");						
					}
					try{
						//You can edit to a .txt or .csv file.
						FileWriter fs = new FileWriter("phonebook.txt",true);
						BufferedWriter out = new BufferedWriter(fs);
						out.write(line+"\n");
						out.close();
					}catch(Exception e){e.printStackTrace();}
 
				}else if (command.equalsIgnoreCase("S")){
					//Search for existing contact
					System.out.print("Type in the name you are searching for :\n:");
					String search=s.nextLine().trim();
					search=search.toLowerCase();
					try{
							File f=new File("phonebook.txt");
							Scanner s2=new Scanner(f);
							while(s2.hasNextLine()){
								String line=s2.nextLine();
								if (line.toLowerCase().indexOf(search)>=0){
									System.out.print("\nResult: "+line);
								}
							}
							System.out.print("\n\n");
						}catch(Exception e){e.printStackTrace();}	
 
				}else if (command.equalsIgnoreCase("Q")){
					System.out.println("Thank you, Come again....");
					System.exit(0);
				}else{					
					System.out.print("Unknown command ! Try again \n:");
				}
 
		}
 
	}
 
}