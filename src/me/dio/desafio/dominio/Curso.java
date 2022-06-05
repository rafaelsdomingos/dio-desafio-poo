package me.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    //Construtor
    public Curso(){

    }

    //metodos
    public double calcularXp(){
        return XP_PADRAO * cargaHoraria;
    }



    //Getters and Setters
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //toString
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + cargaHoraria +
                '}';
    }

}
