package com.vincent.service;

import com.vincent.interceptors.exception.ArticleNotFoundException;
import com.vincent.interceptors.exception.NotEnoughArticleException;
import com.vincent.interceptors.exception.QtyNegativeException;
import com.vincent.metier.Stock;

public interface IService {

	public void sortArticledustock(int id, int qte)
			throws ArticleNotFoundException, QtyNegativeException, NotEnoughArticleException;

	public int getQtyEnStock(int id) throws ArticleNotFoundException;

	public void ajouter(Stock s);
}
