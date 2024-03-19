import java.time.LocalDate;

public class Curso {
    private int codigoCurso;
    private String nomeCurso;
    private LocalDate dataInicioCurso;

    public Curso(int codigoCurso, String nomeCurso, LocalDate dataInicioCurso) {
        this.codigoCurso = codigoCurso;
        this.nomeCurso = nomeCurso;
        this.dataInicioCurso = dataInicioCurso;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public LocalDate getDataInicioCurso() {
        return dataInicioCurso;
    }

    public void setDataInicioCurso(LocalDate dataInicioCurso) {
        this.dataInicioCurso = dataInicioCurso;
    }
}
