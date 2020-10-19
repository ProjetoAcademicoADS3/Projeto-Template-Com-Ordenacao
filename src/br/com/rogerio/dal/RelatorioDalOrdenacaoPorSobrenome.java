/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rogerio.dal;

import br.com.rogerio.modelo.Relatorio;

/**
 *
 * @author roger
 */
public class RelatorioDalOrdenacaoPorSobrenome extends RelatorioDal {

    public RelatorioDalOrdenacaoPorSobrenome(String nome) {
        super(nome);
    }

    @Override
    public boolean ePrimeiro(Relatorio aluno1, Relatorio aluno2) throws Exception {

        String[] nome1 = aluno1.getNome().split(" ");
        String sobrenome1 = nome1[nome1.length - 1];
        String[] nome2 = aluno2.getNome().split(" ");
        String sobrenome2 = nome2[nome2.length - 1];

        if (sobrenome1.equalsIgnoreCase("junior")
                || sobrenome1.equalsIgnoreCase("neto")
                || sobrenome1.equalsIgnoreCase("filho")) {
            sobrenome1 = nome1[nome1.length - 2];
        }
        if (sobrenome2.equalsIgnoreCase("junior")
                || sobrenome2.equalsIgnoreCase("neto")
                || sobrenome2.equalsIgnoreCase("filho")) {
            sobrenome2 = nome2[nome2.length - 2];
        }
        return sobrenome1.compareToIgnoreCase(sobrenome2) <= 0;
    }

}
