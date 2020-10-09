package br.com.rogerio.dal;

import br.com.rogerio.modelo.Relatorio;
import java.util.ArrayList;

/**
 *
 * @author roger
 */
public class RelatorioDalOrdenacaoPorCursoEnome extends RelatorioDal {

    public RelatorioDalOrdenacaoPorCursoEnome(String nome) {
        super(nome);
    }

    @Override
    public boolean ePrimeiro(Relatorio aluno1, Relatorio aluno2) throws Exception {
        if (aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) <= 0
                && aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) <= 0) {
            return true;
        } else {
            return false;
        }
    }
}
