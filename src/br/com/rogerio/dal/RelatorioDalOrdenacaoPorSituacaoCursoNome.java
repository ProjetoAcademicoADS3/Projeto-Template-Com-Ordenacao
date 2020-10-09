package br.com.rogerio.dal;

import br.com.rogerio.modelo.Relatorio;

/**
 *
 * @author roger
 */
public class RelatorioDalOrdenacaoPorSituacaoCursoNome extends RelatorioDal {

    public RelatorioDalOrdenacaoPorSituacaoCursoNome(String nome) {
        super(nome);
    }

    @Override
    public boolean ePrimeiro(Relatorio aluno1, Relatorio aluno2) throws Exception {

        if (aluno1.getSituacao().equalsIgnoreCase(aluno2.getSituacao())) {
            if (aluno1.getCurso().equalsIgnoreCase(aluno2.getCurso())) {
                return aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) <= 0;
            } else {
                return aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) <= 0;
            }
        } else {
            return aluno1.getSituacao().compareToIgnoreCase(aluno2.getSituacao()) <= 0;
        }

    }

}
