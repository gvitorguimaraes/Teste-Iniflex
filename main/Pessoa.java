import java.time.LocalDate;

public class Pessoa {

    protected String nome;
    protected LocalDate dataNascimento;
    
    public Pessoa(){

    }
    
    // Getters and Setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public LocalDate getDataNasc(){
        return dataNascimento;
    }
    public void setDataNasc(LocalDate data){
        this.dataNascimento = data;
    }
}
