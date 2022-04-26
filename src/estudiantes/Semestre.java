package estudiantes;

import javax.swing.JOptionPane;

public class Semestre {

    private int NSemestre;

    public Semestre() {
        NSemestre = 0;
    }

    public int getNSemestre() {
        return NSemestre;
    }

    public void setNSemestre(int NSemestre) {
        this.NSemestre = NSemestre;
    }

    public void PedirSemestre() {
        this.setNSemestre(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su semestre: ")));
    }
}
