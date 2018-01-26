package br.com.lelo.precos.precocadastro;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import br.com.lelo.precos.precocadastro.business.ProdutoFilialBusiness;
import br.com.lelo.precos.precocadastro.model.ProdutoFilial;

@Configuration
public class ProdutoFilialLoaderConfiguration {

	@Autowired
	private ProdutoFilialBusiness business;

	@PostConstruct
	public void initPesaveisReplicadores() {
		business.save(new ProdutoFilial(6810l, 1l, true, true));
		business.save(new ProdutoFilial(6810l, 2l, true, true));
		business.save(new ProdutoFilial(6810l, 3l, true, true));
		business.save(new ProdutoFilial(6810l, 4l, true, true));
	}

}
