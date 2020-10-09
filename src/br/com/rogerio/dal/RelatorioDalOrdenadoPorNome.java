/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rogerio.dal;

import br.com.rogerio.modelo.Relatorio;
import java.util.ArrayList;

/**
 *
 * @author roger
 */
public class RelatorioDalOrdenadoPorNome extends RelatorioDal {

    public RelatorioDalOrdenadoPorNome(String nome) {
        super(nome);
    }

    @Override
    public boolean ePrimeiro(Relatorio aluno1, Relatorio aluno2) throws Exception {
        if (aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) <= 0) {
            return true;
        } else {
            return false;
        }
    }

}
