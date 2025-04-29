import lista_tarefas.ListaTarefas;
import lista_tarefas.Tarefa;

public class Main {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa("Arrumar o quarto");
        Tarefa tarefa2 = new Tarefa("Limpar a casa");
        Tarefa tarefa3 = new Tarefa("Lavar os pratos");
        Tarefa tarefa4 = new Tarefa("Assistir ao curso");

        ListaTarefas listaTarefa = new ListaTarefas(tarefa, tarefa2, tarefa3, tarefa4);

        listaTarefa.adicionarTarefa("Ir à academia");
        listaTarefa.removerTarefa("Arrumar o quarto");
        listaTarefa.marcarTarefaConcluida("Limpar a casa");
        listaTarefa.marcarTarefaConcluida("Lavar os pratos");
        listaTarefa.marcarTarefaConcluida("Assistir ao curso");
        listaTarefa.marcarTarefaPendente("Assistir ao curso");
        System.out.println("######################## - Tarefas Concluídas - #################################");
        listaTarefa.obterTarefasConcluidas().forEach(System.out::println);
        System.out.println("######################## - Tarefas Pendentes - #################################");
        listaTarefa.obterTarefasPendentes().forEach(System.out::println);
        System.out.println("Tarefas no total: " + listaTarefa.contarTarefas());

        System.out.println("Limpando a lista de tarefas...");
        listaTarefa.limparListaTarefas();
        System.out.println("Tarefas no total: " + listaTarefa.contarTarefas());
    }
}
