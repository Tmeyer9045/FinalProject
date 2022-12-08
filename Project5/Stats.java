
import java.util.ArrayList;
public class Stats  
{   /** 
    * All the variable fields will be decalred in stats so that they can be used
    * by the other classes
    */
   protected int strength;
   protected int speed;
   protected int durable;
   protected int luck;
   public int evil;
   public int good;
   //going to track stats to just print out texts in made method if certain requirments
   // are met
   public Stats() {
    
    }
   public Stats(int s, int sp, int d, int l, int ot )
   {
    this.strength = s;
    this.speed = sp;
    this.durable = d;
    this.luck = l; 
    }
    public Stats( int e, int g)
    {
        this.evil = e;
        this.good = g;
    } 
  /**
   * Below is just a bunch of getters for the stats, and choice values
   */
    public int getStrength() 
   {
        return strength; 
    }
  public int getSpeed() 
    {
        return speed; 
    }
  public int getDurable()
    {
        return durable;
    }
  public int getLuck()
    {
        return luck;
    }
  
 /** 
  * below is a method to add to stats
  */
    public void addStat(int stat) 
  {
        if(stat == 0) { strength = strength + 1;}
        if(stat == 1) {speed = speed + 1;}
        if(stat == 2) {durable = durable + 1;}
        if(stat == 3) {luck = luck + 1; }
        
    }
  
  
    }

