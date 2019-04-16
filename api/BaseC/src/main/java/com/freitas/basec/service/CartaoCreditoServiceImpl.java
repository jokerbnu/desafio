package com.freitas.basec.service;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import com.freitas.basec.model.CompraCartao;
import com.freitas.basec.model.Endereco;
import com.freitas.basec.model.PessoaFisica;

@Service("cartaoCreditoService")
public class CartaoCreditoServiceImpl implements CartaoCreditoService {

	private static List<CompraCartao> comprasCartao;

	// Teste por não precisar implementar a parte de infraestrutura
	static {
		comprasCartao = populateComprasCartao();
	}
	
	@Override
	public CompraCartao ultimaCompra(String cpf) {
		CompraCartao ultimaCompraCartao = null;

		for(CompraCartao cc: comprasCartao) {
			if(cc.getPessoaFisica().getCpf().equalsIgnoreCase(cpf)) {
				if(ultimaCompraCartao == null) {
					ultimaCompraCartao = cc;
					continue;
				}
				
				if(ultimaCompraCartao.getDataCompra().compareTo(cc.getDataCompra()) < 0)
					ultimaCompraCartao = cc;
			}
		}
		
		return ultimaCompraCartao;
	}

	private static List<CompraCartao> populateComprasCartao() {
		List<CompraCartao> comprasCartao = new ArrayList<CompraCartao>();
		PessoaFisica pessoaFisica = new PessoaFisica(1, "12345678912", "João da Silva", 
				new Endereco(1, "Rua José Reuter", 123, "Blumenau", "Velha", null), null);
		
		CompraCartao cc = new CompraCartao(1, pessoaFisica, new DateTime(2019, 3, 30, 12, 0), 200);
		CompraCartao cc2 = new CompraCartao(2, pessoaFisica, new DateTime(2019, 4, 12, 21, 16), 127.3);
		
		comprasCartao.add(cc);
		comprasCartao.add(cc2);
		
		return comprasCartao;
	}

}
