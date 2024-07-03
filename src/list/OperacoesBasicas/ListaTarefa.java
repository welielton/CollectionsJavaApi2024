package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        //adiciona uma tarefa
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        //remove tarefas se repetidas
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);

            }

        }
    }
    public int obterNumeroTotalTarefas(){
        //para saber a qtd de elementos da lista
        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        //imprimindo a lista de tarefa
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        //Cria um objeto a partir da classe ListaTarefa
        ListaTarefa vlistaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista é: " + vlistaTarefa.obterNumeroTotalTarefas());
    }
}
