
package Loja_ex8;

import javax.swing.JOptionPane;

public class CadastrarUsuarios {

    // Resultado do teste de dois construtores = ambos são acionados
    public static void main(String[] args) {
        int opcao;
        String idade;
        String salario;
        String resultado;
        
        String opcaotemp = JOptionPane.showInputDialog("Insira o codigo da opcao que deseja cadastrar:\n"
                + "1 - Cliente\n"
                + "2 - Gerente\n"
                + "3 - Vendedor\n");
        
        if(opcaotemp != null || !opcaotemp.isEmpty()){
            opcao = Integer.parseInt(opcaotemp);
            switch(opcao){
                case 1:
                    Cliente c = new Cliente();
                    
                    //Inserindo os dados
                    //Nome
                    c.setNome(JOptionPane.showInputDialog("Digite o nome:"));
        
                    //Idade
                    idade = JOptionPane.showInputDialog("Digite a idade:");
                    c.setIdade(Integer.parseInt(idade)); //Conversor

                    //Sexo
                    c.setSexo(JOptionPane.showInputDialog("Digite o sexo:"));

                    //Divida
                    String divida = JOptionPane.showInputDialog("Digite o valor da dívida:");
                    c.setValordivida(Double.parseDouble(divida)); //Conversor

                    //Data de Nascimento
                    String data = JOptionPane.showInputDialog("Digite a data de nascimento:");
                    c.setDtnascimento(Integer.parseInt(data)); //Conversor
                    
                    //Exibindo os dados
                    resultado = "---Cliente---\n"
                        + "Nome: " + c.getNome() + "\n"
                        + "Idade: " + c.getIdade() + "\n"
                        + "Sexo: " + c.getSexo() + "\n"
                        + "Dívida: R$ " + c.getValordivida() + "\n"
                        + "Data de Nascimento: " + c.getDtnascimento();

                    JOptionPane.showMessageDialog(null, resultado);
                    break;
                    
                case 2:
                    Gerente g = new Gerente();

                    // Inseridos os Dados
                    // Nome
                    g.setNome(JOptionPane.showInputDialog("Digite o nome:"));

                    // Idade
                    idade = JOptionPane.showInputDialog("Digite a idade:");
                    g.setIdade(Integer.parseInt(idade)); // Conversor

                    // Sexo
                    g.setSexo(JOptionPane.showInputDialog("Digite o sexo:"));

                    // Salario
                    salario = JOptionPane.showInputDialog("Digite o salário:");
                    g.setSalario(Double.parseDouble(salario));

                    // Matricula
                    g.setMatricula(JOptionPane.showInputDialog("Digite a matrícula:"));

                    // Nome Gerencia
                    g.setNomegerencia(JOptionPane.showInputDialog("Digite o nome da gerência:"));

                    // Exibindo os dados
                    resultado = "---Gerente---\n"
                            + "Nome: " + g.getNome() + "\n"
                            + "Idade: " + g.getIdade() + "\n"
                            + "Sexo: " + g.getSexo() + "\n"
                            + "Salário: R$ " + g.getSalario() + "\n"
                            + "Matrícula: " + g.getMatricula() + "\n"
                            + "Gerência: " + g.getNomegerencia();

                    JOptionPane.showMessageDialog(null, resultado);
                    break;
                    
                case 3:
                    Vendedor v = new Vendedor();

                    // Inseridos os Dados
                    // Nome
                    v.setNome(JOptionPane.showInputDialog("Digite o nome:"));

                    // Idade
                    idade = JOptionPane.showInputDialog("Digite a idade:");
                    v.setIdade(Integer.parseInt(idade)); // Conversor

                    // Sexo
                    v.setSexo(JOptionPane.showInputDialog("Digite o sexo:"));

                    // Salario
                    salario = JOptionPane.showInputDialog("Digite o salário:");
                    v.setSalario(Double.parseDouble(salario));

                    // Matricula
                    v.setMatricula(JOptionPane.showInputDialog("Digite a matrícula:"));
                    
                    // Valor das Vendas
                    String valorVendas = JOptionPane.showInputDialog("Digite o valor das vendas:");
                    v.setValorvendas(Double.parseDouble(valorVendas)); // Conversão

                    // Quantidade de Vendas
                    String qtdVendas = JOptionPane.showInputDialog("Digite a quantidade de vendas:");
                    v.setQtdvendas(Integer.parseInt(qtdVendas)); // Conversor

                    // 3. Exibindo os dados formatados
                    resultado = "---Vendedor---\n"
                            + "Nome: " + v.getNome() + "\n"
                            + "Idade: " + v.getIdade() + "\n"
                            + "Sexo: " + v.getSexo() + "\n"
                            + "Salário: R$ " + v.getSalario() + "\n"
                            + "Matrícula: " + v.getMatricula() + "\n"
                            + "Valor das Vendas: R$ " + v.getValorvendas() + "\n"
                            + "Qtd de Vendas: " + v.getQtdvendas();

                    JOptionPane.showMessageDialog(null, resultado);
                    
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida!");
                    break;
            }
       
        } else{
            JOptionPane.showMessageDialog(null, "Opcao invalida!");
        }
        
        
    }
    
}
