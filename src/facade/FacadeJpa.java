/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import jpa.extensao.ArquivoJpa;

/**
 *
 * @author gtiago
 */
public class FacadeJpa {

    private static FacadeJpa instance = null;

    private final ArquivoJpa arquivoJpa;

    public FacadeJpa() {

        arquivoJpa = new ArquivoJpa();
    }

    public static FacadeJpa getInstance() {
        if (instance == null) {
            instance = new FacadeJpa();
        }
        return instance;
    }

    public ArquivoJpa getArquivo() {
        return arquivoJpa;
    }
}
