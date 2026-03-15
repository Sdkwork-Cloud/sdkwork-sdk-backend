package com.sdkwork.backend.model;

public class PlusGameActionRecordVO {
    private String createdAt;
    private String updatedAt;
    private Integer actionId;
    private Integer roomId;
    private Integer matchId;
    private Integer roundId;
    private String gameType;
    private String roomType;
    private Integer replayId;
    private Integer tournamentId;
    private Integer playerUserId;
    private Integer seatNo;
    private String playerType;
    private Integer seqNo;
    private Integer turnNo;
    private String phaseName;
    private String actionType;
    private String actionCode;
    private String notation;
    private Integer targetSeatNo;
    private String sourcePosition;
    private String targetPosition;
    private Integer consumeMillis;
    private Boolean validAction;
    private Boolean systemAction;
    private Boolean timeoutAction;
    private String actionAt;
    private Map<String, Object> actionPayload;
    private Map<String, Object> beforeState;
    private Map<String, Object> afterState;

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

    public Integer getActionId() {
        return this.actionId;
    }
    
    public void setActionId(Integer actionId) {
        this.actionId = actionId;
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

    public Integer getRoundId() {
        return this.roundId;
    }
    
    public void setRoundId(Integer roundId) {
        this.roundId = roundId;
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

    public Integer getReplayId() {
        return this.replayId;
    }
    
    public void setReplayId(Integer replayId) {
        this.replayId = replayId;
    }

    public Integer getTournamentId() {
        return this.tournamentId;
    }
    
    public void setTournamentId(Integer tournamentId) {
        this.tournamentId = tournamentId;
    }

    public Integer getPlayerUserId() {
        return this.playerUserId;
    }
    
    public void setPlayerUserId(Integer playerUserId) {
        this.playerUserId = playerUserId;
    }

    public Integer getSeatNo() {
        return this.seatNo;
    }
    
    public void setSeatNo(Integer seatNo) {
        this.seatNo = seatNo;
    }

    public String getPlayerType() {
        return this.playerType;
    }
    
    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public Integer getSeqNo() {
        return this.seqNo;
    }
    
    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    public Integer getTurnNo() {
        return this.turnNo;
    }
    
    public void setTurnNo(Integer turnNo) {
        this.turnNo = turnNo;
    }

    public String getPhaseName() {
        return this.phaseName;
    }
    
    public void setPhaseName(String phaseName) {
        this.phaseName = phaseName;
    }

    public String getActionType() {
        return this.actionType;
    }
    
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionCode() {
        return this.actionCode;
    }
    
    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public String getNotation() {
        return this.notation;
    }
    
    public void setNotation(String notation) {
        this.notation = notation;
    }

    public Integer getTargetSeatNo() {
        return this.targetSeatNo;
    }
    
    public void setTargetSeatNo(Integer targetSeatNo) {
        this.targetSeatNo = targetSeatNo;
    }

    public String getSourcePosition() {
        return this.sourcePosition;
    }
    
    public void setSourcePosition(String sourcePosition) {
        this.sourcePosition = sourcePosition;
    }

    public String getTargetPosition() {
        return this.targetPosition;
    }
    
    public void setTargetPosition(String targetPosition) {
        this.targetPosition = targetPosition;
    }

    public Integer getConsumeMillis() {
        return this.consumeMillis;
    }
    
    public void setConsumeMillis(Integer consumeMillis) {
        this.consumeMillis = consumeMillis;
    }

    public Boolean getValidAction() {
        return this.validAction;
    }
    
    public void setValidAction(Boolean validAction) {
        this.validAction = validAction;
    }

    public Boolean getSystemAction() {
        return this.systemAction;
    }
    
    public void setSystemAction(Boolean systemAction) {
        this.systemAction = systemAction;
    }

    public Boolean getTimeoutAction() {
        return this.timeoutAction;
    }
    
    public void setTimeoutAction(Boolean timeoutAction) {
        this.timeoutAction = timeoutAction;
    }

    public String getActionAt() {
        return this.actionAt;
    }
    
    public void setActionAt(String actionAt) {
        this.actionAt = actionAt;
    }

    public Map<String, Object> getActionPayload() {
        return this.actionPayload;
    }
    
    public void setActionPayload(Map<String, Object> actionPayload) {
        this.actionPayload = actionPayload;
    }

    public Map<String, Object> getBeforeState() {
        return this.beforeState;
    }
    
    public void setBeforeState(Map<String, Object> beforeState) {
        this.beforeState = beforeState;
    }

    public Map<String, Object> getAfterState() {
        return this.afterState;
    }
    
    public void setAfterState(Map<String, Object> afterState) {
        this.afterState = afterState;
    }
}
