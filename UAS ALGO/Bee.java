import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Bee extends Actor
{
       
    public void act()
    {
         if (Greenfoot.isKeyDown("d")){
           setLocation(getX()-5, getY());
       }
       if (Greenfoot.isKeyDown("a")){
          setLocation(getX()+5, getY());
       }
       if (Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY()-5);
       }
       if (Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY()+5); 
       }
    }
}
