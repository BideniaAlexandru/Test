import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Image implements Elements{
    private String name;

    public void print() {
        System.out.println(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }

    Image(String name) {
        this.name = name;
        new ImageLoaderFactory().load(name);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}