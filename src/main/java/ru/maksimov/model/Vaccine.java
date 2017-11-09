package ru.maksimov.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by iMac on 09.11.2017.
 */
@Entity
public class Vaccine {
    @Id
    @GeneratedValue
    private Integer id;
    private String drag;
    private Integer compliance;
    private Date date;

    public Vaccine() {
    }

    public Vaccine(Integer id, String drag, Integer compliance, Date date) {
        this.id = id;
        this.drag = drag;
        this.compliance = compliance;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDrag() {
        return drag;
    }

    public void setDrag(String drag) {
        this.drag = drag;
    }

    public Integer getCompliance() {
        return compliance;
    }

    public void setCompliance(Integer compliance) {
        this.compliance = compliance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Vaccine{" +
                "id=" + id +
                ", drag='" + drag + '\'' +
                ", compliance=" + compliance +
                ", date=" + date +
                '}';
    }
}
