package doubletowns;

import java.util.List;

public class FindDoubles {

	public static void main(String[] args) {

		PlaceReader pr = new PlaceReader();
		List<Place> places = pr.readPlaces("/Users/PGS/Desktop/towns.txt");
//		System.out.println("size of places is " + places.size());

		int count = 0;
		String formatStr = "%-20s %-15s %-15s";
		System.out.println(String.format(formatStr, "Place Name", "Place Type", "County"));
		System.out.println("---------------------------------------------------------");
		for (int placeIdx = 0; placeIdx < places.size(); placeIdx++){
			Place place = places.get(placeIdx);
			String placeName = place.getName();
//			System.out.println("placeName= " + placeName);

			for (int i = 0; i < placeName.length()-1; i++)
			{
				if (placeName.charAt(i) != 'l' && placeName.charAt(i) == placeName.charAt(i+1)) {
					Place doublePlace = new Place(place);
//					System.out.println(doublePlace.toString());
					
					System.out.println(String.format(formatStr, doublePlace.placeName, doublePlace.placeType, doublePlace.county));

					
					count++;
				}
			}
		}
		System.out.println("\nCount= "+ count);
	}

}
