/**
 * @author      Hasib Bhuiyan
 * @version     1 
   (current version number of program)
 * BreakfastMain.java
 * ICS4U1
 * April 8, 2022
 */
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //Jar instances, new jar objects
    Jar j1 = new Jar("nutella",400,500,false);
    Jar j2 = new Jar("Apple Jam",300,400,true);
    Jar j3 = new Jar("Peanut Butter",350,500,true);
    Jar j4 = new Jar("Coconut Jam",400,550, true);
    Jar j5 = new Jar("Tuna fish", 200, 300, false);
    Jar j6 = new Jar("Cocoa butter", 400, 700, true);
    int replace;//number to track which orginal Jar to replace (jar1, jar2, jar3)
    int newJar; //number retrieved from user, for replacing with new Jar (jar4, 5, 6)
    Jar jreplace=new Jar();//jar object for new jar that will be replaced
    int change;//if user wants to replace jar or not; condition
    int ifyes;//if user wants to refill jar; condition
    int choice=1;//choice for which Jar to choose
    double amount;//the amount user wants to take from the jar
    Cupboard tray = new Cupboard(j1, j2, j3);//new cupboard object
    //while loop restricting input value
    while(choice!=-1){
      System.out.println("Good morning! Ready for breakfast! Go ahead and pick a jar of delicious spreads:"); System.out.println(tray);//toString() showing all jars in the cupboard
      System.out.print("Which Spread Do you want?: ");
      choice = in.nextInt();//choice for type of spread
      if (choice==-1){//quit for choice=-1
        System.out.println("Alright, I hope you had a great breakfast, come back again!");
        break;
      }
      System.out.print("How much spread would you like? ");
      amount = in.nextDouble();//amount of spread taken by user
      if (choice==1){
        j1.spreading(amount);
      }//taking away amount from jar
      else if(choice==2){
        j2.spreading(amount);
      }
      else if(choice==3){
        j3.spreading(amount);
      }
      System.out.println("\nDid you take too much? Well don't worry, how much do you want to unspread? If not, than pass on with a 0: ");
      double unspread = in.nextDouble();//if user wants to undo; unspread
      if (choice==1){
        j1.unSpreading(amount, unspread);
      }//unspreading or undo spread, but limited to amount spread
      else if(choice==2){
        j2.unSpreading(amount, unspread);
      }
      else if(choice==3){
        j3.unSpreading(amount, unspread);
      }
      System.out.println();
      System.out.println("Now, do you want to refill the jars; fill it up so no one knows you finished it:( 1(yes)/0(no) )");
      ifyes = in.nextInt();//refill option; to make everything full
      if (choice==1){
        j1.refill(ifyes);
      }
      else if(choice==2){
        j2.refill(ifyes);
      }
      else if(choice==3){
        j3.refill(ifyes);
      }
      System.out.println();
      System.out.print("Do you want to replace any of the jars: ( 1(yes)/0(no) )");
      change = in.nextInt();//replace condition; if user wants to replac eor not
      if (change==1){
        System.out.println("Which Jar do you want to replace? ");

        //new options to choose from, for replacement
        System.out.println("\n4) "+j4.toString());
        System.out.println("5) "+j5.toString());
        System.out.println("6) "+j6.toString());
        System.out.println("\nWhich one would you like to replace it with? ");
        replace=in.nextInt();//number selection for replacing in cupboard(1, 2, 3)
        newJar = in.nextInt();//number selection for new options(4, 5, 6)

        //user choice for new options for replacement
        if (newJar==4){
          jreplace=j4;
          tray.ReplaceJar(replace,jreplace);
        }
        else if(newJar==5){
          jreplace=j5;
          tray.ReplaceJar(replace,jreplace);
        }
        else if(newJar==6){
          jreplace=j6;
          tray.ReplaceJar(replace,jreplace);
        }
        
        //tray.ReplaceJar(replace,jreplace);//using replace method in cupboard to replace to jar 
      System.out.println(tray);//print out new tray
      }
      else{
        System.out.println("That's alright, no changes than; carry on");
      }//if user does not want to replace; user could pass
      System.out.println();
    }
  }
}