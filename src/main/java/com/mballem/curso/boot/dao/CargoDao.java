package com.mballem.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.mballem.curso.boot.domain.Cargo;

@Repository
public class CargoDao extends AbstractDao<Cargo, Long> implements DaoGenerico<Cargo> {

}
//quando abre uma transacao, esta bloqueando o acesso a tabela do banco
//spring sabe q n é p abrir uma transacao

// por padra é false

//caso de erro na operacao de insert, o processo de transacoes do spring vai gerar um rollback. faz com q um commit n seja executado e todas as operacoes sejam revertidas.

//inclui dois daos dependentes no banco, se colocar um transactional em um metodo q involve só um dao, caso de um erro sera incluido uma parte do dado a outra n sera, entao os dados ficarao incompletos pois os dados sao dependentes. se colocar o transactional na camada service, envolvendo os dois daos, se der erro, sera interrompida as operacoes dos dois daos. 