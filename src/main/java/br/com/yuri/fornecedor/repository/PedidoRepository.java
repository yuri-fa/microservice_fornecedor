package br.com.yuri.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.yuri.fornecedor.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
