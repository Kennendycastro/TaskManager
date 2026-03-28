package controller;

import java.util.ArrayList;
import java.util.List;

import model.Tarrefa;

public class TaskManager {
  private List<Tarrefa> tarrefas = new ArrayList<Tarrefa>();

  public TaskManager(){

  }

  public TaskManager(List<Tarrefa> tarrefas) {
    this.tarrefas = tarrefas;
  }


  public void addTarrefa(Tarrefa tarrefa){
    tarrefas.add(tarrefa);
    
  }

  public void removerTarrefa(String titulo){
    tarrefas.removeIf(t -> t.getTitulo().equals(titulo));

  }

  
  public void concluirTarrefa(Tarrefa tarrefa){
    tarrefa.setConcluida(true);
  }

  public void listarTarrefa(){
     for (Tarrefa var : tarrefas) {
        var.mostrarTarrefas();
     }
  }




}
