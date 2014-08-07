package doubletowns;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class PlaceReader {

	public PlaceReader() {
	}
	
	List<Place> readPlaces(String placeFile) {
		
		List<Place> placeList = new ArrayList<Place>();
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(placeFile));
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
//	        	System.out.print("line= >" + line + "<, ");
	    		StringTokenizer st = new StringTokenizer(line,",");
	        	String placeName = st.nextToken();
	        	String placeType = st.nextToken();
	        	String county = st.nextToken();
//	        	System.out.print("placeName= >" + placeName + "<, ");
//	        	System.out.print("placeType= >" + placeType + "<, ");
//	        	System.out.println("county= >" + county + "<");
	        	
	        	Place place = new Place(placeName,placeType,county);
	        	placeList.add(place);
//	        	System.out.println(place.toString());
	        	
	            line = br.readLine();
	        }
	    } catch (IOException e) {
			e.printStackTrace();
		} finally {
	        try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
		
		
		return placeList;
		
	}
	
	

}
