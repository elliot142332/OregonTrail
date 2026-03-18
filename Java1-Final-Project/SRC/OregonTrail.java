import java.util.Scanner;//imports tools needed for the class
import java.util.Random;
public class OregonTrail{
public static Scanner scanner = new Scanner(System.in);//Sets up scanner

//Method for the menu
public void menu(){//Sets lose mechanics
  if(Player.health<=0){
    IO.println("you ran out of health.");
    System.exit(0);}
  if(Player.food<=0){
    IO.println("You ran out of food.");
    System.exit(0);
  }//pulls the player class and loads character selection
  Player player = new Player();
  player.daytracker();
  IO.println("");//prints menu and shows stats
  IO.println("////////////////////");
  IO.println("Health = " + Player.health);
  IO.println("Food = " + Player.food);
  IO.println("Money = $" + Player.money);
  IO.println("Parts = " + Player.parts);
  IO.println("Ammo = " + Player.ammo);
  IO.println("Ox = " + Player.ox);
  IO.println("Distance Left = " + Player.distance);
  IO.println("////////////////////");
  IO.println("");
  IO.println("1.) Countinue\n2.) Rest\n3.) Hunt");
  //takes scanner input and runs choice. Uses if statements to cycle through
  while(true){
    if(scanner.hasNextInt()){
  int choice = scanner.nextInt();
  if(choice==1){
    IO.println("1");
    travel();
  }
  else if(choice==2){
    rest();
    menu();

  }
  else if(choice==3){
    hunt();
    menu();

  }}
  else{//Resets if anything other than valid value is chosen
    IO.println("Invalid, input number");
  scanner.nextLine();}}
}//Rest method, uses food to heal, if not enough food goes back to menu
public void rest(){
  if(Player.food>0){
  Player.health += 10;
  Player.food -= 20;}
  else{
    IO.println("");
    IO.println("Not enough food to rest.");
  }
}//Hunting method
public void hunt(){
  IO.println("");
  Images images = new Images();//runs image for hunting
  images.hunt();
  if(Player.ammo>=10){//checks if ammo is enough
    Player.ammo-=10;//uses ammo
    Random hunting = new Random();//runs randomizer to see if you hit
    int random = hunting.nextInt(3)+1;
      if(random==1){//if one add food otherwise get nothing
        IO.println("You succeeded! +50lb of food");
        Player.food += 50;

      }
      else{
        IO.println("You missed and couldn't get any food");

      }
  }
  else{//runs when not enough ammo
    IO.println("not enough ammo.");

  }
}//travel method
public void travel(){
    Images images = new Images();//shows image
    images.traveling();
    Player.distance-=100;//reduces distance each time traveling method is run
    if(Player.distance<=0){//if the distance is 0 you win
    images.finishScreen();//plays win image
    IO.println("You made it to Oregon in " + Player.day + " days!");
    try {//timer to delay 4 seconds until game ends
           Thread.sleep(4000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

    System.exit(0);
  }//suntracts 10 food everytime travel runs, then does random event class
    Player.food-=10;
    RandomEvents.main(new String[0]);
    menu();
}


// main method that runs through all the classes and methods in the proper order
public static void main(String[] args){
  Images images = new Images();
  images.startScreen();
  Player player = new Player();
  player.intro();
  player.job();
  OregonTrail ot = new OregonTrail();
  Store.main(new String[0]);
  ot.travel();

}















}
