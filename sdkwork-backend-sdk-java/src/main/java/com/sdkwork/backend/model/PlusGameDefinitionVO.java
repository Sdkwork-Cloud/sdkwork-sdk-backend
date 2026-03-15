package com.sdkwork.backend.model;

public class PlusGameDefinitionVO {
    private String createdAt;
    private String updatedAt;
    private Integer definitionId;
    private String code;
    private String gameType;
    private String category;
    private String name;
    private String alias;
    private String gameModeCode;
    private String description;
    private String ruleSummary;
    private Integer minPlayers;
    private Integer maxPlayers;
    private Integer seatCount;
    private Integer teamCount;
    private Integer defaultRoundCount;
    private Boolean turnBased;
    private Boolean ranked;
    private Boolean supportsSpectator;
    private Boolean supportsTrusteeship;
    private Boolean supportsRobot;
    private Boolean supportsReplay;
    private Boolean supportsFriendRoom;
    private Boolean supportsTournament;
    private Boolean supportsClub;
    private Boolean supportsPractice;
    private Integer difficultyLevel;
    private String tutorialUrl;
    private String rankingType;
    private Map<String, Object> defaultRuleConfig;
    private Map<String, Object> metadata;
    private List<String> supportedLeaderboardPeriods;
    private Boolean enabled;

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

    public Integer getDefinitionId() {
        return this.definitionId;
    }
    
    public void setDefinitionId(Integer definitionId) {
        this.definitionId = definitionId;
    }

    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getGameType() {
        return this.gameType;
    }
    
    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return this.alias;
    }
    
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getGameModeCode() {
        return this.gameModeCode;
    }
    
    public void setGameModeCode(String gameModeCode) {
        this.gameModeCode = gameModeCode;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getRuleSummary() {
        return this.ruleSummary;
    }
    
    public void setRuleSummary(String ruleSummary) {
        this.ruleSummary = ruleSummary;
    }

    public Integer getMinPlayers() {
        return this.minPlayers;
    }
    
    public void setMinPlayers(Integer minPlayers) {
        this.minPlayers = minPlayers;
    }

    public Integer getMaxPlayers() {
        return this.maxPlayers;
    }
    
    public void setMaxPlayers(Integer maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public Integer getSeatCount() {
        return this.seatCount;
    }
    
    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }

    public Integer getTeamCount() {
        return this.teamCount;
    }
    
    public void setTeamCount(Integer teamCount) {
        this.teamCount = teamCount;
    }

    public Integer getDefaultRoundCount() {
        return this.defaultRoundCount;
    }
    
    public void setDefaultRoundCount(Integer defaultRoundCount) {
        this.defaultRoundCount = defaultRoundCount;
    }

    public Boolean getTurnBased() {
        return this.turnBased;
    }
    
    public void setTurnBased(Boolean turnBased) {
        this.turnBased = turnBased;
    }

    public Boolean getRanked() {
        return this.ranked;
    }
    
    public void setRanked(Boolean ranked) {
        this.ranked = ranked;
    }

    public Boolean getSupportsSpectator() {
        return this.supportsSpectator;
    }
    
    public void setSupportsSpectator(Boolean supportsSpectator) {
        this.supportsSpectator = supportsSpectator;
    }

    public Boolean getSupportsTrusteeship() {
        return this.supportsTrusteeship;
    }
    
    public void setSupportsTrusteeship(Boolean supportsTrusteeship) {
        this.supportsTrusteeship = supportsTrusteeship;
    }

    public Boolean getSupportsRobot() {
        return this.supportsRobot;
    }
    
    public void setSupportsRobot(Boolean supportsRobot) {
        this.supportsRobot = supportsRobot;
    }

    public Boolean getSupportsReplay() {
        return this.supportsReplay;
    }
    
    public void setSupportsReplay(Boolean supportsReplay) {
        this.supportsReplay = supportsReplay;
    }

    public Boolean getSupportsFriendRoom() {
        return this.supportsFriendRoom;
    }
    
    public void setSupportsFriendRoom(Boolean supportsFriendRoom) {
        this.supportsFriendRoom = supportsFriendRoom;
    }

    public Boolean getSupportsTournament() {
        return this.supportsTournament;
    }
    
    public void setSupportsTournament(Boolean supportsTournament) {
        this.supportsTournament = supportsTournament;
    }

    public Boolean getSupportsClub() {
        return this.supportsClub;
    }
    
    public void setSupportsClub(Boolean supportsClub) {
        this.supportsClub = supportsClub;
    }

    public Boolean getSupportsPractice() {
        return this.supportsPractice;
    }
    
    public void setSupportsPractice(Boolean supportsPractice) {
        this.supportsPractice = supportsPractice;
    }

    public Integer getDifficultyLevel() {
        return this.difficultyLevel;
    }
    
    public void setDifficultyLevel(Integer difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getTutorialUrl() {
        return this.tutorialUrl;
    }
    
    public void setTutorialUrl(String tutorialUrl) {
        this.tutorialUrl = tutorialUrl;
    }

    public String getRankingType() {
        return this.rankingType;
    }
    
    public void setRankingType(String rankingType) {
        this.rankingType = rankingType;
    }

    public Map<String, Object> getDefaultRuleConfig() {
        return this.defaultRuleConfig;
    }
    
    public void setDefaultRuleConfig(Map<String, Object> defaultRuleConfig) {
        this.defaultRuleConfig = defaultRuleConfig;
    }

    public Map<String, Object> getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public List<String> getSupportedLeaderboardPeriods() {
        return this.supportedLeaderboardPeriods;
    }
    
    public void setSupportedLeaderboardPeriods(List<String> supportedLeaderboardPeriods) {
        this.supportedLeaderboardPeriods = supportedLeaderboardPeriods;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
