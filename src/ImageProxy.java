import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageProxy implements Elements{

    private String name;
    Image realImage=null;

    ImageProxy(String name){
        this.name=name;
    }

    public void print() throws IOException {
        if(realImage==null){
            realImage = new Image(this.name);
        }

        realImage.print();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}