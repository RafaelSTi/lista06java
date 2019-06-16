import java.util.Scanner;
public class Curso {
    private String nomecurso;
    private double[] notas = new double[10];
    
    
    public Curso(){}
    
    public Curso(String nomecurso,double []notas){
        this.nomecurso = nomecurso;
        this.notas = notas;
    }
    
    Scanner ler = new Scanner(System.in);
    
    
    public void setNomeCurso(String nome){
        nomecurso = nome;
    }
    public void setNotas(double []num){
        notas = num;
    }
    public String getNomeCurso(){
        return nomecurso;
    }
    public double[] getNotas(){
        return notas;
    }
    int numAlunos = 10;
    double[] notasAlunos = new double[numAlunos];
    
    public void notasAl(){
      for (int x=0;x<numAlunos;++x){
            System.out.println("Digite a nota do "+(x+1)+" aluno."); 
            notasAlunos[x] = ler.nextDouble();   
    }
      }
    public void mediaTurma(){
           double soma = 0;
           for (int x=0;x<numAlunos;++x){
               soma = soma+notasAlunos[x];
               double media = soma/numAlunos;
               System.out.println("A media da turma foi de "+media);
           }
        }
    public void maiorNota(){
        double maior = 0;
        for (int i=0;i<notasAlunos.length;++i){
            if (notasAlunos[i]>maior){
                maior = notasAlunos[i];
                System.out.println("A maior nota foi de "+maior);           
        }
        
    }
    }
}
