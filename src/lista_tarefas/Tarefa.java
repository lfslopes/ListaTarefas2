package lista_tarefas;

public class Tarefa implements Comparable<Tarefa>{
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }
    public boolean isConcluida() {
        return concluida;
    }

    public void changeConclusao() {
        this.concluida = !this.concluida;
    }

    @Override
    public int compareTo(Tarefa tarefa) {
        return this.descricao.compareTo(tarefa.descricao);
    }
    @Override
    public String toString() {
        if (concluida)
            return "Tarefa: " + descricao + ". Concluida";
        return "Tarefa: " + descricao + ". Ainda não concluida";
    }
}
