package br.com.rogerio.dal;

import br.com.rogerio.modelo.Relatorio;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author roger
 */
public abstract class RelatorioDal {

    private String nomeDoArquivo;

    public RelatorioDal(String nome) {
        this.nomeDoArquivo = nome;
    }

    public abstract boolean ePrimeiro (Relatorio aluno1, Relatorio aluno2) throws Exception;

    public final ArrayList<Relatorio> listarRelatorio() throws Exception {

        try {
            ArrayList<Relatorio> lista = new ArrayList<Relatorio>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            int pos = 0;

            while ((linha = br.readLine()) != null) {
                Relatorio aux = new Relatorio(linha);
                lista.add(aux);
                pos++;
            }

            br.close();

            for (int i = 0; i < lista.size(); i++) {
                for (int j = i; j < lista.size(); j++) {
                    if (!ePrimeiro(lista.get(i), lista.get(j))) {
                        Relatorio temp = lista.get(j);
                        lista.set(j, lista.get(i));
                        lista.set(i, temp);
                    }
                }
            }
            return lista;
        } catch (Exception erro) {
            throw new Exception("Erro ao recuperar os dados do relatório do arquivo\n" + erro.getMessage());
        }
    }
}
