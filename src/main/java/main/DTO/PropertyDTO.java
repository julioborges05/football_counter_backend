package main.DTO;

import main.Entity.PropertyEntity;

import java.util.Date;

public class PropertyDTO {

    private Long id;
    private String name;
    private boolean isEnabled;
    private Date createdAt;
    private boolean isDefault;

    public PropertyDTO() {
    }

    public PropertyDTO(Long id, String name, boolean isEnabled, Date createdAt, boolean isDefault) {
        this.id = id;
        this.name = name;
        this.isEnabled = isEnabled;
        this.createdAt = createdAt;
        this.isDefault = isDefault;
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

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public static PropertyDTO convert(PropertyEntity propertyEntity) {
        return new PropertyDTO(propertyEntity.getId(), propertyEntity.getName(), propertyEntity.isEnabled(),
                propertyEntity.getCreatedAt(), propertyEntity.isDefault());
    }
}
