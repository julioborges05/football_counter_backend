package main.DTO;

import main.Entity.MatchEntity;

import java.util.Date;

public class MatchDTO {

    private Long id;
    private String stadium;
    private Date dateTime;
    private String championship;

    public MatchDTO() {
    }

    public MatchDTO(Long id, String stadium, Date dateTime, String championship) {
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

    public static MatchDTO convert(MatchEntity matchEntity) {
        return new MatchDTO(matchEntity.getId(), matchEntity.getStadium(), matchEntity.getDateTime(),
                matchEntity.getChampionship());
    }
}
