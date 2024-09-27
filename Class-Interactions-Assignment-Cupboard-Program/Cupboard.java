/**
 * @author      Hasib Bhuiyan
 * @version     1 
   (current version number of program)
 * Cupboard.java
 * ICS4U1
 * April 8, 2022
 */
public class Cupboard{
  private Jar j1;//first jar of original cupboard class
  private Jar j2;//second jar of original cupboard class
  private Jar j3;//third jar of original cupboard class
  private Jar j4;//jar used as reference object

  //Constructor with intitial 3 jar objects
  public Cupboard(Jar j1, Jar j2, Jar j3){
    this.j1=j1;
    this.j2=j2;
    this.j3=j3;
  }

  /**
 * Replacing a given jar with another specified jar; changing every attribute
 * @param variable(s): int rep, Jar j4; where rep is number selection for original cupboard with it's 3 Jars, and j4 is new selection of Jar
 */
  public void ReplaceJar(int rep, Jar j4){
    if (rep==1){
      j1.setType((j4.getType()));
      j1.setTotalVol((j4.getTotalVol()));
      j1.setVolRemain((j4.getVolRemain()));
      j1.setIfOrganic((j4.isOrganic()));
    }
    else if(rep==2){
      //j2 = j4;
      j2.setType((j4.getType()));
      j2.setTotalVol((j4.getTotalVol()));
      j2.setVolRemain((j4.getVolRemain()));
      j2.setIfOrganic((j4.isOrganic()));
    }
    else if(rep==3){
      j3.setType((j4.getType()));
      j3.setTotalVol((j4.getTotalVol()));
      j3.setVolRemain((j4.getVolRemain()));
      j3.setIfOrganic((j4.isOrganic()));
    }
  }

  //Accessor/getter methods
  public String getJ1(){
    return j1.toString();
  }
  public String getJ2(){
    return j2.toString();
  }
  public String getJ3(){
    return j3.toString();
  }
  

  //prints out toString(); An accumulated collection of all jars inside the cupboard
  public String toString(){
    return "1) "+getJ1()+"\n2) "+getJ2()+"\n3) "+getJ3();
  }
  
}