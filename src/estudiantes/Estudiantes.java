package estudiantes;

import javax.swing.JOptionPane;

public class Estudiantes {

    private String Nombre;
    private int Edad;
    private int ID;//codigo carné
    private Semestre ObjSemestre;

    public Estudiantes() {
        Nombre = " ";
        Edad = 0;
        ID = 0;
        ObjSemestre = new Semestre();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void PedirNombre() {
        this.setNombre(JOptionPane.showInputDialog("Ingrese su nombre: "));
    }

    public void PedirEdad() {
        this.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: ")));
    }

    public void PedirID() {
        this.setID(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ID: ")));
    }

    public void Proceso() {
        int Opc = 0;
        boolean Control = true;
        JOptionPane.showMessageDialog(null, "Bienvenido a USTA alternancia ");
        while (Control) {
            while (Opc <= 0 || Opc > 3) {
                Opc = Integer.parseInt(JOptionPane.showInputDialog("Digite su opción:\n "
                        + "1. Visualizar materias por semestre\n 2.Visualizar materias disponibles para la alternancia\n 3. Salir"));
            }
            if (Opc == 1) {
                this.ObjSemestre.PedirSemestre();
                Materia ObjMateria = new Materia(this.ObjSemestre.getNSemestre());
                ObjMateria.MuestraMaterias();
            }
            if (Opc == 2) {
                this.ObjSemestre.PedirSemestre();
                Materia ObjMateria = new Materia(this.ObjSemestre.getNSemestre());
                ObjMateria.DisponibilidadMaterias();
            }
            if (Opc == 3) {
                JOptionPane.showMessageDialog(null, "Gracias por su visita :)");
                Control = false;
            }
            Opc = 0;
        }
    }
}
