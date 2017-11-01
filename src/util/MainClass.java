/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author gtiago lista arquivos de um diretorio
 */
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import model.Arquivo;

public class MainClass {
    
    static final String path = "C:/Users/gtiago/Pictures/fotos";
    static File[] files;
    
    static List<File> listFiles = new ArrayList<>();
    
    public static void main(String[] args) {
        
        listFiles(path);
    }
    
    static void listFiles() {
        File folder = new File("C:/xampp");
        
        String[] files = folder.list();
        
        for (String file : files) {
            System.out.println(file);
        }
    }
    
    static void listFiles2() {
        
        File folder = new File(path);
        
        File[] files = folder.listFiles();
        
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
    
    public int searchFile(Arquivo arquivo) {
        
        for (int i = 0; i < listFiles.size(); i++) {
            
            listFiles.get(i).getName().equals(arquivo.getNumeroCatalogacao());
            System.out.println(listFiles.size());
            System.out.println("listFiles: " + listFiles.get(i).getName());
            System.out.println("listFiles: " + arquivo.getNumeroCatalogacao());
            return i;
        }
        
        return -1;
    }
    
    static void listFilesFilter() {
        File folder = new File(path);

        //Implementing FilenameFilter to retrieve only txt files
        FilenameFilter txtFileFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".JPG")) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        //Passing txtFileFilter to listFiles() method to retrieve only txt files
        File[] files = folder.listFiles(txtFileFilter);
        
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
    
    private static void listFiles(String path) {
        File folder = new File(path);
        
        File[] files = folder.listFiles();
        
        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file.getName());
            } else if (file.isDirectory()) {
                listFiles(file.getAbsolutePath());
            }
        }
    }
    
}
