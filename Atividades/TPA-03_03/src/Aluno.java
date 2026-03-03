public class Aluno {
    // atributos
    String nome;
    String dataNascimento;
    String cpf;
    String ra;
    
    
    // métodos --cad(argumentos servem para se comunicar entre classes)//pegar variaveis de outras classes
    public void cadastrar(String n, String d, String c, String r){
        nome = n;
        dataNascimento = d;
        cpf = c;
        ra = r;
    }
}
