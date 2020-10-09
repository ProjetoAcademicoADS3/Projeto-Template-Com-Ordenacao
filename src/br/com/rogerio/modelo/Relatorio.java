package br.com.rogerio.modelo;

/**
 *
 * @author roger
 */
public class Relatorio {
    
    private String nome;
    private String curso;
    private String situacao;
    private String enfase;

    public Relatorio() {
    }

    public Relatorio(String nome, String curso, String situacao, String enfase) {
        this.nome = nome;
        this.curso = curso;
        this.situacao = situacao;
        this.enfase = enfase;
    }
    
    public Relatorio (String dados){
        String []vetor = dados.split(";");
        this.nome = vetor[0];
        this.curso = (vetor[1]);
        this.situacao = vetor[2];
        this.enfase = vetor[3];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getEnfase() {
        return enfase;
    }

    public void setEnfase(String enfase) {
        this.enfase = enfase;
    }

    @Override
    public String toString() {
        return "Relatorio{" + "nome=" + nome + ", curso=" + curso + ", situacao=" + situacao + ", enfase=" + enfase + '}';
    }
    
    
    
}
