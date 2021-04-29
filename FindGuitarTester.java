/* 
 * SearchGuitars 1.0 
 * 2021. 4. 29
 */

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

  public static void main(String[] args) {
    // Set up Rick's guitar inventory
    Inventory inventory = new Inventory();
    initializeInventory(inventory);

    Guitar whatErinLikes = new Guitar("", 0, "fender", "Stratocastor", 
                                      Type.Electric, Wood.Alder, Wood.Alder);
    
    List searchResult = inventory.search(whatErinLikes);
    
    if (!searchResult.isEmpty()) {		// 검색 결과 리스트가 있으면..
    	
    	for (Iterator i = searchResult.iterator(); i.hasNext(); ) {
    		Guitar guitar = (Guitar)i.next();
    		
    		System.out.println("Erin, you might like this " +
    		  guitar.getBuilder() + " " + guitar.getModel() +  " " +
    		  guitar.getType() + " guitar:\n   " +
    		  guitar.getBackWood() + " back and sides,\n   " +
    		  guitar.getTopWood() + " top.\nYou can have it for only $" +
    		  guitar.getPrice() + "!");
    	}
    }
    else {
    	System.out.println("Sorry, Erin, we have nothing for you.");
    }

  }

  private static void initializeInventory(Inventory inventory) {

    inventory.addGuitar("11277", 3999.95, "Collings", "CJ", Type.Acoustic,
                        Wood.Indian_Rosewood, Wood.Sitka);
    
    inventory.addGuitar("V95693", 1499.95, "Fender", "Stratocastor", Type.Electric,
                        Wood.Alder, Wood.Alder);
    
    inventory.addGuitar("V9512", 1549.95, "Fender", "Stratocastor", Type.Electric,
                        Wood.Alder, Wood.Alder);
    
    inventory.addGuitar("122784", 5495.95, "Martin", "D-18", Type.Acoustic,
                        Wood.Mahogany, Wood.Adirondack);
    
    inventory.addGuitar("76531", 6295.95, "Martin", "OM-28", Type.Acoustic,
                        Wood.Brazilian_Rosewood, Wood.Adirondack);
    
    inventory.addGuitar("70108276", 2295.95, "Gibson", "Les Paul", Type.Electric,
                        Wood.Mahogany, Wood.Maple);
    
    inventory.addGuitar("82765501", 1890.95, "Gibson", "SG '61 Reissue", Type.Electric,
    					Wood.Mahogany, Wood.Mahogany);
    
    inventory.addGuitar("77023", 6275.95, "Martin", "D-28", Type.Acoustic,
                        Wood.Brazilian_Rosewood, Wood.Adirondack);
    
    inventory.addGuitar("1092", 12995.95, "Olson", "SJ", Type.Acoustic,
                        Wood.Indian_Rosewood, Wood.Cedar);
    
    inventory.addGuitar("566-62", 8999.95, "Ryan", "Cathedral", Type.Acoustic,
                        Wood.Cocobolo, Wood.Cedar);
    
    inventory.addGuitar("6 29584", 2100.95, "PRS", "Dave Navarro Signature", Type.Electric,
    					Wood.Mahogany, Wood.Maple);
  }
}
