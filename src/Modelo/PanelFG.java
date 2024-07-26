package Modelo;

import static Ejecuciones.Main.Aleatorio;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JPanel;

public class PanelFG extends JPanel implements KeyListener {
    ArrayList<Dibujable> v;
    ArrayList<RectanguloGrafico> ast = new ArrayList<>();
    NaveGrafico nave;
    Coordenada movimientoIzq = new Coordenada(-25, 0);
    Coordenada movimientoDer = new Coordenada(25, 0);

    int ContadorAsteroides = 5;
    TextoGrafico puntos;
    TextoGrafico vidas;
    TextoGrafico Final;

    public PanelFG(ArrayList<Dibujable> vectorde0) {
        this.v = vectorde0;
        this.addKeyListener(this);
        setFocusable(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Borra el contenido anterior
        for (Dibujable dib : v) {
            dib.dibujar(g); // Dibuja todos los objetos
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int tecla = e.getExtendedKeyCode();

        if (tecla == KeyEvent.VK_LEFT) {
            nave.mover(movimientoIzq);
        } else if (tecla == KeyEvent.VK_RIGHT) {
            nave.mover(movimientoDer);
        } else if (tecla == KeyEvent.VK_Q) {
            CirculoGrafico bala = nave.Bala();
            nave.balas.add(bala);
            v.add(bala);
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    public void refNave(NaveGrafico n) {
        this.nave = n;
    }

    public void refAst(RectanguloGrafico a, RectanguloGrafico b, RectanguloGrafico c, RectanguloGrafico d, RectanguloGrafico e) {
        ast.add(a);
        ast.add(b);
        ast.add(c);
        ast.add(d);
        ast.add(e);
    }

    public void RefPuntos(TextoGrafico a) {
        this.puntos = a;
    }

    public void Refvida(TextoGrafico b) {
        this.vidas = b;
    }

    public void RefFinal(TextoGrafico c) {
        this.Final = c;
    }
    
    public void Colision() {
        int i;
        for (i = 0; i < nave.balas.size(); i++) {
            CirculoGrafico bala = (CirculoGrafico) nave.balas.get(i);
            for (int j = 0; j < ast.size(); j++) {
                RectanguloGrafico aste = (RectanguloGrafico) ast.get(j);

                Coordenada Corbala = new Coordenada(bala.getX(), bala.getY());
                Coordenada Derecha = new Coordenada(aste.getX() + 30, aste.getY());
                Coordenada Izquierda = new Coordenada(aste.getX() - 15, aste.getY());
                Coordenada Medio = new Coordenada(aste.getX(), aste.getY());

                if (Corbala.getX() > Izquierda.getX() && Corbala.getX() < Derecha.getX()
                        && Corbala.getY() < Medio.getY()) {
                    aste.setColor(Color.WHITE);
                    bala.setColor(Color.WHITE);
                    bala.setY(-100);
                    aste.setY(-10);
                    nave.balas.remove(bala);
                    ast.remove(aste);
                    ContadorAsteroides--;

                    int puntosActuales = Integer.parseInt(puntos.s);
                    puntos.s = String.valueOf(puntosActuales + 1);
                }
            }
        }
    }

    public void iniciar() {
        Thread gameThread = new Thread(() -> {
            while (true) {
                try {
                    if (!nave.balas.isEmpty()) {
                        nave.Ciclo();
                    }
                    for (RectanguloGrafico rect : ast) {
                        rect.Ciclo();

                        if (rect.getY() > 525) {
                            int rango = Aleatorio(800, 50);
                            rect.setY(0);
                            rect.setX(rango);
                        }
                    }
                    if (ContadorAsteroides < 5) {
                        int rango = Aleatorio(800, 50);
                        Coordenada Inicio = new Coordenada(rango, 0);
                        RectanguloGrafico nuevo = new RectanguloGrafico(Inicio, 25, 25, Color.RED);
                        ast.add(nuevo);
                        v.add(nuevo); // Añadir el nuevo asteroide a la lista de objetos dibujables
                        ContadorAsteroides++;
                    }
                    Colision();
                    Thread.sleep(50);
                } catch (InterruptedException err) {
                    System.out.println(err);
                }
                repaint();
            }
        });
        gameThread.start();
    }
}
