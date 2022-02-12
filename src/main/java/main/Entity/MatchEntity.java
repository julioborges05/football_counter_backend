package main.Entity;

import main.DTO.MatchDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "matches")
public class MatchEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String stadium;
    private Date dateTime;
    private String championship;

    public MatchEntity() {
    }

    public MatchEntity(Long id, String stadium, Date dateTime, String championship) {
        this.id = id;
        this.stadium = stadium;
        this.dateTime = dateTime;
        this.championship = championship;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getChampionship() {
        return championship;
    }

    public void setChampionship(String championship) {
        this.championship = championship;
    }

    public static MatchEntity convert(MatchDTO matchDTO) {
        return new MatchEntity(matchDTO.getId(), matchDTO.getStadium(), matchDTO.getDateTime(),
                matchDTO.getChampionship());
    }
}
