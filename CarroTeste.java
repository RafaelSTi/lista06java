import java.util.Scanner;
public class CarroTeste {
    public static void main(String[]agrs){
        Scanner ler = new Scanner(System.in);
        
        int num = 5;
        double[] preço = new double[num];
        
        for (int i=0;i<num;++i){
            
            preço[i] = ler.nextDouble();
        
        }
        double soma = 0;
            for (int i=0;i<num;++i){
            soma = soma+preço[i];
            System.out.println("o total deu R$"+soma);
        }
       double maior =0;
       for (int i =0;i<preço.length;++i){
           if (preço[i]>maior){
               maior = preço[i];
           }
       }
        System.out.println("o maior valor foi de "+maior);
}
}

