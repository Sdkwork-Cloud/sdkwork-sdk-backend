package com.sdkwork.backend.model;

public class PlusGameRoomSeatVO {
    private String createdAt;
    private String updatedAt;
    private Integer seatId;
    private Integer roomId;
    private Integer definitionId;
    private String gameType;
    private Integer userId;
    private Integer seatNo;
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
    private String joinedAt;
    private String eliminatedAt;
    private String leftAt;
    private Map<String, Object> handSnapshot;

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getSeatId() {
        return this.seatId;
    }
    
    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public Integer getRoomId() {
        return this.roomId;
    }
    
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
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

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSeatNo() {
        return this.seatNo;
    }
    
    public void setSeatNo(Integer seatNo) {
        this.seatNo = seatNo;
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

    public String getJoinedAt() {
        return this.joinedAt;
    }
    
    public void setJoinedAt(String joinedAt) {
        this.joinedAt = joinedAt;
    }

    public String getEliminatedAt() {
        return this.eliminatedAt;
    }
    
    public void setEliminatedAt(String eliminatedAt) {
        this.eliminatedAt = eliminatedAt;
    }

    public String getLeftAt() {
        return this.leftAt;
    }
    
    public void setLeftAt(String leftAt) {
        this.leftAt = leftAt;
    }

    public Map<String, Object> getHandSnapshot() {
        return this.handSnapshot;
    }
    
    public void setHandSnapshot(Map<String, Object> handSnapshot) {
        this.handSnapshot = handSnapshot;
    }
}
