package com.sdkwork.backend.model;

public class PlusGameDefinitionQueryForm {
    private Integer id;
    private String createdAtFrom;
    private String createdAtTo;
    private String code;
    private String codeLike;
    private String nameLike;
    private String gameType;
    private String category;
    private String gameModeCode;
    private Boolean enabled;
    private Boolean ranked;
    private Boolean supportsReplay;
    private Boolean supportsTournament;

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

    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeLike() {
        return this.codeLike;
    }
    
    public void setCodeLike(String codeLike) {
        this.codeLike = codeLike;
    }

    public String getNameLike() {
        return this.nameLike;
    }
    
    public void setNameLike(String nameLike) {
        this.nameLike = nameLike;
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

    public String getGameModeCode() {
        return this.gameModeCode;
    }
    
    public void setGameModeCode(String gameModeCode) {
        this.gameModeCode = gameModeCode;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getRanked() {
        return this.ranked;
    }
    
    public void setRanked(Boolean ranked) {
        this.ranked = ranked;
    }

    public Boolean getSupportsReplay() {
        return this.supportsReplay;
    }
    
    public void setSupportsReplay(Boolean supportsReplay) {
        this.supportsReplay = supportsReplay;
    }

    public Boolean getSupportsTournament() {
        return this.supportsTournament;
    }
    
    public void setSupportsTournament(Boolean supportsTournament) {
        this.supportsTournament = supportsTournament;
    }
}
