import java.util.Scanner;
public class FinalGame{
  
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    float Money=0;
    float Zen=0;
    int Count=0;
    player_name();

    System.out.println("Do you want to hand in your resignatiod? Y-1 N-2 : ");
    int Company = in.nextInt();
    float i=0;
    float a=0;
    if (Company==1){
      System.out.println("Let's start! Now You can collect your Zen point!\n And also you get severance pay(money +100)");
      Money=Money+100; 
    }
    else{
      while (i < 100){
        System.out.println("Work!");
        System.out.println("You can't get Zen point... But you get pay!(Money +5)");
        Money=Money+5;
        System.out.println("Money=" + Money);
        System.out.println("Do you want to hand in your resignatiod? Y-1 N-2 : ");
        int Company_again=in.nextInt();
        if (Company_again==1){
          System.out.println("Let's start! Now You can collect your Zen point!\nAnd also you get severance pay(money +100)");
          Money=Money+100;
          i=i+1000;

        }
        else if (Company_again==2){
          System.out.println("Ah...");
        }
      }
    }
    Collect_Zen(Money,Zen,Count);
    
  }
  
  
  public static String player_name(){
    Scanner in = new Scanner(System.in);
    System.out.println("Welcome!");
    System.out.println("What is your name? : ");
    String player_name = in.nextLine();
    System.out.println("You need to collect 100 Zen points! cheer up!"+ player_name);
    System.out.println("-------------GAME START--------------");
    return player_name;
  }
  
  
  public static void Collect_Zen (float Money,float Zen,int Count){
    Scanner in = new Scanner(System.in);
    System.out.println("----------------Collect Zen!---------------");
    System.out.println("Money=" + Money + "Zen= " + Zen);
    System.out.println("");
    System.out.println("You have six ways to get Zen and Money! Here is ways");
    while (Zen<100 && Money>0){
      System.out.println("Money="+ Money+"Zen= "+Zen+"count="+Count);
      System.out.println("1.Help people (Zen +5, Money -10)");
      System.out.println("2.Donation (Zen +Your Donation Money x 10%, Money=You want)");
      System.out.println("3.voluntary service (Zen +10, Money -20)");
      System.out.println("4.deep bow (Zen +1)");
      System.out.println("5.Go back to company, and Work! (Zen -3, Money +20)");
      System.out.println("6.Buy temple(Small temple (+Zen +10 everytime, +Money +3 everytime, Money -100)\n Large temple (+Zen +15 everytime, +Money +5 everytime, Money -300))");
      System.out.println("collect number(1-6) : ");
      int Collect = in.nextInt();
      System.out.println("");
      
      if (Collect==6){
        System.out.println("What temple do you want to buy? small-1 Large-2 : ");
        int Choose_temple = in.nextInt();
        if (Choose_temple==1){
          Money=Money-100;
          System.out.println("Please enter the temple name : ");
          String temple_name = in.nextLine();
          System.out.println("Now you can get +Zen +10 everytime, +Money +3 everytime Because of your temple" + temple_name);
          Count=Count+1;      
        }
        else if (Choose_temple==2){
          Money=Money-200;
          System.out.println("Please enter the temple name : ");
          String temple_name = in.nextLine();
          System.out.println("Now you can get +Zen +15 everytime, +Money +5 everytime Because of your temple" +  temple_name);
          Count=Count+1; 
        }
        
      }
      else if (Collect==1){
        System.out.println("Help people...");
        System.out.println("Thank you !");
        Money=Money-10;
        Zen=Zen+5;
        Count=Count+1; 
        System.out.println("");
      }
      
      else if (Collect == 2){
        System.out.println("How much do you want Donation? : ");
        float Donation = in.nextFloat();
        Money=Money-Donation;
        Zen=Zen+Donation/10;
        Count=Count+1; 
        System.out.println("");
      }
      else if (Collect == 3){
        Count=Count+1;
        System.out.println("Thank you for join us! Please care this poor dog...");
        System.out.println("Wow! Dog get health! Please come here continue...");
        Money=Money-20;
        Zen=Zen+10;
        System.out.println("");
        
      }
      else if (Collect == 4){
        System.out.println("Save us, merciful Buddha!");
        Zen=Zen+1;
        Count=Count+1;
        System.out.println("");
      }
      else if (Collect == 6){
        System.out.println("Work!");
        Money=Money+20;
        Zen=Zen-3;
        Count=Count+1;
        System.out.println("");
        
      }
      
    }
    if (Money<=0){
      System.out.println("You don't have Money anymore... Please Start again...");
      System.out.println("-------------------Game Stop-----------------");
    }
    else {
      System.out.println("Congratulations! Now you are Buddhist monk!");
      
    }
    
  }
  
}
