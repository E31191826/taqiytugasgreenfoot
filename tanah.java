import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tanah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tanah extends World
{

    /**
     * Constructor for objects of class tanah.
     * 
     */
    public tanah()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    private void munculCupcake(){
        addObject(new cupcake(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getMicLevel());
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        semut semut = new semut();
        addObject(semut,33,316);
        munculCupcake(); 
    }
    
    public boolean cekCupcake(){
        return getObjects(cupcake.class).size() == 0 ;
    
    }
    
    public void act (){
    if(cekCupcake()){
        munculCupcake();
    }
}
}


