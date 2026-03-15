package com.sdkwork.backend.model;

public class PlusGameTournamentBatchStatusForm {
    private List<Integer> userIds;
    private List<PlusGameTournamentBatchStatusPlayerForm> playerItems;
    private String status;
    private Integer startRankNo;

    public List<Integer> getUserIds() {
        return this.userIds;
    }
    
    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }

    public List<PlusGameTournamentBatchStatusPlayerForm> getPlayerItems() {
        return this.playerItems;
    }
    
    public void setPlayerItems(List<PlusGameTournamentBatchStatusPlayerForm> playerItems) {
        this.playerItems = playerItems;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getStartRankNo() {
        return this.startRankNo;
    }
    
    public void setStartRankNo(Integer startRankNo) {
        this.startRankNo = startRankNo;
    }
}
