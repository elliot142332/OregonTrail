import java.util.Scanner;//inports scanner and random
import java.util.Random;
public class RandomEvents{
  public static Scanner scanner = new Scanner(System.in);//inputs scanner set up


  public static void main(String[] args){
      RandomEvents ot = new RandomEvents();//inputs random set up
      ot.randomizer();
  }

  public void randomizer(){//randomizing through all the options
    Random randomizer = new Random();
    int number = randomizer.nextInt(7)+1;//picks a number 1-7 and plays method associated
    if(number==1){sickness();}
    else if(number==2){brokenCart();}
    else if(number==3){robber();}
    else if(number==4){bisonPassing();}
    else if(number==5){shop();}
    else if(number==6){nothingHappened();}
    else if(number==7){oxDies();}

  }

  public void sickness(){//sickness method, makes player lose 20 health
    IO.println("You got sick over the long day of traveling\n-20 health");
    Player.health-=20;
  }
  public void brokenCart(){//broken cart. if enough parts spends one and repairs
    IO.println("");
    IO.println("Oh no, the cart broke!");
    if(Player.parts>=1){
      IO.println("");
      IO.println("You used one part to fix the cart.");
      Player.parts-=1;
    }
    else{//if not enough parts you lose and game ends
      IO.println("");
      IO.println("You don't have enough parts to fix the cart. You cannot make it to Oregon");

      System.exit(0);
    }
  }
  public void robber(){//robber method, looses money,health, and food
    IO.println("");
    IO.println("You were robbed!");
    IO.println("-10 health\n-20 food");
    if(Player.money>=50){//if money is less than 50 no money is robbed
    Player.money-=50;
    IO.println("-50 money");
  }
    Player.health-=20;
    Player.food-=20;
  }
  public void bisonPassing(){//bising passing method
    if(Player.ammo>=10){//if ammo is 10 or more runs event
      IO.println("");
      IO.println("Bison are passing, would you like to hunt them for food?\n Type Yes or No");
      String choice = scanner.nextLine();//uses scanner to check for input
      choice = choice.toLowerCase();//switches input to lowercase
      if(choice.equals("yes")){//if yes, spends 10 ammo and runs hunting
        Player.ammo-=10;
        Random hunting = new Random();
        int random = hunting.nextInt(2)+1;//randoms 1-2, if 1 you succeed
          if(random==1){
            IO.println("You succeeded! +50lb of food");
            Player.food += 50;}
          else if(random==2){//if 2 you dont get any food
              IO.println("You missed and couldn't get any food");}
            }}

  }
  public void shop(){//shop method
    IO.println("");
    IO.println("You have encountered a store");
    Store.main(new String[0]);//runs the shop method in OregonTrail class
  }
  public void nothingHappened(){//nothing happens class
    IO.println("");
    IO.println("Nothing out of the ordinary happened");
    OregonTrail menu = new OregonTrail();//nothing happens and you return to menu
    menu.menu();
  }
  public void oxDies(){//ocDies method
    IO.println("");
      IO.println("One of your ox dies from disease");
      Player.ox-=1;
      if(Player.ox<=0){//lose 1 ox, if less than 0 you lose, closes game
        IO.println("You don't have enough ox to continue on the trail.");
        System.exit(0);
      }
  }



}
