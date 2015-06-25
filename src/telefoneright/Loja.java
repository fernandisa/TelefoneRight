package telefoneright;


import java.util.ArrayList;
import java.util.List;


public class Loja {
    
    private List<Telefones1> velhos;
    private List<Celular> celulares;

    public List<Telefones1> getVelhos() {
        return velhos;
    }

    public void setVelhos(List<Telefones1> velhos) {
        this.velhos = velhos;
    }

    public List<Celular> getCelulares() {
        return celulares;
    }

    public void setCelulares(List<Celular> celulares) {
        this.celulares = celulares;
    }
    
    
    
    public Loja ()
    {
        
        velhos = new ArrayList<Telefones1>();
        celulares = new ArrayList<Celular>();
    }
    
    public void catalogarTelefones ()
    {
        
        Telefones1 t = new Telefones1 ();
        t.setCor("Camarinho");
        t.setModelo("Gran Phone");
        t.setPeso(3.2);
        velhos.add(t);
        t = new Telefones1 ();
        t.setCor("Branco");
        t.setModelo("Velhao");
        t.setPeso(3.1);
        velhos.add(t);
        t = new Telefones1 ();
        t.setCor("Vermelho");
        t.setModelo("GTA");
        t.setPeso(3.1);
        velhos.add(t);
        t = new Telefones1 ();
        t.setCor("Azul");
        t.setModelo("Gremio");
        t.setPeso(3.1);
        velhos.add(t);

    }
    
    public void catalogarCelulares ()
    {
        Celular c = new Celular ();
       
        c.setCor("Verde");
        c.setModelo("Nokia 123");
        c.setDespertador(true);
        c.setMsgdetexto(true);
        c.setPeso(1.2);
        celulares.add(c);
        c = new Celular ();
        c.setCor("Prata");
        c.setModelo("LG");
        c.setDespertador(true);
        c.setMsgdetexto(true);
        c.setPeso(1.2);
        celulares.add(c);
        c = new Celular ();
        c.setCor("Rosa");
        c.setModelo("Motorola");
        c.setDespertador(true);
        c.setMsgdetexto(true);
        c.setPeso(1.2);
        celulares.add(c);
    }
    
    public Celular buscarModelo (String modelo)
    {
        Celular achei = null;
        for (Celular celular : celulares)
        {
            if (modelo.equals(celular.getTelefone().getModelo()))
            {
                // se achou joga na variável achei
                achei = celular;
                break;
            }
            
            
        }
   return achei;
    }




}