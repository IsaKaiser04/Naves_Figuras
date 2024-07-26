package Ejecuciones;

import javax.swing.*;
import Modelo.*;
import java.awt.Color;
import java.util.ArrayList;

public class Main {
    public static int Aleatorio(int Max, int Min) {
        return (int) (Math.random() * (Max - Min));
    }

    public static void main(String[] args) {
        JFrame nuestraventana = new JFrame("Juego de naves");

        // nuestraventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ArrayList<Dibujable> ArregloDeObjetos = new ArrayList<>();
        //Coordenada cor1 = new Coordenada(250,250);
        //Coordenada cor2 = new Coordenada(500,300);
        // nave diseño
        Coordenada cor3 = new Coordenada(475, 500);
        Coordenada cor4 = new Coordenada(425, 575);
        Coordenada cor5 = new Coordenada(525, 575);

        NaveGrafico nave = new NaveGrafico(cor3, cor4, cor5, Color.black);

        //RectanguloGrafico rectangulo = new RectanguloGrafico(cor1, 50,30,Color.blue);
        //CirculoGrafico circulo = new CirculoGrafico(cor2,50,Color.cyan);

        //ArregloDeObjetos.add(rectangulo);
        //ArregloDeObjetos.add(circulo);
        TextoGrafico Vidas = new TextoGrafico("Vidas", Color.BLACK, 850, 50);
        Vidas.setSize(35);
        ArregloDeObjetos.add(Vidas);

        TextoGrafico Score = new TextoGrafico("Puntaje", Color.BLACK, 850, 250);
        Score.setSize(35);
        ArregloDeObjetos.add(Score);

        TextoGrafico Puntaje = new TextoGrafico("0", Color.RED, 850, 300);
        Puntaje.setSize(40);
        ArregloDeObjetos.add(Puntaje);

        TextoGrafico NroVidas = new TextoGrafico("3", Color.RED, 850, 150);
        NroVidas.setSize(40);
        ArregloDeObjetos.add(NroVidas);

        TextoGrafico textofinal = new TextoGrafico("FINAL ADD", Color.RED, 450, 250);
        textofinal.setSize(100);

        int rango1 = Aleatorio(800, 50);
        Coordenada Salida1 = new Coordenada(rango1, 0);
        RectanguloGrafico Asteroide1 = new RectanguloGrafico(Salida1, 25, 25, Color.blue);
        int rango2 = Aleatorio(800, 50);
        Coordenada Salida2 = new Coordenada(rango2, 0);
        RectanguloGrafico Asteroide2 = new RectanguloGrafico(Salida2, 25, 25, Color.yellow);
        int rango3 = Aleatorio(800, 50);
        Coordenada Salida3 = new Coordenada(rango3, 0);
        RectanguloGrafico Asteroide3 = new RectanguloGrafico(Salida3, 25, 25, Color.pink);
        int rango4 = Aleatorio(800, 50);
        Coordenada Salida4 = new Coordenada(rango4, 0);
        RectanguloGrafico Asteroide4 = new RectanguloGrafico(Salida4, 25, 25, Color.green);
        int rango5 = Aleatorio(800, 50);
        Coordenada Salida5 = new Coordenada(rango5, 0);
        RectanguloGrafico Asteroide5 = new RectanguloGrafico(Salida5, 25, 25, Color.darkGray);
        ArregloDeObjetos.add(Asteroide1);
        ArregloDeObjetos.add(Asteroide2);
        ArregloDeObjetos.add(Asteroide3);
        ArregloDeObjetos.add(Asteroide4);
        ArregloDeObjetos.add(Asteroide5);

        ArregloDeObjetos.add(nave);

        PanelFG nuestroPanel = new PanelFG(ArregloDeObjetos);

        nuestroPanel.refNave(nave);
        nuestroPanel.refAst(Asteroide1, Asteroide2, Asteroide3, Asteroide4, Asteroide5);
        nuestroPanel.RefPuntos(Puntaje);
        nuestroPanel.Refvida(NroVidas);
        nuestroPanel.RefFinal(textofinal);

        nuestraventana.add(nuestroPanel);
        nuestraventana.setSize(1000, 600);
        nuestraventana.setVisible(true);
        nuestroPanel.iniciar();
    }
}
