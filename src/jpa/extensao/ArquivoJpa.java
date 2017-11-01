/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.extensao;

import jpa.ArquivoJpaController;
import util.Conexao;

/**
 *
 * @author gtiago
 */
public class ArquivoJpa extends ArquivoJpaController {

    public ArquivoJpa() {

        super(Conexao.conectar());
    }

    //Metodos 
}
