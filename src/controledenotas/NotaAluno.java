package controledenotas;

import java.util.List;

public class NotaAluno {

    private Materia materia;

    private List<Double> notas;

    public NotaAluno() {
    }

    public NotaAluno(Materia materia, List<Double> notas) {
        this.materia = materia;
        this.notas = notas;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "NotaAluno{" +
                "materia=" + materia +
                ", notas=" + notas +
                '}';
    }
}
