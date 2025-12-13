
import java.awt.Color;

public class Editor4 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Editor4 <filename> <steps>");
            return;
        }

        String sourceFileName = args[0];
        int n = Integer.parseInt(args[1]);
        Color[][] sourceImage = Runigram.read(sourceFileName);
        Color[][] targetImage = Runigram.grayScaled(sourceImage);
        Runigram.setCanvas(sourceImage);

        Runigram.morph(sourceImage, targetImage, n);
    }
}
    
