/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sparks;

import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author gtiago
 */
public class SPARKS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        getDiretorio();
    }

    public static String getDiretorio() {

        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagens & Videos", "jpg", "mov", "avi", "mp4");
        chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);

        String path = chooser.getSelectedFile().getParent();
        System.out.println(path);
        return path;
    }

}
