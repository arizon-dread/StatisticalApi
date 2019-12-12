package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public class EntityTypeJson {

    @JsonProperty
    private long id;
    @JsonProperty
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

