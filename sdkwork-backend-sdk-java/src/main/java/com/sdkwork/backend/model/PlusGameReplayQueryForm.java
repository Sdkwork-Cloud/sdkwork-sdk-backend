package com.sdkwork.backend.model;

public class PlusGameReplayQueryForm {
    private Integer id;
    private String createdAtFrom;
    private String createdAtTo;
    private Integer roomId;
    private Integer matchId;
    private String gameType;
    private String roomType;
    private String gameModeCode;
    private String seasonKey;
    private Integer clubId;
    private Integer tournamentId;
    private String regionCode;
    private Integer ownerUserId;
    private String titleLike;
    private String status;
    private Boolean publicVisible;
    private Boolean allowShare;

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

    public Integer getRoomId() {
        return this.roomId;
    }
    
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getMatchId() {
        return this.matchId;
    }
    
    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public String getGameType() {
        return this.gameType;
    }
    
    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getRoomType() {
        return this.roomType;
    }
    
    public void setRoomType(String roomType) {
        this.roomType = roomType;
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

    public Integer getOwnerUserId() {
        return this.ownerUserId;
    }
    
    public void setOwnerUserId(Integer ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public String getTitleLike() {
        return this.titleLike;
    }
    
    public void setTitleLike(String titleLike) {
        this.titleLike = titleLike;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getPublicVisible() {
        return this.publicVisible;
    }
    
    public void setPublicVisible(Boolean publicVisible) {
        this.publicVisible = publicVisible;
    }

    public Boolean getAllowShare() {
        return this.allowShare;
    }
    
    public void setAllowShare(Boolean allowShare) {
        this.allowShare = allowShare;
    }
}
