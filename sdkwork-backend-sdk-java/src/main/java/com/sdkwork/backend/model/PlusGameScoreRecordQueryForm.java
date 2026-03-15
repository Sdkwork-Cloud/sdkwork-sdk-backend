package com.sdkwork.backend.model;

public class PlusGameScoreRecordQueryForm {
    private Integer id;
    private String createdAtFrom;
    private String createdAtTo;
    private Integer userId;
    private String gameType;
    private String changeType;
    private Integer tournamentId;
    private Integer roomId;
    private Integer matchId;
    private Integer leaderboardId;
    private String bizNo;
    private Integer operatorUserId;

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

    public String getGameType() {
        return this.gameType;
    }
    
    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getChangeType() {
        return this.changeType;
    }
    
    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public Integer getTournamentId() {
        return this.tournamentId;
    }
    
    public void setTournamentId(Integer tournamentId) {
        this.tournamentId = tournamentId;
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

    public Integer getLeaderboardId() {
        return this.leaderboardId;
    }
    
    public void setLeaderboardId(Integer leaderboardId) {
        this.leaderboardId = leaderboardId;
    }

    public String getBizNo() {
        return this.bizNo;
    }
    
    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    public Integer getOperatorUserId() {
        return this.operatorUserId;
    }
    
    public void setOperatorUserId(Integer operatorUserId) {
        this.operatorUserId = operatorUserId;
    }
}
