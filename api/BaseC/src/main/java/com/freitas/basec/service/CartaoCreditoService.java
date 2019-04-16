package com.freitas.basec.service;

import com.freitas.basec.model.CompraCartao;

public interface CartaoCreditoService {

	CompraCartao ultimaCompra(String cpf);
}
