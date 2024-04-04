package me.dio.sdw2024.domain.model;

public class ChampionsTradicional {
private long id;
    private String name;
    private String role;
    private String lore;
    private String imageUrl;

    public ChampionsTradicional(long id, String name, String role, String lore, String imageUrl) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.lore = lore;
        this.imageUrl = imageUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
