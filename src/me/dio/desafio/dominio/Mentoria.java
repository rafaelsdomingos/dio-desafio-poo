package me.dio.desafio.dominio;
import java.time.LocalDate;


public class Mentoria extends Conteudo{

    private LocalDate data;

    //Construtor
    public Mentoria( ){

    }

    //metodos
    public double calcularXp(){
        return XP_PADRAO + 10;
    }

    //Getters and Setters
    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }


    //Método ToString


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
