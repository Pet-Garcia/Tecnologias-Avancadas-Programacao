package tap.pkg10.pkg03_veiculo;

public class Veiculo {
    private String marca;
    
    // o (String m) é para definir um argumento, significa q ao chamar o setmarca tem q passar uma string junto
    public void setMarca(String m){
        marca = m;
    }
    
    public String getMarca(){
        return marca;
    }
}
