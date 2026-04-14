
package Loja_ex8;

public class Empregado extends Pessoa{
    private double salario;
    private String matricula;
    
    public void setSalario(double sl){
        this.salario = sl;
    }
    public double getSalario(){
        return salario;
    }
    
    public void setMatricula(String m){
        this.matricula = m;
    }
    public String getMatricula(){
        return matricula;
    }
    
}
