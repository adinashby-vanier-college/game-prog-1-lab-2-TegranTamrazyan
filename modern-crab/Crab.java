// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * 
 */
public class Crab extends Actor
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the Crab wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Lobster a = (Lobster)getOneIntersectingObject(Lobster.class);
        if ((a != null)) {
            getWorld().removeObject(a);
        }
        
        
        if (Greenfoot.isKeyDown("up")) {
            move(10);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(-10);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-10);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(10);
        }
    }
}
