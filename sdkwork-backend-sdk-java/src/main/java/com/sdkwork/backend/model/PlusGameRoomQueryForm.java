package com.sdkwork.backend.model;

public class PlusGameRoomQueryForm {
    private Integer id;
    private String createdAtFrom;
    private String createdAtTo;
    private Integer userId;
    private Integer definitionId;
    private String gameType;
    private String gameModeCode;
    private String seasonKey;
    private String roomNo;
    private String roomNoLike;
    private String nameLike;
    private String roomType;
    private String status;
    private String visibility;
    private Boolean ranked;
    private Boolean allowSpectator;
    private Boolean leaderboardEligible;
    private Boolean replayEnabled;
    private Integer clubId;
    private Integer tournamentId;
    private String regionCode;
    private Integer currentMatchId;

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

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDefinitionId() {
        return this.definitionId;
    }
    
    public void setDefinitionId(Integer definitionId) {
        this.definitionId = definitionId;
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

    public String getRoomNo() {
        return this.roomNo;
    }
    
    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomNoLike() {
        return this.roomNoLike;
    }
    
    public void setRoomNoLike(String roomNoLike) {
        this.roomNoLike = roomNoLike;
    }

    public String getNameLike() {
        return this.nameLike;
    }
    
    public void setNameLike(String nameLike) {
        this.nameLike = nameLike;
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

    public String getVisibility() {
        return this.visibility;
    }
    
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public Boolean getRanked() {
        return this.ranked;
    }
    
    public void setRanked(Boolean ranked) {
        this.ranked = ranked;
    }

    public Boolean getAllowSpectator() {
        return this.allowSpectator;
    }
    
    public void setAllowSpectator(Boolean allowSpectator) {
        this.allowSpectator = allowSpectator;
    }

    public Boolean getLeaderboardEligible() {
        return this.leaderboardEligible;
    }
    
    public void setLeaderboardEligible(Boolean leaderboardEligible) {
        this.leaderboardEligible = leaderboardEligible;
    }

    public Boolean getReplayEnabled() {
        return this.replayEnabled;
    }
    
    public void setReplayEnabled(Boolean replayEnabled) {
        this.replayEnabled = replayEnabled;
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

    public Integer getCurrentMatchId() {
        return this.currentMatchId;
    }
    
    public void setCurrentMatchId(Integer currentMatchId) {
        this.currentMatchId = currentMatchId;
    }
}
