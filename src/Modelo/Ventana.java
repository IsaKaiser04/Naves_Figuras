package Modelo;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;



public class Ventana extends JFrame implements WindowListener{
  
    public Ventana (String title){
        super(title);
        setSize(500,500);
        addWindowListener(this);
        setBackground(Color.white);
    }

    @Override
    public void windowOpened(WindowEvent we){System.exit(0);} {
    }

    @Override
    public void windowClosing(WindowEvent we) {
    }

    @Override
    public void windowClosed(WindowEvent we) {
    }

    @Override
    public void windowIconified(WindowEvent we) {
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
    }

    @Override
    public void windowActivated(WindowEvent we) {
    }

    @Override
    public void windowDeactivated(WindowEvent we) {}


}
