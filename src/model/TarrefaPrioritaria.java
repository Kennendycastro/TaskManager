package model;

public class TarrefaPrioritaria extends Tarrefa{
     
    private String prioridade;




    public String getPrioridade() {
        return prioridade;
    }




    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    

    


    public TarrefaPrioritaria(String titulo, String descricao, boolean concluida, String prioridade) {
        super(titulo, descricao, concluida);
        this.prioridade = prioridade;
    }




    @Override
    public void mostrarTarrefas() {
        // TODO Auto-generated method stub
        System.out.println("Prioridade da tarrefa: "+getPrioridade());
        super.mostrarTarrefas();
        
    }






    

    
}
