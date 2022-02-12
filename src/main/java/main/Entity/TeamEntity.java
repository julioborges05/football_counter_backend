package main.Entity;

import main.DTO.TeamDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "teams")
public class TeamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private String iconPath;

    public TeamEntity() {
    }

    public TeamEntity(Long id, String name, String category, String iconPath) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.iconPath = iconPath;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }

    public static TeamEntity convert(TeamDTO teamDTO){
        return new TeamEntity(teamDTO.getId(), teamDTO.getName(), teamDTO.getCategory(), teamDTO.getIconPath());
    }
}
