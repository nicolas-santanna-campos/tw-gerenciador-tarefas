package br.com.myenterprise.twgerenciadortarefas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.myenterprise.twgerenciadortarefas.modelos.Tarefa;

public interface RepositorioTarefa extends JpaRepository<Tarefa, Long>{

}
