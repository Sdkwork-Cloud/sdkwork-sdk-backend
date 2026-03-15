package com.sdkwork.backend.model;

public class PlusGameTournamentBatchArrangeForm {
    private List<Integer> userIds;
    private List<PlusGameTournamentBatchArrangePlayerForm> arrangePlayers;
    private Integer seedNoStart;
    private Integer teamNoStart;
    private Integer groupSize;
    private Boolean overwriteExistingSeedNo;
    private Boolean overwriteExistingTeamNo;

    public List<Integer> getUserIds() {
        return this.userIds;
    }
    
    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }

    public List<PlusGameTournamentBatchArrangePlayerForm> getArrangePlayers() {
        return this.arrangePlayers;
    }
    
    public void setArrangePlayers(List<PlusGameTournamentBatchArrangePlayerForm> arrangePlayers) {
        this.arrangePlayers = arrangePlayers;
    }

    public Integer getSeedNoStart() {
        return this.seedNoStart;
    }
    
    public void setSeedNoStart(Integer seedNoStart) {
        this.seedNoStart = seedNoStart;
    }

    public Integer getTeamNoStart() {
        return this.teamNoStart;
    }
    
    public void setTeamNoStart(Integer teamNoStart) {
        this.teamNoStart = teamNoStart;
    }

    public Integer getGroupSize() {
        return this.groupSize;
    }
    
    public void setGroupSize(Integer groupSize) {
        this.groupSize = groupSize;
    }

    public Boolean getOverwriteExistingSeedNo() {
        return this.overwriteExistingSeedNo;
    }
    
    public void setOverwriteExistingSeedNo(Boolean overwriteExistingSeedNo) {
        this.overwriteExistingSeedNo = overwriteExistingSeedNo;
    }

    public Boolean getOverwriteExistingTeamNo() {
        return this.overwriteExistingTeamNo;
    }
    
    public void setOverwriteExistingTeamNo(Boolean overwriteExistingTeamNo) {
        this.overwriteExistingTeamNo = overwriteExistingTeamNo;
    }
}
