/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constantes;

/**
 *
 * @author gtiago
 */
public class Aquisicao {

    public final static int PROPRIA = 1;
    public final static int TERCEIROS = 2;

    public String getNome(int aquisicaoNome) {

        if (aquisicaoNome == 1) {
            return "propria";
        } else if (aquisicaoNome == 2) {
            return "terceiros";
        }

        return null;
    }

    public static int getId(String aquisicao) {

        if (aquisicao.equals("propria")) {
            return PROPRIA;
        } else {
            return TERCEIROS;
        }
    }
}
