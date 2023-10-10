package com.dim.agesilapi.entidades;

import es.mde.acing.entities.ReceptorImpl;

public class ReceptorConID extends ReceptorImpl {

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + ": " + id;
	}

}
