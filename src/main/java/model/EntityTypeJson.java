package model;

import com.fasterxml.jackson.annotation.JsonValue;

public class EntityTypeJson {

    @JsonValue
    private long id;
    @JsonValue
    private String unit;

    public EntityTypeJson(String unit){
        this.setUnit(unit);
    }

    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}

