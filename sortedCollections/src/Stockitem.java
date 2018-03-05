public class Stockitem implements Comparable<Stockitem> {
    private final String name;
    private Double price;
    private int quantityStock = 0;

    public Stockitem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
    }

    public Stockitem(String name, Double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public void adjustStock(int quatity) {
        int newQuantity = this.quantityStock + quatity;
        if(newQuantity >= 0) {
            this.quantityStock = newQuantity;
        }
    }

    public void setPrice(double price) {
        if(price >= 0.0) {
            this.price = price;
        }
    }
    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    @Override
    public int compareTo(Stockitem o) {
        if(this == o) {
            return 0;
        }
        if(o != null) {
            return this.name.compareTo(o.getName());
        }
        throw new NullPointerException();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((Stockitem) obj).getName();
        double objPrice = ((Stockitem) obj).getPrice();
        return ((this.getName().equals(objName)) && (objPrice == this.getPrice()));
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.price.hashCode() + 31;
    }

    @Override
    public String toString() {
        return this.name + " : price " + this.price;
    }
}






















