package estudiantes;

import javax.swing.JOptionPane;

public class Materia {

    private int Semestre;

    public Materia(int Semestre) {
        this.Semestre = Semestre;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void MuestraMaterias() {
        if (this.getSemestre() == 1) {
            JOptionPane.showMessageDialog(null, "1.Introducción a la ingenieria\n"
                    + "2.Álgebra Lineal\n"
                    + "3.Cálculo Diferencial \n"
                    + "4.Segundo Idioma I\n"
                    + "5.Filosofía Institucional\n"
                    + "6. Cátedra Henri Didón");
        }
        if (this.getSemestre() == 2) {
            JOptionPane.showMessageDialog(null, "1.Cálculo Integral\n"
                    + "2.Lógica de programación\n"
                    + "3.Circuitos y Electrónica I\n"
                    + "4.Taller Lecto-Escritura\n"
                    + "5.Segundo Idioma II\n"
                    + "6. Antropología");
        }
        if (this.getSemestre() == 3) {
            JOptionPane.showMessageDialog(null, "1.Cálculo Vectorial\n"
                    + "2.Física Mecánica\n"
                    + "3.Ecuaciones Diferenciales\n"
                    + "4.Programación Orientada a Objetos\n"
                    + "5.Circuitos y Electrónica II\n"
                    + "6. Segundo Idioma III");
        }
        if (this.getSemestre() == 4) {
            JOptionPane.showMessageDialog(null, "1.Señales y sistemas\n"
                    + "2.Electricidad y Magnetismo\n"
                    + "3.Programación Aplicada\n"
                    + "4.Electrónica Aplicada\n"
                    + "5.Sistemas Digitales\n"
                    + "6. Segundo Idioma IV");
        }
        if (this.getSemestre() == 5) {
            JOptionPane.showMessageDialog(null, "1.Campos y ondas electromagnéticas\n"
                    + "2.Fundamentos de Teletráfico\n"
                    + "3.Sistemas de Telecomunicaciones I\n"
                    + "4.Procesamiento Digital de Señales\n"
                    + "5.Sistemas Digitales Aplicados\n"
                    + "6. Metodologia de la Investigación\n"
                    + "7.Segundo Idioma V");
        }
        if (this.getSemestre() == 6) {
            JOptionPane.showMessageDialog(null, "1.Medios de transmisión\n"
                    + "2.Sistemas de Telecomunicaciones II\n"
                    + "3.Telemática I\n"
                    + "4.Sistemas Operativos\n"
                    + "5.Administración de Proyectos de Ingeniería\n"
                    + "6.Segundo Idioma VI\n"
                    + "7.Epistemología");
        }
        if (this.getSemestre() == 7) {
            JOptionPane.showMessageDialog(null, "1.Antenas y Propagación\n"
                    + "2.Comunicaciones Ópticas\n"
                    + "3.Telemática II\n"
                    + "4.Electiva I\n"
                    + "5.Gestión de proyectos\n"
                    + "6. Cátedra\n"
                    + "7.Cultura Teológica");
        }
        if (this.getSemestre() == 8) {
            JOptionPane.showMessageDialog(null, "1.Regulación en TIC's\n"
                    + "2.Redes Ópticas\n"
                    + "3.Redes Convergentes\n"
                    + "4.Electiva AI\n"
                    + "5.Electiva BI\n"
                    + "6.Filosofía Política");
        }
        if (this.getSemestre() == 9) {
            JOptionPane.showMessageDialog(null, "1.Sistema de Comunicaciones Moviles\n"
                    + "2.Servicios Telemáticos\n"
                    + "3.Electiva AII\n"
                    + "4.Electiva BII\n"
                    + "5.Electiva II\n"
                    + "6.Ética");
        }
        if (this.getSemestre() == 10) {
            JOptionPane.showMessageDialog(null, "1.Seminario de Actualización\n"
                    + "2.Opción de grado\n");
        }
    }

    public void DisponibilidadMaterias() {
        if (this.getSemestre() == 1) {
            JOptionPane.showMessageDialog(null, "1.Introducción a la ingenieria\n"
                    + "2. Cátedra Henri Didón");
        }
        if (this.getSemestre() == 2) {
            JOptionPane.showMessageDialog(null, "1.Circuitos y Electrónica I\n");
        }
        if (this.getSemestre() == 3) {
            JOptionPane.showMessageDialog(null, "1.Física Mecánica\n"
                    + "2.Circuitos y Electrónica II\n");
        }
        if (this.getSemestre() == 4) {
            JOptionPane.showMessageDialog(null, "1.Electrónica Aplicada\n"
                    + "2.Sistemas Digitales\n");
        }
        if (this.getSemestre() == 5) {
            JOptionPane.showMessageDialog(null, "1.Sistemas de Telecomunicaciones I\n"
                    + "2.Procesamiento Digital de Señales\n"
                    + "3.Sistemas Digitales Aplicados\n");
        }
        if (this.getSemestre() == 6) {
            JOptionPane.showMessageDialog(null, "1.Telemática I\n");
        }
        if (this.getSemestre() == 7) {
            JOptionPane.showMessageDialog(null, "1.Antenas y Propagación\n"
                    + "2.Comunicaciones Ópticas\n"
                    + "3.Telemática II\n");
        }
        if (this.getSemestre() == 8) {
            JOptionPane.showMessageDialog(null, "1.Redes Ópticas\n"
                    + "2.Redes Convergentes\n");
        }
        if (this.getSemestre() == 9) {
            JOptionPane.showMessageDialog(null, "1.Sistema de Comunicaciones Moviles\n"
                    + "2.Servicios Telemáticos\n");
        }
        if (this.getSemestre() == 10) {
            JOptionPane.showMessageDialog(null, "1.Opción de grado\n");
        }
    }
}
