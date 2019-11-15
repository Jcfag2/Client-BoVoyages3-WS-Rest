package fr.gtm.bovoyages;

import java.io.Serializable;
import java.time.LocalDate;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;


public class DatesVoyages implements Serializable{

	private long id;
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	private LocalDate dateAller;
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	private LocalDate dateRetour;
	private double tarifUnitaireHT;
	private double nbPlaces;
	
	public DatesVoyages() {}

	public DatesVoyages(LocalDate dateAller, LocalDate dateRetour) {
		this.dateAller = dateAller;
		this.dateRetour = dateRetour;
	}

	public DatesVoyages(long id, LocalDate dateAller, LocalDate dateRetour, double tarifUnitaireHT, double nbPlaces) {
		super();
		this.id = id;
		this.dateAller = dateAller;
		this.dateRetour = dateRetour;
		this.tarifUnitaireHT = tarifUnitaireHT;
		this.nbPlaces = nbPlaces;
	}
	
	public DatesVoyages(LocalDate dateAller, LocalDate dateRetour, double tarifUnitaireHT, double nbPlaces) {
		this.dateAller = dateAller;
		this.dateRetour = dateRetour;
		this.tarifUnitaireHT = tarifUnitaireHT;
		this.nbPlaces = nbPlaces;
	}

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDateAller() {
		return dateAller;
	}

	public void setDateAller(LocalDate dateAller) {
		this.dateAller = dateAller;
	}

	public LocalDate getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(LocalDate dateRetour) {
		this.dateRetour = dateRetour;
	}

	public double getTarifUnitaireHT() {
		return tarifUnitaireHT;
	}

	public void setTarifUnitaireHT(double tarifUnitaireHT) {
		this.tarifUnitaireHT = tarifUnitaireHT;
	}

	public double getNbPlaces() {
		return nbPlaces;
	}

	public void setNbPlaces(double nbPlaces) {
		this.nbPlaces = nbPlaces;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateAller == null) ? 0 : dateAller.hashCode());
		result = prime * result + ((dateRetour == null) ? 0 : dateRetour.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		long temp;
		temp = Double.doubleToLongBits(nbPlaces);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(tarifUnitaireHT);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DatesVoyages other = (DatesVoyages) obj;
		if (dateAller == null) {
			if (other.dateAller != null)
				return false;
		} else if (!dateAller.equals(other.dateAller))
			return false;
		if (dateRetour == null) {
			if (other.dateRetour != null)
				return false;
		} else if (!dateRetour.equals(other.dateRetour))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(nbPlaces) != Double.doubleToLongBits(other.nbPlaces))
			return false;
		if (Double.doubleToLongBits(tarifUnitaireHT) != Double.doubleToLongBits(other.tarifUnitaireHT))
			return false;
		return true;
	}


	
}
