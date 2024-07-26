package Modelo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class TextoGrafico implements Dibujable {
    String s;
    Color color;
    int anchoV;
    int altoV;
    int size;

    public TextoGrafico(String texto, Color uncolor, int a, int b) {
        this.s = texto;
        this.color = uncolor;
        this.size = 10;
        this.anchoV = a;
        this.altoV = b;
    }

    public void setTexto(String nuevoTexto) {
        this.s = nuevoTexto;
    }

    public void BorrarTexto(Graphics g, String txt) {
        g.setColor(Color.WHITE);
        g.setFont(new Font("Algerian", Font.PLAIN, this.getSize()));
        int ancho = (int) g.getFontMetrics().getStringBounds(txt, g).getWidth();
        int alto = (int) g.getFontMetrics().getAscent();
        int x = this.anchoV - ancho / 2;
        int y = this.altoV + alto / 4;
        g.drawString(txt, x, y);
    }

    public void PintarTexto(Graphics g, String txt) {
        g.setColor(Color.RED);
        g.setFont(new Font("Algerian", Font.PLAIN, this.getSize()));
        int ancho = (int) g.getFontMetrics().getStringBounds(txt, g).getWidth();
        int alto = (int) g.getFontMetrics().getAscent();
        int x = this.anchoV - ancho / 2;
        int y = this.altoV + alto / 4;
        g.drawString(txt, x, y);
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.setFont(new Font("Monospaced", Font.PLAIN, this.getSize()));
        int ancho = (int) g.getFontMetrics().getStringBounds(s, g).getWidth();
        int alto = (int) g.getFontMetrics().getAscent();
        int x = this.anchoV - ancho / 2;
        int y = this.altoV + alto / 4;
        g.drawString(s, x, y);
    }

    public void setSize(int nuevoSize) {
        size = nuevoSize;
    }

    public int getSize() {
        return size;
    }
}
