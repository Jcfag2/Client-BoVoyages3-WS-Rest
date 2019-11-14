package fr.gtm.bovoyages;

import java.io.Serializable;
import java.util.List;


public class Voyage implements Serializable{
	private String region;
	private String descriptif;
	private long id;
	private DatesVoyages dv;
	private Client client;
	private List<Voyageur> voyageurs;
	
	public Voyage() {}

	public Voyage(String region, String descriptif, long id, DatesVoyages dv, Client client, List<Voyageur> voyageurs) {
		super();
		this.region = region;
		this.descriptif = descriptif;
		this.id = id;
		this.dv = dv;
		this.client = client;
		this.voyageurs = voyageurs;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public DatesVoyages getDv() {
		return dv;
	}

	public void setDv(DatesVoyages dv) {
		this.dv = dv;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Voyageur> getVoyageurs() {
		return voyageurs;
	}

	public void setVoyageurs(List<Voyageur> voyageurs) {
		this.voyageurs = voyageurs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result + ((descriptif == null) ? 0 : descriptif.hashCode());
		result = prime * result + ((dv == null) ? 0 : dv.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((voyageurs == null) ? 0 : voyageurs.hashCode());
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
		Voyage other = (Voyage) obj;
		if (client == null) {
			if (other.client != null)
				return false;
		} else if (!client.equals(other.client))
			return false;
		if (descriptif == null) {
			if (other.descriptif != null)
				return false;
		} else if (!descriptif.equals(other.descriptif))
			return false;
		if (dv == null) {
			if (other.dv != null)
				return false;
		} else if (!dv.equals(other.dv))
			return false;
		if (id != other.id)
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (voyageurs == null) {
			if (other.voyageurs != null)
				return false;
		} else if (!voyageurs.equals(other.voyageurs))
			return false;
		return true;
	}
	
	
	
}
