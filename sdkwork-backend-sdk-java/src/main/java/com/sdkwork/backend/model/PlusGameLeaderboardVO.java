package com.sdkwork.backend.model;

public class PlusGameLeaderboardVO {
    private String createdAt;
    private String updatedAt;
    private Integer leaderboardId;
    private String leaderboardNo;
    private String name;
    private String shortName;
    private String gameType;
    private String gameModeCode;
    private String rankingType;
    private String periodType;
    private String scopeType;
    private Integer scopeOwnerId;
    private String scopeName;
    private String seasonKey;
    private Integer clubId;
    private Integer tournamentId;
    private String regionCode;
    private String status;
    private Boolean rankedOnly;
    private Boolean includeFriendRoom;
    private Boolean includeTournamentRoom;
    private Boolean includeClubRoom;
    private Integer minMatchCount;
    private Integer minWinRateMatchCount;
    private Integer totalParticipantCount;
    private String periodStartAt;
    private String periodEndAt;
    private String publishedAt;
    private String settledAt;
    private List<PlusGameLeaderboardEntryVO> entries;

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

    public Integer getLeaderboardId() {
        return this.leaderboardId;
    }
    
    public void setLeaderboardId(Integer leaderboardId) {
        this.leaderboardId = leaderboardId;
    }

    public String getLeaderboardNo() {
        return this.leaderboardNo;
    }
    
    public void setLeaderboardNo(String leaderboardNo) {
        this.leaderboardNo = leaderboardNo;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return this.shortName;
    }
    
    public void setShortName(String shortName) {
        this.shortName = shortName;
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

    public String getRankingType() {
        return this.rankingType;
    }
    
    public void setRankingType(String rankingType) {
        this.rankingType = rankingType;
    }

    public String getPeriodType() {
        return this.periodType;
    }
    
    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public String getScopeType() {
        return this.scopeType;
    }
    
    public void setScopeType(String scopeType) {
        this.scopeType = scopeType;
    }

    public Integer getScopeOwnerId() {
        return this.scopeOwnerId;
    }
    
    public void setScopeOwnerId(Integer scopeOwnerId) {
        this.scopeOwnerId = scopeOwnerId;
    }

    public String getScopeName() {
        return this.scopeName;
    }
    
    public void setScopeName(String scopeName) {
        this.scopeName = scopeName;
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

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getRankedOnly() {
        return this.rankedOnly;
    }
    
    public void setRankedOnly(Boolean rankedOnly) {
        this.rankedOnly = rankedOnly;
    }

    public Boolean getIncludeFriendRoom() {
        return this.includeFriendRoom;
    }
    
    public void setIncludeFriendRoom(Boolean includeFriendRoom) {
        this.includeFriendRoom = includeFriendRoom;
    }

    public Boolean getIncludeTournamentRoom() {
        return this.includeTournamentRoom;
    }
    
    public void setIncludeTournamentRoom(Boolean includeTournamentRoom) {
        this.includeTournamentRoom = includeTournamentRoom;
    }

    public Boolean getIncludeClubRoom() {
        return this.includeClubRoom;
    }
    
    public void setIncludeClubRoom(Boolean includeClubRoom) {
        this.includeClubRoom = includeClubRoom;
    }

    public Integer getMinMatchCount() {
        return this.minMatchCount;
    }
    
    public void setMinMatchCount(Integer minMatchCount) {
        this.minMatchCount = minMatchCount;
    }

    public Integer getMinWinRateMatchCount() {
        return this.minWinRateMatchCount;
    }
    
    public void setMinWinRateMatchCount(Integer minWinRateMatchCount) {
        this.minWinRateMatchCount = minWinRateMatchCount;
    }

    public Integer getTotalParticipantCount() {
        return this.totalParticipantCount;
    }
    
    public void setTotalParticipantCount(Integer totalParticipantCount) {
        this.totalParticipantCount = totalParticipantCount;
    }

    public String getPeriodStartAt() {
        return this.periodStartAt;
    }
    
    public void setPeriodStartAt(String periodStartAt) {
        this.periodStartAt = periodStartAt;
    }

    public String getPeriodEndAt() {
        return this.periodEndAt;
    }
    
    public void setPeriodEndAt(String periodEndAt) {
        this.periodEndAt = periodEndAt;
    }

    public String getPublishedAt() {
        return this.publishedAt;
    }
    
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getSettledAt() {
        return this.settledAt;
    }
    
    public void setSettledAt(String settledAt) {
        this.settledAt = settledAt;
    }

    public List<PlusGameLeaderboardEntryVO> getEntries() {
        return this.entries;
    }
    
    public void setEntries(List<PlusGameLeaderboardEntryVO> entries) {
        this.entries = entries;
    }
}
