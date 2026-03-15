package com.sdkwork.backend.model;

public class PlusGameRoomSeatManageForm {
    private Integer userId;
    private String status;
    private String playerType;
    private String nicknameSnapshot;
    private String avatarUrl;
    private String joinSource;
    private Integer teamNo;
    private Boolean ready;
    private Boolean trusteeship;
    private Boolean spectator;
    private Integer roomScore;
    private Integer chips;
    private Integer eliminatedRankNo;

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getPlayerType() {
        return this.playerType;
    }
    
    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public String getNicknameSnapshot() {
        return this.nicknameSnapshot;
    }
    
    public void setNicknameSnapshot(String nicknameSnapshot) {
        this.nicknameSnapshot = nicknameSnapshot;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }
    
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getJoinSource() {
        return this.joinSource;
    }
    
    public void setJoinSource(String joinSource) {
        this.joinSource = joinSource;
    }

    public Integer getTeamNo() {
        return this.teamNo;
    }
    
    public void setTeamNo(Integer teamNo) {
        this.teamNo = teamNo;
    }

    public Boolean getReady() {
        return this.ready;
    }
    
    public void setReady(Boolean ready) {
        this.ready = ready;
    }

    public Boolean getTrusteeship() {
        return this.trusteeship;
    }
    
    public void setTrusteeship(Boolean trusteeship) {
        this.trusteeship = trusteeship;
    }

    public Boolean getSpectator() {
        return this.spectator;
    }
    
    public void setSpectator(Boolean spectator) {
        this.spectator = spectator;
    }

    public Integer getRoomScore() {
        return this.roomScore;
    }
    
    public void setRoomScore(Integer roomScore) {
        this.roomScore = roomScore;
    }

    public Integer getChips() {
        return this.chips;
    }
    
    public void setChips(Integer chips) {
        this.chips = chips;
    }

    public Integer getEliminatedRankNo() {
        return this.eliminatedRankNo;
    }
    
    public void setEliminatedRankNo(Integer eliminatedRankNo) {
        this.eliminatedRankNo = eliminatedRankNo;
    }
}
