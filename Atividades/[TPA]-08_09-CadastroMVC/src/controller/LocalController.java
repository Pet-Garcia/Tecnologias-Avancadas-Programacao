package controller;

import model.Local;

public class LocalController {
    
    public boolean efetuaGravacao(String nomelocal, String localpai, String tipo, String descricao) {
        
       Local l = new Local();
       
       l.setNomelocal(nomelocal);
       l.setLocalpai(localpai);
       l.setTipo(tipo);
       l.setDescricao(descricao);
       
       return l.gravar();
    }
    
    
}
