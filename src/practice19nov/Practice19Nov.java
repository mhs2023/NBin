
package practice19nov;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class Practice19Nov {

   
    public static void main(String[] args) {
       readWrite();
    }
    
    public static void readWrite() {
    Path sourceFile = Paths.get("F:\\New_Text_Document.txt");
    Path targetFile = Paths.get("F:\\Emplo.txt");
    
        try {
            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.err.format("I/O Error when copying file ");
        }
    }
    
}
