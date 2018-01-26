package br.com.lelo.precos.precocadastro.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lelo.precos.precocadastro.business.ProdutoFilialBusiness;
import br.com.lelo.precos.precocadastro.model.ProdutoFilial;

@RestController
@RequestMapping("precos-cadastro")
public class PrecoCadastroController {

	@Autowired
	private ProdutoFilialBusiness business;

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@PostMapping(value = "produto-filial/{produto}/{filial}")
	public ProdutoFilial loadProdutoFilial(@PathVariable Long produto, @PathVariable Long filial) throws Exception {
		log.info(" \n*********** inicio *************\n");

		ProdutoFilial produtoFilial = business.loadProdutoFilial(produto, filial);

		log.info(produtoFilial.toString());
		log.info(" \n************** fim *************\n");
		return produtoFilial;
	}

	@GetMapping(value = "produtos-filiais")
	public Collection<ProdutoFilial> findAll() {
		return business.findAll();
	}

}
