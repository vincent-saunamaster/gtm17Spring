package com.vincent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vincent.dao.StockRepository;
import com.vincent.interceptors.exception.ArticleNotFoundException;
import com.vincent.interceptors.exception.NotEnoughArticleException;
import com.vincent.interceptors.exception.QtyNegativeException;
import com.vincent.metier.Stock;

@Service //spring
public class ServiceIpl implements IService {

	@Autowired
	StockRepository stockRepository;

	@Override
	public void sortArticledustock(int id, int qte)
			throws ArticleNotFoundException, QtyNegativeException, NotEnoughArticleException {
		// TODO Auto-generated method stub
		if (qte < 0) {
			throw new QtyNegativeException();
		}
		if (!stockRepository.exists(id)) {
			throw new ArticleNotFoundException();
		}
		if (stockRepository.findOne(id).getQuantite() < qte) {
			throw new NotEnoughArticleException();
		}
		// on 'arrive ici que si aucun throw n'a été activé
		stockRepository.sortArticleduStock(id, qte);
	}

	@Override
	public int getQtyEnStock(int id) throws ArticleNotFoundException {
		// TODO Auto-generated method stub
		if (!stockRepository.exists(id)) {
			throw new ArticleNotFoundException();
		}
		return stockRepository.findOne(id).getQuantite();
	}

	@Override
	public void ajouter(Stock s) {
		// TODO Auto-generated method stub
		stockRepository.save(s);
	}

}
