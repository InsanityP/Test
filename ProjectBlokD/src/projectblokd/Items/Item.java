package projectblokd.Items;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Item {

    public int x;
    public int y;
    public BufferedImage image;
    public String imageString;
    
    public Item(int xco, int yco) {
        x = xco;
        y = yco;
    }
    
    public Item(){ 
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
    public int setX(int xco){
        return x = xco;
    }
    public int setY(int yco){
        return y = yco;
    }
    
    public Image setImage(){
        try{
            image = ImageIO.read(new File(imageString));
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return image;
    }

}
