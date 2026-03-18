import java.util.Scanner;//scanner import
public class Player{//player class, stores all the stats so they can be accessed from other classes
  public static Scanner scanner = new Scanner(System.in);
  public static int health=100;
  public static int money=700;
  public static int parts=0;
  public static int ammo=0;
  public static int food=0;
  public static int ox=0;
  public static int distance=1500;
  public static int day=0;

  public void intro(){//method that plays the into message
    IO.println("");
    IO.println("You are trying to travel to Oregon. \nThere is 1500 miles that need to be traversed.");
    IO.println("Everyday you will be able to choose 3 options.");
    IO.println("Continue lets you move on to the next day");
    IO.println("You can rest to use 20 pounds of food \nbut heal 10 health.");
    IO.println("You can also hunt which uses 10 ammo \nbut you can get 50 pounds of food.");
    IO.println("");
  }
  public void daytracker(){//method that runs day counter, decreases everytime travel is run
    IO.println("");
    day +=1;
    IO.println("Day: " + day);
  }
  public void job(){//method for selecting job
    IO.println("What is your name?");
    String name = scanner.next();//scanner for selecting
    IO.println("");
    IO.println(name + ", Choose a profession");
    IO.println("1.) Banker - Starts with more money.");
    IO.println("2.) Farmer - Starts with more health.");
    IO.println("3.) Handyman - Starts with cart parts");
    IO.println("Type the number associated with the job you want. Then hit enter.");
    while(true){
    if(scanner.hasNextInt()){
    int choice = scanner.nextInt();//looks for one of the numbers applicable
      if(choice == 1){
        IO.println("You choose Banker.");
        Player.money+=200;
        break;
      }
      else if(choice==2){
        IO.println("You choose Farmer");
        Player.health+=50;
        break;
      }
      else if(choice==3){
        IO.println("You choose handyman");
        Player.parts+=3;
        break;
      }
      else{
        IO.println("Invalid option");
        }
      }
    else{//trips when invalud value, loops until a valid value is used
      IO.println("Invalid, input number");
      scanner.nextLine();
    }}
  }
}
