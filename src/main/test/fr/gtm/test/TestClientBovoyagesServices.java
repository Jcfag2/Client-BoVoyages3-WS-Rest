package fr.gtm.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import fr.gtm.bovoyages.Client;
import fr.gtm.bovoyages.ClientBovoyagesServices;
import fr.gtm.bovoyages.DatesVoyages;
import fr.gtm.bovoyages.Destination;
import fr.gtm.bovoyages.Voyage;
import fr.gtm.bovoyages.Voyageur;

public class TestClientBovoyagesServices {

	@Test
	public void testGetAllRegions() {
		String[] regions = ClientBovoyagesServices.getAllRegions();
		assertNotNull(regions);
		assertTrue(regions.length > 0);
	}

	@Test
	public void testGetAllDestinations() {
		List<Destination> destinations = ClientBovoyagesServices.getAllDestinations();
		assertNotNull(destinations);
		assertTrue(destinations.size() > 0);
		Destination destinations2 = new Destination("Grenoble", "montagneux", "images/grenoble_1.jpg", 1);
		long deleted1 = 0;
		
		for(int i=0; i < destinations.size(); i++) {
			if (destinations.get(0).getDeleted() == 0) {
				deleted1 = destinations.get(0).getDeleted();
			}
		}
		long deleted2 = destinations2.getDeleted();
		assertNotEquals(deleted1, deleted2);
		//creer nouvelle destination avec 1 barré puis comparer les deux destinations
	}

	@Test
	public void testGetAllDates() {
		List<Destination> destinations = ClientBovoyagesServices.getAllDestinations();
		List<DatesVoyages> dv = new ArrayList<DatesVoyages>();
//		DatesVoyages[] dv2;
		long id = 0;
		for(int i=0; i < destinations.size(); i++) {
		//for(DatesVoyages d : datesVoyage.)
//			id = destinations.get(i).getId();
			DatesVoyages[] dv2 = ClientBovoyagesServices.getAllDates(destinations.get(0).getId());			
			assertTrue(dv2.length > 0);;
		}
	}

	@Test
	public void testAddVoyage() {
		DatesVoyages datesVoyages = new DatesVoyages(new Date(2018-01-01), new Date(2019-02-03), 11.0, 10);	
		Voyageur voyageurs = new Voyageur("M", "Jesus", "Marie", LocalDate.now());
//		ClientBovoyagesServices.addVoyage("Londres", "il pleut beaucoup", datesVoyages, new Client("Robert"), voyageurs);
//		assertNotNull(voyage);
//		assertNotEquals(0,voyage.getId());
	}

	@Test
	public void testCommanderVoyage() {
//		Date dAller = new Date(2019,10,15);
//		Date dRetour = new Date(2019,11,5);
//		LocalDate dNaisB = LocalDate.now();
//		LocalDate dNaisJ = LocalDate.now();
//		
//		Voyageur[] voyageur = new Voyageur[2];
//		Voyageur bobby = new Voyageur(0, "M", "Bobby", "Terrosky", dNaisB);
//		Voyageur jody = new Voyageur(0, "Mme", "Jody", "Terrosky", dNaisJ);
//		voyageur[0] = bobby;
//		voyageur[1] = jody;
//		DatesVoyages dv = new DatesVoyages(1,dAller,dRetour,55.2,15,1,0);
//		
//		Date dAller2 = new Date(1985,10,15);
//		Date dRetour2 = new Date(1985,11,5);
//		Date dNaisJ2 = new Date(1975,5,3);
//		Date dNaisR = new Date(1982,2,17);
//
//		Voyageur[] voyageur2 = new Voyageur[2];
//		Voyageur Jacky = new Voyageur(0, "M", "Jacky", "Chan", dNaisJ2);
//		Voyageur Robert = new Voyageur(0, "M", "Robert", "Baratheon", dNaisR);
//		voyageur2[0] = Jacky;
//		voyageur2[1] = Robert;
//		DatesVoyages dv2 = new DatesVoyages(2,dAller2,dRetour2,55.2,1,1,0);
		
		
//		Voyage voyage = new Voyage(0, "Galère du SOAP", "On mongolise bien fort", new Client(0, "TomTom"), voyageur, dv );
//		Voyage voyage2 = new Voyage(0, "La Tristitude du projet", "Quand même, c'est pas très très facile tout ça", new Client(0, "Gonzo"), voyageur2, dv2 );
//		boolean b = ClientBovoyagesServices.commanderVoyage(voyage);
//		boolean b2 = ClientBovoyagesServices.commanderVoyage(voyage2);
//		assertTrue(b);
//		assertFalse(b2);
	}

	@Test
	public void testModifierVoyageur() {
		Voyageur voyageurs = new Voyageur("Mme", "Bobby", "Marie", LocalDate.now());
		
	}

}
