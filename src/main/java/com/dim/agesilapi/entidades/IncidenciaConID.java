package com.dim.agesilapi.entidades;

import es.mde.acing.entities.IncidenciaImpl;

public class IncidenciaConID extends IncidenciaImpl {

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
