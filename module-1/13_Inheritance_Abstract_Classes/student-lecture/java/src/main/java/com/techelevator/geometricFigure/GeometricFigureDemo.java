package com.techelevator.geometricFigure;

import java.util.ArrayList;
import java.util.List;

public class GeometricFigureDemo {

	public static void main(String[] args) {
	
		List<GeometricFigure> geoFigs = new ArrayList<GeometricFigure>();

		geoFigs.add(new Rectangle(2, 4));
		geoFigs.add(new Triangle(4, 2));
		geoFigs.add(new Rectangle(6, 10));
		geoFigs.add(new Triangle(10, 6));
		
		for (GeometricFigure geofig : geoFigs) {
			System.out.println(geofig);
		}
		
	}

}
