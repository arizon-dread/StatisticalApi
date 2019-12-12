package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Set;

public class CallerJson {

    @JsonProperty
    String callerName;

    @JsonProperty
    Set<EntityTypeJson> entityTypes;

    @JsonProperty
    String callerAddress;

    public String getCallerName() {
        return callerName;
    }

    public void setCallerName(String callerName) {
        this.callerName = callerName;
    }

    public Set<EntityTypeJson> getEntityTypes() {
        return entityTypes;
    }

    public void setEntityTypes(Set<EntityTypeJson> entityTypes) {
        this.entityTypes = entityTypes;
    }

    public String getCallerAddress() {
        return callerAddress;
    }

    public void setCallerAddress(String callerAddress) {
        this.callerAddress = callerAddress;
    }
}
