package com.algaworks.curso.dao;

public class DAOExcpetion extends RuntimeException {
	
	public DAOExcpetion(String msg, Throwable t) {
		super(msg, t);
	}

}
