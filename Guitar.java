enum Type { Acoustic, Electric }

enum Wood { Indian_Rosewood, Sitka, Alder, Mahogany, Adirondack, Maple,
			Brazilian_Rosewood, Cedar, Cocobolo }

public class Guitar {

  private String serialNumber, builder, model;
  private Type type;
  private Wood backWood, topWood;
  private double price;

  public Guitar(String serialNumber, double price,
                String builder, String model, Type type,
                Wood backWood, Wood topWood) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
  }
  
  // Setter
  public void setPrice(float newPrice) { this.price = newPrice; }
  
  // Getter
  public String getSerialNumber() { return serialNumber; }
  public double getPrice() { return price; }
  public String getBuilder() { return builder; }
  public String getModel() { return model; }
  public Type getType() { return type; }
  public Wood getBackWood() { return backWood; }
  public Wood getTopWood() { return topWood; }
}
