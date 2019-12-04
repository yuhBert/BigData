/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ImageProcessing;

/**
 *
 * @author mariscalyu_SD2082
 */
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ConvertBlackWhite {

    public static void main(String... args) {

        try {

            File input = new File("C:\\Users\\mariscalyu_SD2082\\Documents\\NetBeansProjects\\images/flower.png");
            BufferedImage image = ImageIO.read(input);

            BufferedImage result = new BufferedImage(
                    image.getWidth(),
                    image.getHeight(),
                    BufferedImage.TYPE_BYTE_BINARY);

            Graphics2D graphic = result.createGraphics();
            graphic.drawImage(image, 0, 0, Color.WHITE, null);
            graphic.dispose();

            File output = new File("C:\\Users\\mariscalyu_SD2082\\Documents\\NetBeansProjects\\images/flower-blackWhite.png");
            ImageIO.write(result, "png", output);

        }  catch (IOException e) {
            e.printStackTrace();
        }

    }

}
