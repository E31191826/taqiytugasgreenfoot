import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cupcake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cupcake extends Actor
{
    int timerCupcake = 150 ;
    /**
     * Act - do whatever the cupcake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(isTouching(ant.class)){
            getWorld().removeObject(this);
        }
        timerCupcake-- ;
        if (timerCupcake == 0 ){
        getWorld().removeObject(this);
        }
    }    
}
