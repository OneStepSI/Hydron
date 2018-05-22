package id.onestep.hydron.Model;

public class m_shop_all {
    private int id, image;
    private String title,price,stok;

    public m_shop_all(int id, int image, String title, String price, String stok) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.price = price;
        this.stok = stok;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }
}
