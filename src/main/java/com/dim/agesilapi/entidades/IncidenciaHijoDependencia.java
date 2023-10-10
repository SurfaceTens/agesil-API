package com.dim.agesilapi.entidades;

import es.mde.acing.entities.IncidenciaDependencia;
import es.mde.acing.entities.IncidenciaDependenciaImpl.Cambios;

public class IncidenciaHijoDependencia extends IncidenciaConID implements IncidenciaDependencia {

	// Atributos Hijos
	private Cambios cambioSolicitado;
	private double metrosCuadrados;

	public Cambios getCambioSolicitado() {
		return cambioSolicitado;
	}

	public void setCambioSolicitado(Cambios cambioSolicitado) {
		this.cambioSolicitado = cambioSolicitado;
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

}
