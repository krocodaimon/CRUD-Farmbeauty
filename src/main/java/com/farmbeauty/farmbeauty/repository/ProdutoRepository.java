package com.farmbeauty.farmbeauty.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.farmbeauty.farmbeauty.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List <Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

	public List<Produto> findByPrecoBetween(double precoMinimo, double precoMaximo);
}
