/**
 * @author      Hasib Bhuiyan
 * @version     1 
   (current version number of program)
 * Jar.java
 * ICS4U1
 * April 8, 2022
 */
public class Jar{
  private String spread; //Spread name
  private double volRemain; //remaining volume
  private double totalVol; //total volume
  private boolean organic; //if it's organic

  public Jar(){//Constructor with default values; no parameters
    spread="Butter";
    volRemain=200;
    totalVol=200;
    organic=false;
  }
  public Jar(String spread, double volRemain, double totalVol, boolean organic){//Coonstructor with set values; 4 parameters
    this.spread=spread;
    this.volRemain=volRemain;
    this.totalVol=totalVol;
    this.organic=organic;
  }


  // accessor/gettor methods
  public String getType(){
    return spread;
  }
  public Double getVolRemain(){
    return volRemain;
  }
  public Double getTotalVol(){
    return totalVol;
  }
  public boolean isOrganic(){
    return organic;
  }

  //setter/mutator methods
  public void setType(String spread){
    this.spread=spread;
  }
  public void setVolRemain(double volRemain){
    this.volRemain=volRemain;
  }
  public void setTotalVol(double totalVol){
    this.totalVol=totalVol;
  }
  public void setIfOrganic(boolean organic){
    this.organic=organic;
  }
  

  /**
 * taking amounts of spread from jar; tracking volume of jar
 * @param variable: double amount; user input of amount of spread to be taken
 */

  public void spreading(double amount){
    if (amount<=volRemain){//if amount taken is less than remaining:
      volRemain-=amount;
      }
    else{
      System.out.println("Sorry, that is too much, we only do have "+volRemain+" ml");
    }
  }

  /**
 * undo the spread method above; unspreading takes back the spread that has been taken by user
 * @param variable(s): double amount, double unspread; making sure unspreading does not go beyond amount spreaded
 */

  public void unSpreading(double amount, double unspread){
    if (unspread<=amount){
      volRemain+=unspread;
      }
    else{
      System.out.println("Sorry, you can't unspread that much, you only spreaded "+amount+" ml");
    }
  }

  /**
 * refilling the jars; filling it to total volume available
 * @param variable:int ifyes; conditional variable, checking if user wants to use this method or not
 * 
 */

  public void refill(int ifyes){
    if (ifyes==1){
      volRemain+=(totalVol-volRemain);
      }
    else{
      System.out.println("No refills, well alright");
    }
  }

  //printing out jar contents; toString()
  public String toString(){
    return " "+spread+", "+volRemain+"/"+totalVol+" ml remaining, Is it organic?: "+organic;
  }
  
}