public class Carro {
    private String carro;
    private String ano;
    private double preço;
    
    public Carro (){}
    
    
    public Carro(String carro,String ano,double preço){
        this.carro = carro;
        this.ano = ano;
        this.preço = preço;
    }
    
    public void setCarro(String nome){
        carro = nome;
    }
    public void setAno(String data){
        ano = data;
    }
    public void setPreço(double num){
        preço = num;
    }
    public String getCarro(){
        return carro;    
    }
    public String getAno(){
        return ano;
    }
    public double getPreço(){
        return preço;
    }
    
    
    
    
    
}