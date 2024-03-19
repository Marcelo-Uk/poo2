import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("\nCadastro de Curso:");
        System.out.print("Digite o código do curso: ");
        int codigoCurso = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome do curso: ");
        String nomeCurso = scanner.nextLine();
        System.out.print("Digite a data de início do curso (DD/MM/AAAA): ");
        String dataInicioCursoStr = scanner.nextLine();
        LocalDate dataInicioCurso = LocalDate.parse(dataInicioCursoStr, formatter);

        Curso curso = new Curso(codigoCurso, nomeCurso, dataInicioCurso);

        System.out.println("Cadastro de Aluno:");
        System.out.print("Digite o número de matrícula do aluno: ");
        int numeroMatriculaAluno = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        System.out.print("Digite a data de nascimento do aluno (DD/MM/AAAA): ");
        String dataNascimentoAlunoStr = scanner.nextLine();
        LocalDate dataNascimentoAluno = LocalDate.parse(dataNascimentoAlunoStr, formatter);

        Aluno aluno = new Aluno(numeroMatriculaAluno, nomeAluno, dataNascimentoAluno);
        
        System.out.println("\nRealizar Matrícula:");
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Curso: " + curso.getNomeCurso());
        System.out.print("Digite a data de matrícula (DD/MM/AAAA): ");
        String dataMatriculaStr = scanner.nextLine();
        LocalDate dataMatricula = LocalDate.parse(dataMatriculaStr, formatter);

        Matricula matricula = new Matricula(aluno, curso, dataMatricula);

        if (matricula.alunoPossuiIdadeMinima()) {
            System.out.println("Matrícula realizada com sucesso!");

            System.out.println("\nDetalhes da Matrícula:");
            System.out.println("Aluno: " + matricula.getAluno().getNome());
            System.out.println("Curso: " + matricula.getCurso().getNomeCurso());
            System.out.println("Data de Matrícula: " + matricula.getDataMatricula().format(formatter));
            System.out.println("Início das Aulas: " + matricula.getCurso().getDataInicioCurso().format(formatter));
        } else {
            System.out.println("O aluno não possui idade mínima para matrícula (18 anos).");
        }

        scanner.close();
    }
}
