
package exemplo;

// O nome da classe e do construtor deve ser o mesmo

import javax.swing.JOptionPane;

public class ExemploConstrutor {

    // Só declara a variavel fora do construtor
    private int num;

    // Exemplo de construtor vazio criado de forma padrão: Classe obj = new Classe();
    
    // Construtor igual o nome da classe
    // Método obrigatório, vai ser criado sempre
    public ExemploConstrutor(){
        // Inicializa a variavel no construtor
        num = 0;
        
        JOptionPane.showMessageDialog(null, "Passou neste construtor");
    }
    
    // Pode ter mais de um construtor definido no codigo, porem apenas um vai ser executado
    // O que define qual construtor vai ser executado é os argumentos
    public ExemploConstrutor(int n){
        num = n;
        JOptionPane.showMessageDialog(null, "Passou neste outro construtor");
    }
    
    // Main criado dentro de uma classe
    public static void main(String[] args){
        // Nesses exemplos está a forma com que os construtores são definidos
        // ExemploConstrutor c = new ExemploConstrutor(); 1° construtor
        // ExemploConstrutor c = new ExemploConstrutor(200); 2° construtor
        ExemploConstrutor c = new ExemploConstrutor(200);
    }
}
