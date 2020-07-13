import edu.duke.*;
import java.io.*;

public class GrayScaleConverter {
    //start with image you want to convert
    public ImageResource makeGray(ImageResource inImage) {
        //make a blank image of the same size
        ImageResource outImage = new ImageResource(inImage.getWidth(), inImage.getHeight());
        //for each pixel in outImage
        for (Pixel pixel: outImage.pixels()){
            //look at the corresponding pixel in inImage
            Pixel inPixel = inImage.getPixel(pixel.getX(),pixel.getY());
            //check RGB values of inPixel
            int avg = (inPixel.getRed() + inPixel.getBlue() + inPixel.getGreen())/3;
            pixel.setRed(avg);
            pixel.setBlue(avg);
            pixel.setGreen(avg);
        }
        //outImage is your answer
        return outImage;
    }
    public void testGray(){
    ImageResource ir = new ImageResource();
    ImageResource gray = makeGray(ir);
    gray.draw();
}
public void selectAndConvert(){
    DirectoryResource dr = new DirectoryResource();
    for (File f: dr.selectedFiles()){
    ImageResource inImage = new ImageResource(f);
    ImageResource gray = makeGray(inImage);
    gray.draw();
    }

}
}
