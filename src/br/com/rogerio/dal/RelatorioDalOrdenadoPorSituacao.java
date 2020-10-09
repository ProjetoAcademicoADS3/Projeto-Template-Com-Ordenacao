package br.com.rogerio.dal;

import br.com.rogerio.modelo.Relatorio;
import java.util.ArrayList;

/**
 *
 * @author roger
 */
public class RelatorioDalOrdenadoPorSituacao extends RelatorioDal {

    String nomeDoArquivo;

    public RelatorioDalOrdenadoPorSituacao(String nome) {
        super(nome);
    }

    @Override
    public boolean ePrimeiro(Relatorio aluno1, Relatorio aluno2) throws Exception {
        if (aluno1.getSituacao().compareToIgnoreCase(aluno2.getSituacao()) <= 0) {
            return true;
        } else {
            return false;
        }
    }
}
