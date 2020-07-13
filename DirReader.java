/**
 * Write a description of DirReader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.File;

public class DirReader {
    public void checkDir(){
        DirectoryResource dr = new DirectoryResource();
        for(File f : dr.selectedFiles()){
            System.out.println(f);
        }
    }
}
