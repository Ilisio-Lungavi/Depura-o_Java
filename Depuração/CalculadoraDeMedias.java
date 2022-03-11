import java.util.Scanner;

public class CalculadoraDeMedias {

    public class CalculadoraDeMedias {
    public  static  void  main ( String [] args ) {
        Scanner scan =

        novo  Scanner ( System . in);
        String [] alunos = { " Camila " , " Lucas " , " Bruna " , " Pedro " };

        mídia double = calculaMediaDaTurma(alunos, scan);

        System.out.printf( " Média da turma %.1f " , media);
    }

    public  static  double  calculaMediaDaTurma ( String [] alunos , Scanner  scanner ) {

        soma double =  0 ;
        for ( String aluno : alunos) {
            System.out.printf( " Nota do aluno %s: " , aluno);
            nota double = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos . comprimento;
    }
}
