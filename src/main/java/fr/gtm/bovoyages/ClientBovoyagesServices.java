package fr.gtm.bovoyages;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class ClientBovoyagesServices {

	public static String[] getAllRegions() {
		String domaine = "http://Localhost:9080/bovoyages3-WS/";
		String uri = domaine + "rest/destination/regions";

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);
		String[] regions = target.request(MediaType.APPLICATION_JSON).get(String[].class);
		return regions;
	}
	
	public static List<Destination> getAllDestinations() {
		String domaine = "http://Localhost:9080/bovoyages3-WS/";
		String uri = domaine + "rest/destination/all";

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);
		Destination[] destinations = target.request(MediaType.APPLICATION_JSON).get(Destination[].class);
		return Arrays.asList(destinations);
	}
	
	public static List<DatesVoyages> getAllDates(long id) {
		String domaine = "http://Localhost:9080/bovoyages3-WS/";
		String uri = domaine + "rest/destination/date/"+id;

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);
		DatesVoyages[] dates = target.request(MediaType.APPLICATION_JSON).get(DatesVoyages[].class);
		return Arrays.asList(dates);
	}
	
	public static String addVoyage(String region, String descriptif, DatesVoyages dv, fr.gtm.bovoyages.Client cl, List<Voyageur> voyageurs ) {
		Voyage v = new Voyage(region, descriptif, (long)0 , dv, cl, voyageurs);
		String domaine = "http://localhost:9080/bovoyages3-WS/";
		String uri = domaine + "rest/voyage/add";
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);
		String retour = target.request(MediaType.APPLICATION_JSON).post(Entity.entity(v, MediaType.APPLICATION_JSON), String.class);
		return retour;
	}
	
	public static String commanderVoyage(long id) {
		String domaine = "http://Localhost:9080/bovoyages3-WS/";
		String uri = domaine + "rest/voyage/commander/"+id;
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);
		boolean b = target.request(MediaType.APPLICATION_JSON).get(boolean.class);
		if (b == true) {
			return "La commande a été effectuée";	
		}else {
			return "Plus de place disponibles, la commande n'a pas été effectuée";
		}
		
		
	}
	
}
