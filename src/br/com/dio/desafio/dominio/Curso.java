package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public Curso(int cargaHoraria, String descricao, String titulo) {
        this.cargaHoraria = cargaHoraria;
        this.descricao = descricao;
        this.titulo = titulo;
    }

    public Curso(){}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    
}
