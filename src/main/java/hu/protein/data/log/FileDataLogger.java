package hu.protein.data.log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * A következő feladatok eredményeit írja képernyőre, illetve az eredmeny.txt fájlba! A kiírást
 * a feladat sorszámának feltüntetésével kezdje (például: 4. feladat)!
 * @author Peter_Fazekas on 2017.03.19..
 */
public class FileDataLogger implements DataLogger {

    private static final String PATH = "src\\main\\resources\\";
    private final String filename;

    public FileDataLogger(String filename) {
        this.filename = PATH + filename;
        File file = new File(this.filename);
        file.delete();
    }

    @Override
    public void println(String line) {
        System.out.println(line);
        try (PrintWriter log = new PrintWriter(new FileWriter(filename, true))){
            log.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
