package com.sdkwork.backend.model;

public class PlusGameRecordVO {
    private String createdAt;
    private String updatedAt;
    private Integer recordId;
    private Integer roomId;
    private Integer matchId;
    private Integer userId;
    private String gameType;
    private String gameModeCode;
    private String seasonKey;
    private Integer clubId;
    private Integer tournamentId;
    private String regionCode;
    private Integer seatNo;
    private Integer teamNo;
    private String resultType;
    private Integer rankNo;
    private String nicknameSnapshot;
    private String avatarUrl;
    private Boolean winner;
    private Boolean escaped;
    private Boolean leaderboardEligible;
    private Integer actionCount;
    private Integer moveCount;
    private Integer scoreBefore;
    private Integer scoreDelta;
    private Integer scoreAfter;
    private Integer ratingBefore;
    private Integer ratingDelta;
    private Integer ratingAfter;
    private Integer chipsBefore;
    private Integer chipsDelta;
    private Integer chipsAfter;
    private String joinedAt;
    private String finishedAt;
    private Integer bestRankSnapshot;
    private Map<String, Object> settlementData;
    private Map<String, Object> honorSnapshot;

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

    public Integer getRecordId() {
        return this.recordId;
    }
    
    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
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

    public Integer getSeatNo() {
        return this.seatNo;
    }
    
    public void setSeatNo(Integer seatNo) {
        this.seatNo = seatNo;
    }

    public Integer getTeamNo() {
        return this.teamNo;
    }
    
    public void setTeamNo(Integer teamNo) {
        this.teamNo = teamNo;
    }

    public String getResultType() {
        return this.resultType;
    }
    
    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public Integer getRankNo() {
        return this.rankNo;
    }
    
    public void setRankNo(Integer rankNo) {
        this.rankNo = rankNo;
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

    public Boolean getWinner() {
        return this.winner;
    }
    
    public void setWinner(Boolean winner) {
        this.winner = winner;
    }

    public Boolean getEscaped() {
        return this.escaped;
    }
    
    public void setEscaped(Boolean escaped) {
        this.escaped = escaped;
    }

    public Boolean getLeaderboardEligible() {
        return this.leaderboardEligible;
    }
    
    public void setLeaderboardEligible(Boolean leaderboardEligible) {
        this.leaderboardEligible = leaderboardEligible;
    }

    public Integer getActionCount() {
        return this.actionCount;
    }
    
    public void setActionCount(Integer actionCount) {
        this.actionCount = actionCount;
    }

    public Integer getMoveCount() {
        return this.moveCount;
    }
    
    public void setMoveCount(Integer moveCount) {
        this.moveCount = moveCount;
    }

    public Integer getScoreBefore() {
        return this.scoreBefore;
    }
    
    public void setScoreBefore(Integer scoreBefore) {
        this.scoreBefore = scoreBefore;
    }

    public Integer getScoreDelta() {
        return this.scoreDelta;
    }
    
    public void setScoreDelta(Integer scoreDelta) {
        this.scoreDelta = scoreDelta;
    }

    public Integer getScoreAfter() {
        return this.scoreAfter;
    }
    
    public void setScoreAfter(Integer scoreAfter) {
        this.scoreAfter = scoreAfter;
    }

    public Integer getRatingBefore() {
        return this.ratingBefore;
    }
    
    public void setRatingBefore(Integer ratingBefore) {
        this.ratingBefore = ratingBefore;
    }

    public Integer getRatingDelta() {
        return this.ratingDelta;
    }
    
    public void setRatingDelta(Integer ratingDelta) {
        this.ratingDelta = ratingDelta;
    }

    public Integer getRatingAfter() {
        return this.ratingAfter;
    }
    
    public void setRatingAfter(Integer ratingAfter) {
        this.ratingAfter = ratingAfter;
    }

    public Integer getChipsBefore() {
        return this.chipsBefore;
    }
    
    public void setChipsBefore(Integer chipsBefore) {
        this.chipsBefore = chipsBefore;
    }

    public Integer getChipsDelta() {
        return this.chipsDelta;
    }
    
    public void setChipsDelta(Integer chipsDelta) {
        this.chipsDelta = chipsDelta;
    }

    public Integer getChipsAfter() {
        return this.chipsAfter;
    }
    
    public void setChipsAfter(Integer chipsAfter) {
        this.chipsAfter = chipsAfter;
    }

    public String getJoinedAt() {
        return this.joinedAt;
    }
    
    public void setJoinedAt(String joinedAt) {
        this.joinedAt = joinedAt;
    }

    public String getFinishedAt() {
        return this.finishedAt;
    }
    
    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public Integer getBestRankSnapshot() {
        return this.bestRankSnapshot;
    }
    
    public void setBestRankSnapshot(Integer bestRankSnapshot) {
        this.bestRankSnapshot = bestRankSnapshot;
    }

    public Map<String, Object> getSettlementData() {
        return this.settlementData;
    }
    
    public void setSettlementData(Map<String, Object> settlementData) {
        this.settlementData = settlementData;
    }

    public Map<String, Object> getHonorSnapshot() {
        return this.honorSnapshot;
    }
    
    public void setHonorSnapshot(Map<String, Object> honorSnapshot) {
        this.honorSnapshot = honorSnapshot;
    }
}
