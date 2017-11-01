/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sparks;

/**
 *
 * @author gtiago
 */
public class Teste {
    
    public static void main(String[] args) {
        String path = "C:/Users/gtiago/Pictures/fotos";
        
        String dir = path.substring(path.lastIndexOf("/"), path.length());
        System.out.println(dir);
        System.out.println(dir.substring(1));
        
    }
    
}
