package br.com.lelo.precos.precocadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lelo.precos.precocadastro.model.ProdutoFilial;

@Repository
public interface ProdutoFilialRepository extends JpaRepository<ProdutoFilial, String> {
}
