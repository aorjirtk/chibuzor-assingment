package petrol;

public class PetrolPurchase {
    String location;
    String petrolType;
    int litres;
    double price;
    double discount;

    public PetrolPurchase(String location, String petrolType, int litres, double price,double discount) {
        this.location = location;
        this.petrolType = petrolType;
        this.litres = litres;
        this.price = price;
        this.discount = discount;
    }
    public String getLocation() {
        return location;
    }

    public String getPetrolType() {

        return petrolType;
    }

    public int getLitres() {

        return litres;
    }

    public double getPrice() {

        return price;
    }

    public double getDiscount() {
        return discount;

    }
    public double getPurchasePrice() {
        if(litres > 0 && discount > 0) {
            return (price * litres )-discount;
        }else
            return 0;
    }
}
