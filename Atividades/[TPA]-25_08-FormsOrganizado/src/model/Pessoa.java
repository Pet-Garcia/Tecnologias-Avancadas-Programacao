package model;


public class Pessoa {
    private String nome;
    private int idade;
    
    public void setNome(String n) {
        this.nome = n;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setIdade(int i) {
        this.idade = i;
    }
    public int getIdade() {
        return this.idade;
    }
    
    public boolean gravar() {
        return true; // exemplo de tudo deu certo e os dados foram cadastrados no banco. Seria o que está no botão no 18_08-GravaçãoemBD
    }
}
