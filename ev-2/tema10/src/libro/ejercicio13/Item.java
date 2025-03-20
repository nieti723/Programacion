package libro.ejercicio13;

public class Item {

    private String code;
    private String description;
    private double buyPrice;
    private double sellPrice;
    private int stock;

    public Item(String code, String description, double buyPrice, double sellPrice, int stock) {
        this.code = code;
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.stock = stock;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Artículo " + code + ":\nDescripción: " + description + "\nPrecio de compra: " + buyPrice + "\nPrecio de venta: " + sellPrice + "\nStock: " + stock;
    }
}
