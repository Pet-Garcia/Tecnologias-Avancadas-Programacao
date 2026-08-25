package controller;

// Classe que recebe de Tela(View) e envia para Pessoa(model)

// Importando do pacote modelo a classe Pessoa
import model.Pessoa;

public class PessoaController {
    
    public boolean efetuaGravacao(String nome, int idade) {
        
        // Instancia o modelo Pessoa e envia para ela os dados atraves dos métodos
        Pessoa p = new Pessoa();
        p.setNome(nome);
        p.setIdade(idade);
        return p.gravar(); // Está retornando se foi aceito ou não
        
    }
    
    
}
