package main.DTO;

import main.Entity.TeamEntity;

public class TeamDTO {

    private Long id;
    private String name;
    private String category;
    private String iconPath;

    public TeamDTO() {
    }

    public TeamDTO(Long id, String name, String category, String iconPath) {
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

    public static TeamDTO convert(TeamEntity teamEntity) {
        return new TeamDTO(teamEntity.getId(), teamEntity.getName(), teamEntity.getCategory(), teamEntity.getIconPath());
    }
}
