package entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuerPerHour;
    private Integer hour;

    public HourContract(){
    }

    public HourContract(Date date, Double valuerPerHour, Integer hour) {
        this.date = date;
        this.valuerPerHour = valuerPerHour;
        this.hour = hour;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuerPerHour() {
        return valuerPerHour;
    }

    public void setValuerPerHour(Double valuerPerHour) {
        this.valuerPerHour = valuerPerHour;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Double totalValue(){
        return hour*valuerPerHour;
    }
}
