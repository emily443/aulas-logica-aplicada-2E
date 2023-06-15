public class Pessoa {

    //Atributos da pesssoa

    public String nome;
    public String sobrenome;
     //metodos  da classes
    public void falar(){
        System.out.println("falei");
    }
    //sobrecargado metodo
    public String falar (String volume){
        return "falei" + volume;
    }
}
