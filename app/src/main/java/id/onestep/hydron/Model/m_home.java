package id.onestep.hydron.Model;

public class m_home {
    private int id;
    private String simulateTitle, simulatePrice;

    public m_home(int id, String simulateTitle, String simulatePrice) {
        this.id = id;
        this.simulateTitle = simulateTitle;
        this.simulatePrice = simulatePrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSimulateTitle() {
        return simulateTitle;
    }

    public void setSimulateTitle(String simulateTitle) {
        this.simulateTitle = simulateTitle;
    }

    public String getSimulatePrice() {
        return simulatePrice;
    }

    public void setSimulatePrice(String simulatePrice) {
        this.simulatePrice = simulatePrice;
    }
}
