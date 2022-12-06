package com.example.crickbuzz_clone.model_class;

import java.util.List;

public class seriesAdWrapper {

    private String seriesName;
    List<matches> matches;

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public List<com.example.crickbuzz_clone.model_class.matches> getMatches() {
        return matches;
    }

    public void setMatches(List<com.example.crickbuzz_clone.model_class.matches> matches) {
        this.matches = matches;
    }
}
