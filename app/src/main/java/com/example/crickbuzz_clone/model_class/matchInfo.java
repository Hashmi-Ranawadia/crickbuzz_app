package com.example.crickbuzz_clone.model_class;

public class matchInfo {

    private int matchId;
    private int seriesId;
    private String seriesName;
    private String matchDesc;
    private String matchFormat;
    private String startDate;
    private String endDate;
    private String state;
    private String status;
    team1 team1;
    team2 team2;
    venueInfo venueInfo;
    private String seriesStartDt;
    private String seriesEndDt;
    private boolean isTimeAnnounced;
    private String stateTitle;
    private boolean isFantasyEnabled;



    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public int getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(int seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getMatchDesc() {
        return matchDesc;
    }

    public void setMatchDesc(String matchDesc) {
        this.matchDesc = matchDesc;
    }

    public String getMatchFormat() {
        return matchFormat;
    }

    public void setMatchFormat(String matchFormat) {
        this.matchFormat = matchFormat;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public com.example.crickbuzz_clone.model_class.team1 getTeam1() {
        return team1;
    }

    public void setTeam1(com.example.crickbuzz_clone.model_class.team1 team1) {
        this.team1 = team1;
    }

    public com.example.crickbuzz_clone.model_class.team2 getTeam2() {
        return team2;
    }

    public void setTeam2(com.example.crickbuzz_clone.model_class.team2 team2) {
        this.team2 = team2;
    }

    public com.example.crickbuzz_clone.model_class.venueInfo getVenueInfo() {
        return venueInfo;
    }

    public void setVenueInfo(com.example.crickbuzz_clone.model_class.venueInfo venueInfo) {
        this.venueInfo = venueInfo;
    }

    public String getSeriesStartDt() {
        return seriesStartDt;
    }

    public void setSeriesStartDt(String seriesStartDt) {
        this.seriesStartDt = seriesStartDt;
    }

    public String getSeriesEndDt() {
        return seriesEndDt;
    }

    public void setSeriesEndDt(String seriesEndDt) {
        this.seriesEndDt = seriesEndDt;
    }

    public boolean isTimeAnnounced() {
        return isTimeAnnounced;
    }

    public void setTimeAnnounced(boolean timeAnnounced) {
        isTimeAnnounced = timeAnnounced;
    }

    public String getStateTitle() {
        return stateTitle;
    }

    public void setStateTitle(String stateTitle) {
        this.stateTitle = stateTitle;
    }

    public boolean isFantasyEnabled() {
        return isFantasyEnabled;
    }

    public void setFantasyEnabled(boolean fantasyEnabled) {
        isFantasyEnabled = fantasyEnabled;
    }
}
