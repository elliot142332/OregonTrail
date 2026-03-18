import java.util.Scanner;//scanner import
public class Store{//store class
  public static Scanner scanner = new Scanner(System.in);//impliments the scanner into the class

  public static void main(String[] args){
    Store ot = new Store();
    ot.shopping();
    IO.println("");
  }
  public void shopping(){//shopping method
    IO.println("Stock up on everything you need.");
    IO.println("Enter the number associated with the good you want");
    IO.println("1.) food\n2.) parts\n3.) ammo\n4.) ox\n5.) Leave store");
    while(true){//runs until valid input
      if(scanner.hasNextInt()){// checks scanner then pulls methods assocaited with value
    int choice = scanner.nextInt();
    if(choice==1){
      food();
      shopping();
    }
    else if(choice==2){
      parts();
      shopping();
    }
    else if(choice==3){
      ammo();
      shopping();
    }
    else if(choice==4){
      ox();
      shopping();
    }
    else if(choice==5){//goes back to menu if selected
      OregonTrail menu = new OregonTrail();
      menu.menu();
    }}
    else{//resets if invalid number
      IO.println("Invalid, input number");
  scanner.nextLine();}}
  }

//each shopping method seen below works the same
  public void food(){//method for the food option
    IO.println("");
      IO.println("Stock up on the food you need. Recomended 150 pounds. You eat 10 pounds per day.");
      IO.println("Food is $2 per pound, enter amount you want.");
      IO.println("Money = $" + Player.money);
      while(true){//repeats until valid input
        if(scanner.hasNextInt()){//checks the scanner input
      while(Player.money>=2){//if money is enough runs food
        int amount = scanner.nextInt();
          if(amount*2<=Player.money){//makes sure input is enough to purchase
            Player.food+=amount;//increases food
            Player.money-=amount*2;//decreases money
            IO.println("Food = " + Player.food);//prints new values
            IO.println("Money left = $" + Player.money);

          }
          else{//runs if not enoguh money
            IO.println("Not enough money");
          }break;}}
          else{//runs if the input is invalid
            IO.println("Invalid, input number");
            scanner.nextLine();
          }break;}//breaks loop after selection
      }
  public void parts(){
    IO.println("");
  IO.println("Stock up on the parts you need. Recomended 3 parts.");
  IO.println("Parts are $30 per part, enter amount you want.");
  IO.println("Money = $" + Player.money);
  while(true){
    if(scanner.hasNextInt()){
  while(Player.money>=30){
    int amount = scanner.nextInt();
      if(amount*30<=Player.money){
        Player.parts+=amount;
        Player.money-=amount*30;
        IO.println("Parts = " + Player.parts);
        IO.println("Money left = $" + Player.money);
          break;
      }
      else{
        IO.println("Not enough money");
      }break;}}
      else{
        IO.println("Invalid, input number");
      scanner.nextLine();}
      break;}
  }
  public void ammo(){
    IO.println("");
    IO.println("Stock up on the ammo you need. Recomended 100 ammo.");
    IO.println("Ammo is $1 per, enter amount you want.");
    IO.println("Money = $" + Player.money);
    while(true){
      if(scanner.hasNextInt()){

      int amount = scanner.nextInt();
        if(amount*1<=Player.money){
          Player.ammo+=amount;
          Player.money-=amount;
          IO.println("Ammo = " + Player.ammo);
          IO.println("Money left = $" + Player.money);
            break;
        }
        else{
          IO.println("Not enough money");
        }break;}
        else{IO.println("Invalid, input number");
        scanner.nextLine();
      break;}
    }
  }
  public void ox(){
    IO.println("");
    IO.println("Stock up on the ox you need. Recomended 4 ox.");
    IO.println("It is $50 per ox, enter amount you want.");
    IO.println("Money = $" + Player.money);
    while(true){
      if(scanner.hasNextInt()){
      int amount = scanner.nextInt();
        if(amount*50<=Player.money){
          Player.ox+=amount;
          Player.money-=amount*50;
          IO.println("ox = " + Player.ox);
          IO.println("Money left = $" + Player.money);
            break;
        }
        else{
          IO.println("Not enough money");
        }break;}
        else{
          IO.println("Invalid, input number");
          scanner.nextLine();
          break;
        }
    }
  }
}
