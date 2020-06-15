import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shopping {

	public static void main(String[] args) {
		
		 // CLIENT WISHES
		  ArrayList<String> listOfWishes = new ArrayList<> (Arrays.asList( 
		    "Spaghetti,2", 
		    "Pepper,5",
		    "Sugar,1"
		  )); 
		  
		  // STORE OFFERS
		  ArrayList<String> listOfOffers = new ArrayList<> (Arrays.asList( 
		    "Spaghetti,10.00", 
		    "Sugar,5.00",
		    "Water,2.50"
		  ));
		  
		  // каk можно из "Spaghetti,2" получить отдельно "Spaghetti" - как строку и 2 - как целое число?
		  System.out.println("Obtaining in part the data types : ");
		  String wish = listOfWishes.get(0).substring(0 , 9);
		  Integer quantity = Integer.parseInt(listOfWishes.get(0).substring(10));
		  System.out.println("String : "+wish);
		  System.out.println("Integer : "+quantity);
		  
		  // CLIENT FULFILLED WISHES
		  System.out.println("List of purchases : ");
		  ArrayList<String> listOfPurchases = new ArrayList<>();
		  
		  for (String lw : listOfWishes) {
                wish = lw.substring(0, lw.indexOf(','));
	            quantity = Integer.parseInt(lw.substring(lw.indexOf(',') + 1));

	         for (String lo : listOfOffers) {
                String offer = lo.substring(0, lo.indexOf(','));
	            Double price = Double.parseDouble(lo.substring(lo.indexOf(',') + 1));

	             if (wish.equals(offer)) {
	                listOfPurchases.add(wish + ',' + quantity + '=' + (quantity * price));
	                }
	            }
		  }
		  //print list of purchases
        for (String lp : listOfPurchases) {
		System.out.println(lp);
	      }

	}

}
