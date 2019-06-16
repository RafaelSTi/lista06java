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
    double[] notasAlunos = new double[10];
    
    public void notasAl(){
      for (int x=0;x<numAlunos;++x){
            System.out.println("Digite a nota do "+(x+1)+" aluno."); 
            notasAlunos[x] = ler.nextDouble();   
    }
      }
    double total = notasAlunos[0]+notasAlunos[1]+notasAlunos[2]+notasAlunos[3]+notasAlunos[4]+notasAlunos[5]+notasAlunos[6]+notasAlunos[7]+
            notasAlunos[8]+notasAlunos[9]+notasAlunos[10];
 
    public void mediaTurma(){
           double media = total/numAlunos;
            System.out.println("A media da turma foi"+media);
            
        }
    }
