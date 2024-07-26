package Modelo;

import java.util.ArrayList;

public class Nave extends Coordenada {
    public Coordenada cor1 = new Coordenada();
    public Coordenada cor2 = new Coordenada();
    ArrayList balas = new ArrayList();
    
    public Nave(){
        super();
        this.cor1.setX(0);
        this.cor1.setY(0);
        this.cor2.setX(0);
        this.cor2.setY(0);
    }

    public Nave(Coordenada a, Coordenada b, Coordenada c){
        super(a.getX(), a.getY());
        this.cor1 = new Coordenada(b);
        this.cor2 = new Coordenada(c);
    }

    public Nave(Nave c){
        super(c.getX(), c.getY());
        this.cor1 = new Coordenada(c.cor1);
        this.cor2 = new Coordenada(c.cor2);
    }

    public void setVertice(Coordenada nva, int lado){
        if(lado == 1){
            this.setX(nva.getX());
            this.setY(nva.getY());
        } else if(lado == 2){
            this.cor1.setX(nva.getX());
            this.cor1.setY(nva.getY());
        } else if(lado == 3){
            this.cor2.setX(nva.getX());
            this.cor2.setY(nva.getY());
        }
    }

    public void mover(Coordenada NvaCor){
        setVertice(this.Suma(NvaCor), 1);
        setVertice(this.cor1.Suma(NvaCor), 2);
        setVertice(this.cor2.Suma(NvaCor), 3);
    }

}
