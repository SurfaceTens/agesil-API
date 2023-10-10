package com.dim.agesilapi.entidades;

import java.util.List;

import es.mde.acing.entities.IncidenciaDeficiencia;
import es.mde.acing.entities.IncidenciaDeficienciaImpl.Incumplimientos;

public class IncidenciaHijoDeficiencia extends IncidenciaConID implements IncidenciaDeficiencia {

	// Atributos Hijos
	private List<Incumplimientos> incumplimientos;
	private boolean notificadoSABAS;

	public List<Incumplimientos> getIncumplimientos() {
		return incumplimientos;
	}

	public void setIncumplimientos(List<Incumplimientos> incumplimientos) {
		this.incumplimientos = incumplimientos;
	}

	public boolean isNotificadoSABAS() {
		return notificadoSABAS;
	}

	public void setNotificadoSABAS(boolean notificadoSABAS) {
		this.notificadoSABAS = notificadoSABAS;
	}

}
