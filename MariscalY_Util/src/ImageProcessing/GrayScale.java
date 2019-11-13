/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ImageProcessing;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
/**
 *
 * @author mariscalyu_SD2082
 */
public class GrayScale {
     BufferedImage image;
    int width;
    int height;

    public GrayScale() {

        try {
            File input = new File("C:\\Users\\mariscalyu_SD2082\\Documents\\NetBeansProjects\\images/flower.png");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();

            for (int i = 0; i < height; i++) {

                for (int j = 0; j < width; j++) {

                    Color c = new Color(image.getRGB(j, i));
                    int red = (int) (c.getRed() * 0.299);
                    int green = (int) (c.getGreen() * 0.587);
                    int blue = (int) (c.getBlue() * 0.114);
                    Color newColor = new Color(0,0,0);

                    image.setRGB(j, i, newColor.getRGB());
                }
            }

            File ouptut = new File("C:\\Users\\mariscalyu_SD2082\\Documents\\NetBeansProjects\\images/black.png");
            ImageIO.write(image, "png", ouptut);

        } catch (Exception e) {
        }
    }

    static public void main(String args[]) throws Exception {
        GrayScale obj = new GrayScale();
    }
}