package com.anncode.amazonviewer.model;

import java.util.Date;

public interface IVisualizable {

	/**
	 * Este metodo captura el tiempo exacto de inicio de visualizacion.
	 *
	 * @param dateI Es un objeto {@code Date} con el tiempo de inicio exacto.
	 * @return {@code Date} Devuelve la fecha y hora capturada.
	 */
	Date startToSee(Date dateI);

	/**
	 * Este metodo captura el tiempo exacto de inicio y final de visualizacion.
	 * @param dateI Es un objeto {@code Date} con el tiempo de inicio exacto.
	 * @param dateF Es un objeto {@code Date} con el tiempo final exacto.
	 */
	void stopToSee(Date dateI, Date dateF);
	
}
