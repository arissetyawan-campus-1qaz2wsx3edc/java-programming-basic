/*  
* This is to demo with boolean
* arissetyawan.email@gmail.com
*/

package operators;

public class AndroRobot extends JavaRobot{
   public static void main(String[] argv){
      AndroRobot ar = new AndroRobot();
      ar.setPower(true);
      ar.setEnergyLevel(100);
      ar.setAmoStock(100);
      ar.resumeStats();
      ar.respondToDanger();
      
      ar.printLine();
      ar.setEnemy(true, 0);
      ar.respondToDanger();
      
      ar.printLine();
      ar.setEnemy(true, 2);
      ar.respondToDanger();
      
      ar.printLine();
      ar.setEnemy(true, 1);
      ar.reloadAmo();
      ar.respondToDanger();

      ar.printLine();
      ar.setEnemy(true, -1);
      ar.respondToDanger();

      ar.printLine();
      ar.setEnergyLevel(30);
      ar.setEnemy(true, 2);
      ar.respondToDanger();
      ar.fireEnemy();
      ar.fireEnemy();
      ar.fireEnemy();

      ar.printLine();
      ar.setEnergyLevel(67);
      ar.setEnemy(true, 1);
      ar.respondToDanger();
      ar.fireEnemy();
      ar.fireEnemy();
      ar.fireEnemy();

      ar.printLine();
      ar.setEnemy(true, 1);
      ar.setEnergyLevel(31);
      ar.setAmoStock(0);
      ar.respondToDanger();
   }

   AndroRobot(){
     super("Andro robot v1");
   }

   protected void printLine(){
       System.out.println("======================");
   }
}

class JavaRobot
{
  private boolean power = false;
  private int energyLevel = 0; 
  private final int MIN_WORKING_ENERGY = 30; 
  private boolean charging = false;

  private boolean enemyDetect = false;
  private int amoStock = 0;
  private boolean fireOn = false;
  private boolean dangerLeft = false;
  private boolean dangerRight = false;
  private boolean dangerBack = false;
  private boolean dangerFront = false;

  private void resetPositions(){
    dangerLeft = false;
    dangerRight = false;
    dangerBack = false;
    dangerFront = false;
  }

  protected void setEnemy(boolean enemyDetect, int position)
  {
    this.resetPositions();
    this.enemyDetect = enemyDetect;
    if(position==0)
    {
      this.verbose("Enemy detected on left");
      this.dangerLeft = true;
    }

    else if(position==1)
    {
      this.verbose("Enemy detected on right"); 
      this.dangerRight = true;
    }

    else if(position==2)
    {      
      this.verbose("Enemy detected on back");
      this.dangerBack = true;
    }

    else
    {      
      this.verbose("Enemy detected on front");
      this.dangerFront = true;
    }

  }
  
  protected void setPower(boolean powerInput)
  {
    this.power = powerInput;
  }
  
  private void verbose(String status){
    System.out.println("" + status );
  }

  protected void reloadAmo(){
    verbose("before reload amo: " + this.amoStock);
    this.amoStock += 1;
    verbose("after reload amo: " + this.amoStock);
  }

  protected void setAmoStock(int amoInput)
  {
    this.amoStock = amoInput;
  }

  protected void setEnergyLevel(int energyInput)
  {
    this.energyLevel = energyInput;
  }

  protected void fireEnemy()
  {
    if(!this.power || this.energyLevel < this.MIN_WORKING_ENERGY){
      gameOver();
    }
    else
    {
       if(this.energyLevel < this.MIN_WORKING_ENERGY)
       {
          this.verbose("energy level < working energy");
          this.gameOver();
          this.chargingOn();
       }
       else
       {
          if(this.amoStock > 0)
          {
             verbose(">> Initializing to fire on");
             verbose("Before: energyLevel: " + this.energyLevel);
             verbose("Before: amoStock: " + this.amoStock);
             this.fireOn = true;
             this.energyLevel -= 1;
             this.amoStock -= 1;

             verbose("after: energyLevel: " + this.energyLevel);
             verbose("after: amoStock: " + this.amoStock);
          }
          else
          {           
           verbose("amo stock < 0");
           verbose("please reload amo");
          }
       }
    } 
  }

  private void line(){
    System.out.println("---------------");
  }

  private void gameOver(){
      verbose("gameover");  
  }

  private void turnPosition()
  {
    if(this.energyLevel >= this.MIN_WORKING_ENERGY){
      if(this.dangerLeft){
        verbose("turn left");
      }
      else if(this.dangerRight){
        verbose("turn right");
      }
      else if(this.dangerFront){
        verbose("stay to fire");
      }
      else{
        this.dangerLeft = true;
        this.turnPosition();
        this.turnPosition();
      }
    }
    else
    {
      gameOver();
    }
  }

  protected void respondToDanger(){
    if(!this.power)
    {
       verbose("im off");
       gameOver();
    }
    
    else
    {
        if(this.enemyDetect)
        {
          
          this.turnPosition();
          // fire the enemy
          this.fireEnemy();
        }
        else
        {
           verbose("im singing, no enemy! horee !!!!");
        }
    }
  }

  protected void chargingOn(){
    this.verbose("charging...");
    this.charging = true;
  }

  protected void resumeStats(){
    line();
    verbose("resuming stats...");
    line();
    this.verbose("Power: " + power);
    this.verbose("Initializing...");
    this.verbose("energyLevel: " + energyLevel);
    this.verbose("charging: " + charging);
    this.verbose("enemyDetect: " + enemyDetect);
    this.verbose("amoStock: " + amoStock);
  }

  JavaRobot(String name)
  {
    this.verbose("Hello...");
    this.verbose("My name is " + name);
    this.line();
    this.line();
  }


}
