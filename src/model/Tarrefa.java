package model;

public class Tarrefa {

    private String titulo;
    private String descricao;
    private boolean concluida;


    public Tarrefa(){}

    public Tarrefa(String titulo, String descricao, boolean concluida) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = concluida;
    }


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
    public boolean isConcluida() {
        return concluida;
    }
    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    } 

    public void mostrarTarrefas(){
        //System.out.println("<---------------------------------------------->");
        System.out.println("Titulo da Tarrefa: "+ getTitulo());
        System.out.println("Descrição da Tarrefa: "+ getDescricao());
        System.out.println("Status da Tarrefa: "+ (isConcluida() ? "Concluida": "Não concluida"));
        System.out.println(" ");
    }

    
    
}