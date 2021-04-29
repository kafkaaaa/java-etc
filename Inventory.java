import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
  private List guitars;

  public Inventory() {
    guitars = new LinkedList();
  }

  public void addGuitar(String serialNumber, double price,
                        String builder, String model,
                        Type type, Wood backWood, Wood topWood) {
	  
      Guitar guitar = new Guitar(serialNumber, price, builder,
                               model, type, backWood, topWood);
      guitars.add(guitar);
  }
  
  public Guitar getGuitar(String serialNumber) {
	  
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }
  
  public List search(Guitar searchGuitar) {
	  List searchResult = new LinkedList();
	  
	for (Iterator i = guitars.iterator(); i.hasNext(); ) {
	  Guitar guitar = (Guitar)i.next();
	  
	  // Ignore serial number since that's unique
	  // Ignore price since that's unique

	  String builder = searchGuitar.getBuilder();
      if ((builder != null) && (!builder.equals("")) &&
          (!builder.equalsIgnoreCase(guitar.getBuilder())))
        continue;
      
      String model = searchGuitar.getModel();
      if ((model != null) && (!model.equals("")) &&
          (!model.equalsIgnoreCase(guitar.getModel())))
        continue;
      
      Type type = searchGuitar.getType();
      if (type != guitar.getType())
        continue;
      
      Wood backWood = searchGuitar.getBackWood();
      if (backWood != guitar.getBackWood())
        continue;
      
      Wood topWood = searchGuitar.getTopWood();
      if (topWood != guitar.getTopWood())
        continue;
      
      searchResult.add(guitar);
	}
	return searchResult;
  }

}
