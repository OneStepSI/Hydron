package id.onestep.hydron.Model;

public class m_home {
    private int id, cardImage;
    private String cardTitle, cardUrl, cardViews, cardDesc;

    public m_home(int id, int cardImage, String cardTitle, String cardUrl, String cardViews, String cardDesc) {
        this.id = id;
        this.cardImage = cardImage;
        this.cardTitle = cardTitle;
        this.cardUrl = cardUrl;
        this.cardViews = cardViews;
        this.cardDesc = cardDesc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCardImage() {
        return cardImage;
    }

    public void setCardImage(int cardImage) {
        this.cardImage = cardImage;
    }

    public String getCardTitle() {
        return cardTitle;
    }

    public void setCardTitle(String cardTitle) {
        this.cardTitle = cardTitle;
    }

    public String getCardUrl() {
        return cardUrl;
    }

    public void setCardUrl(String cardUrl) {
        this.cardUrl = cardUrl;
    }

    public String getCardViews() {
        return cardViews;
    }

    public void setCardViews(String cardViews) {
        this.cardViews = cardViews;
    }

    public String getCardDesc() {
        return cardDesc;
    }

    public void setCardDesc(String cardDesc) {
        this.cardDesc = cardDesc;
    }
}
