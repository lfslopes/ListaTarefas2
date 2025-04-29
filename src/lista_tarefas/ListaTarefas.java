package lista_tarefas;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ListaTarefas {
    private final Set<Tarefa> tarefas;
    public ListaTarefas() {
        this.tarefas = new TreeSet<>();
    }
    public ListaTarefas(Set<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
    public ListaTarefas(Tarefa...tarefa) {
        this.tarefas = new TreeSet<>();
        this.tarefas.addAll(Arrays.asList(tarefa));
    }

    public void adicionarTarefa(String descricao) {
        this.tarefas.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        this.tarefas.removeIf(tarefa -> tarefa.getDescricao().equals(descricao));
    }
    public int contarTarefas() {
        return this.tarefas.size();
    }
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new TreeSet<>();
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.isConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new TreeSet<>();
        for (Tarefa tarefa : this.tarefas) {
            if (!tarefa.isConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }
    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getDescricao().equals(descricao) && !tarefa.isConcluida()) {
                tarefa.changeConclusao();
            }
        }
    }
    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getDescricao().equals(descricao) && tarefa.isConcluida()) {
                tarefa.changeConclusao();
            }
        }
    }
    public void limparListaTarefas() {
        this.tarefas.clear();
    }
}
