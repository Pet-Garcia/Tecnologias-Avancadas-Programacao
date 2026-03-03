
import javax.swing.JOptionPane;

// shift + f6 executa o código em que está

public class Principal {
    public static void main(String args[])/*argumentos; args[], ... tudo antes do [] são variaveis; []args, ... tudo depois do [] são vetores */{
        
        Aluno a = new Aluno(); // Aluno se torna um tipo, semelhante ao tipo int; significa que é mecessário ter um nome Aluno a.nome = "zé";
                 // o nome a se torna um objeto; = new Aluno() está instanciando o objeto para tornar ele existente
                 
        String nome, data, cpf, ra;
/*
        nome = "Zé";
        data = "10/03/2006";
        cpf = "49323833";
        ra = "25532";
*/

        nome = JOptionPane.showInputDialog("Digite o nome");
        data = JOptionPane.showInputDialog("Digite a data de nascimento");
        cpf = JOptionPane.showInputDialog("Digite o cpf");
        ra = JOptionPane.showInputDialog("Digite o ra");
        
        a.cadastrar(nome, data, cpf, ra);
        
    }
}
