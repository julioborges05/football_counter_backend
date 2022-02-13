package main.Entity;

import main.DTO.MatchDTO;
import main.DTO.MatchStatisticDTO;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "teams_v_matches")
public class MatchStatisticEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "match_id")
    private MatchEntity matchDTO;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private TeamEntity teamDTO;

    @ManyToOne
    @JoinColumn(name = "property_id")
    private PropertyEntity propertyDTO;

    private int propertyValue;
    private Date createdAt;

    public MatchStatisticEntity() {
    }

    public MatchStatisticEntity(Long id, MatchEntity matchDTO, TeamEntity teamDTO, PropertyEntity propertyDTO, int propertyValue, Date createdAt) {
        this.id = id;
        this.matchDTO = matchDTO;
        this.teamDTO = teamDTO;
        this.propertyDTO = propertyDTO;
        this.propertyValue = propertyValue;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MatchEntity getMatchDTO() {
        return matchDTO;
    }

    public void setMatchDTO(MatchEntity matchDTO) {
        this.matchDTO = matchDTO;
    }

    public TeamEntity getTeamDTO() {
        return teamDTO;
    }

    public void setTeamDTO(TeamEntity teamDTO) {
        this.teamDTO = teamDTO;
    }

    public PropertyEntity getPropertyDTO() {
        return propertyDTO;
    }

    public void setPropertyDTO(PropertyEntity propertyDTO) {
        this.propertyDTO = propertyDTO;
    }

    public int getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(int propertyValue) {
        this.propertyValue = propertyValue;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public static MatchStatisticEntity convert(MatchStatisticDTO matchStatisticDTO) {
        return new MatchStatisticEntity(
                matchStatisticDTO.getId(),
                MatchEntity.convert(matchStatisticDTO.getMatchDTO()),
                TeamEntity.convert(matchStatisticDTO.getTeamDTO()),
                PropertyEntity.convert(matchStatisticDTO.getPropertyDTO()),
                matchStatisticDTO.getPropertyValue(),
                matchStatisticDTO.getCreatedAt()
        );
    }
}
