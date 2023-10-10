package com.dim.agesilapi.entidades;

import es.mde.acing.entities.IncidenciaChoque;
import es.mde.acing.entities.IncidenciaChoqueImpl.Trabajos;

public class IncidenciaHijoChoque extends IncidenciaConID implements IncidenciaChoque {

	// Atributos Hijos
	private Trabajos trabajoSolicitado;

	public Trabajos getTrabajoSolicitado() {
		return trabajoSolicitado;
	}

	public void setTrabajoSolicitado(Trabajos trabajoSolicitado) {
		this.trabajoSolicitado = trabajoSolicitado;
	}

}
