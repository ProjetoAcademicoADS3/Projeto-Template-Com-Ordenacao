package br.com.rogerio.dal;

import br.com.rogerio.modelo.Relatorio;
import java.util.ArrayList;

/**
 *
 * @author roger
 */
public class RelatorioDalOrdenadoPorEnfase extends RelatorioDal {

    public RelatorioDalOrdenadoPorEnfase(String nome) {
        super(nome);
    }

    @Override
    public boolean ePrimeiro(Relatorio aluno1, Relatorio aluno2) throws Exception {
        if (aluno1.getEnfase().compareToIgnoreCase(aluno2.getEnfase()) <= 0) {
            return true;
        } else {
            return false;
        }
    }
}
