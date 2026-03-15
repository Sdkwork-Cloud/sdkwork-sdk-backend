package com.sdkwork.backend.model;

public class PlusGameMatchQueryForm {
    private Integer id;
    private String createdAtFrom;
    private String createdAtTo;
    private Integer definitionId;
    private Integer roomId;
    private String gameType;
    private String gameModeCode;
    private String seasonKey;
    private String matchNo;
    private String matchNoLike;
    private String roomType;
    private String status;
    private Boolean ranked;
    private Integer clubId;
    private Integer tournamentId;
    private String regionCode;
    private Integer winnerUserId;
    private Integer replayId;
    private Boolean leaderboardEligible;
    private Boolean validForStats;
    private Boolean resultConfirmed;
    private Boolean abnormalFinished;

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreatedAtFrom() {
        return this.createdAtFrom;
    }
    
    public void setCreatedAtFrom(String createdAtFrom) {
        this.createdAtFrom = createdAtFrom;
    }

    public String getCreatedAtTo() {
        return this.createdAtTo;
    }
    
    public void setCreatedAtTo(String createdAtTo) {
        this.createdAtTo = createdAtTo;
    }

    public Integer getDefinitionId() {
        return this.definitionId;
    }
    
    public void setDefinitionId(Integer definitionId) {
        this.definitionId = definitionId;
    }

    public Integer getRoomId() {
        return this.roomId;
    }
    
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getGameType() {
        return this.gameType;
    }
    
    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getGameModeCode() {
        return this.gameModeCode;
    }
    
    public void setGameModeCode(String gameModeCode) {
        this.gameModeCode = gameModeCode;
    }

    public String getSeasonKey() {
        return this.seasonKey;
    }
    
    public void setSeasonKey(String seasonKey) {
        this.seasonKey = seasonKey;
    }

    public String getMatchNo() {
        return this.matchNo;
    }
    
    public void setMatchNo(String matchNo) {
        this.matchNo = matchNo;
    }

    public String getMatchNoLike() {
        return this.matchNoLike;
    }
    
    public void setMatchNoLike(String matchNoLike) {
        this.matchNoLike = matchNoLike;
    }

    public String getRoomType() {
        return this.roomType;
    }
    
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getRanked() {
        return this.ranked;
    }
    
    public void setRanked(Boolean ranked) {
        this.ranked = ranked;
    }

    public Integer getClubId() {
        return this.clubId;
    }
    
    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    public Integer getTournamentId() {
        return this.tournamentId;
    }
    
    public void setTournamentId(Integer tournamentId) {
        this.tournamentId = tournamentId;
    }

    public String getRegionCode() {
        return this.regionCode;
    }
    
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public Integer getWinnerUserId() {
        return this.winnerUserId;
    }
    
    public void setWinnerUserId(Integer winnerUserId) {
        this.winnerUserId = winnerUserId;
    }

    public Integer getReplayId() {
        return this.replayId;
    }
    
    public void setReplayId(Integer replayId) {
        this.replayId = replayId;
    }

    public Boolean getLeaderboardEligible() {
        return this.leaderboardEligible;
    }
    
    public void setLeaderboardEligible(Boolean leaderboardEligible) {
        this.leaderboardEligible = leaderboardEligible;
    }

    public Boolean getValidForStats() {
        return this.validForStats;
    }
    
    public void setValidForStats(Boolean validForStats) {
        this.validForStats = validForStats;
    }

    public Boolean getResultConfirmed() {
        return this.resultConfirmed;
    }
    
    public void setResultConfirmed(Boolean resultConfirmed) {
        this.resultConfirmed = resultConfirmed;
    }

    public Boolean getAbnormalFinished() {
        return this.abnormalFinished;
    }
    
    public void setAbnormalFinished(Boolean abnormalFinished) {
        this.abnormalFinished = abnormalFinished;
    }
}
