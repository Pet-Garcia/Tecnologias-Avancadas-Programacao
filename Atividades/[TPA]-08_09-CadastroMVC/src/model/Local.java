package model;

public class Local {
    
    private String nomelocal;
    private String localpai;
    private String tipo;
    private String descricao;
    
    public void setNomelocal(String nl) {
        this.nomelocal = nl;
    }
    public String getNomelocal() {
        return this.nomelocal;
    }

    public void setLocalpai(String lp) {
        this.localpai = lp;
    }
    public String getLocalpai() {
        return this.localpai;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }
    public String getTipo() {
        return this.tipo;
    }

    public void setDescricao(String d) {
        this.descricao = d;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public boolean gravar(){
        return true;
    }
    
    
}
