package br.com.rogerio.dal;

import br.com.rogerio.modelo.Relatorio;
import java.util.ArrayList;

/**
 *
 * @author roger
 */
public class RelatorioDalOrdenadoPorCurso extends RelatorioDal {

    private String nomeDoArquivo;

    public RelatorioDalOrdenadoPorCurso(String nome) throws Exception {
        super(nome);
    }

    @Override
    public boolean ePrimeiro(Relatorio aluno1, Relatorio aluno2) throws Exception {
        if (aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) <= 0) {
            return true;
        } else {
            return false;
        }

    }
}
