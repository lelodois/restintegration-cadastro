package br.com.lelo.precos.precocadastro.business;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lelo.precos.precocadastro.model.ProdutoFilial;
import br.com.lelo.precos.precocadastro.repository.ProdutoFilialRepository;

@Service
public class ProdutoFilialBusiness {

	@Autowired
	private ProdutoFilialRepository repository;

	public ProdutoFilial loadProdutoFilial(Long produto, Long filial) {
		ProdutoFilial produtoFilial = repository.findOne(produto + "" + filial);
		if (produtoFilial == null) {
			produtoFilial = save(new ProdutoFilial(produto, filial));
		}
		return produtoFilial;
	}

	public ProdutoFilial save(ProdutoFilial produtoFilial) {
		return repository.save(produtoFilial);
	}

	public Collection<ProdutoFilial> findAll() {
		return repository.findAll();
	}

}
