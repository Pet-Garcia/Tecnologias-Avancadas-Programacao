
package Associacao;


public class Principal {

    public static void main(String[] args) {
        Endereco e = new Endereco();
        e.setLogradouro("Rua 1");
        e.setNum("2");
        e.setBairro("Fatima");
        
        Cliente c = new Cliente();
        c.setNome("Zefa");
        c.setEndereco(e);
        
        System.out.println(c.getNome() + "\n"
            + c.getEndereco().getLogradouro()); // c.getEndereco().getLogradouro() para pegar o logradouro do endereco que está guardado no e que está guardado no c
    }
    
}
