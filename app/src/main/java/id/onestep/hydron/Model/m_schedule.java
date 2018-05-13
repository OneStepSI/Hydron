package id.onestep.hydron.Model;

public class m_schedule {
    private int id;
    private String scheduleTitle, scheduleStatus;

    public m_schedule(int id, String scheduleTitle, String scheduleStatus) {
        this.id = id;
        this.scheduleTitle = scheduleTitle;
        this.scheduleStatus = scheduleStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getScheduleTitle() {
        return scheduleTitle;
    }

    public void setScheduleTitle(String scheduleTitle) {
        this.scheduleTitle = scheduleTitle;
    }

    public String getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }
}
