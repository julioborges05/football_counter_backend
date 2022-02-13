package main.DTO;

import main.Entity.MatchStatisticEntity;

import java.util.Date;

public class MatchStatisticDTO {

    private Long id;
    private MatchDTO matchDTO;
    private TeamDTO teamDTO;
    private PropertyDTO propertyDTO;
    private int propertyValue;
    private Date createdAt;

    public MatchStatisticDTO() {
    }

    public MatchStatisticDTO(Long id, MatchDTO matchDTO, TeamDTO teamDTO, PropertyDTO propertyDTO, int propertyValue, Date createdAt) {
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

    public MatchDTO getMatchDTO() {
        return matchDTO;
    }

    public void setMatchDTO(MatchDTO matchDTO) {
        this.matchDTO = matchDTO;
    }

    public TeamDTO getTeamDTO() {
        return teamDTO;
    }

    public void setTeamDTO(TeamDTO teamDTO) {
        this.teamDTO = teamDTO;
    }

    public PropertyDTO getPropertyDTO() {
        return propertyDTO;
    }

    public void setPropertyDTO(PropertyDTO propertyDTO) {
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

    public static MatchStatisticDTO convert(MatchStatisticEntity matchStatisticEntity) {
        return new MatchStatisticDTO(
                matchStatisticEntity.getId(),
                MatchDTO.convert(matchStatisticEntity.getMatchDTO()),
                TeamDTO.convert(matchStatisticEntity.getTeamDTO()),
                PropertyDTO.convert(matchStatisticEntity.getPropertyDTO()),
                matchStatisticEntity.getPropertyValue(),
                matchStatisticEntity.getCreatedAt()
        );
    }
}
