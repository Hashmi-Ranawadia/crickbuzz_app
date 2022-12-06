package com.example.crickbuzz_clone.model_class;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class typeMatches {
    private String matchType;
    List<seriesMatches> seriesMatches;

    @SerializedName("typeMatches")
    typeMatches[] typeMatches;

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public List<com.example.crickbuzz_clone.model_class.seriesMatches> getSeriesMatches() {
        return seriesMatches;
    }

    public void setSeriesMatches(List<com.example.crickbuzz_clone.model_class.seriesMatches> seriesMatches) {
        this.seriesMatches = seriesMatches;
    }

    public com.example.crickbuzz_clone.model_class.typeMatches[] getTypeMatches() {
        return typeMatches;
    }

    public void setTypeMatches(com.example.crickbuzz_clone.model_class.typeMatches[] typeMatches) {
        this.typeMatches = typeMatches;
    }
}
