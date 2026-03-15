package com.sdkwork.backend.model;

public class PlusGameRecordQueryForm {
    private Integer id;
    private String createdAtFrom;
    private String createdAtTo;
    private Integer userId;
    private Integer roomId;
    private Integer matchId;
    private Integer tournamentId;
    private Integer clubId;
    private Integer seatNo;
    private Boolean winner;
    private Boolean escaped;
    private String gameType;
    private String gameModeCode;
    private String resultType;

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

    public Integer getTournamentId() {
        return this.tournamentId;
    }
    
    public void setTournamentId(Integer tournamentId) {
        this.tournamentId = tournamentId;
    }

    public Integer getClubId() {
        return this.clubId;
    }
    
    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    public Integer getSeatNo() {
        return this.seatNo;
    }
    
    public void setSeatNo(Integer seatNo) {
        this.seatNo = seatNo;
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

    public String getResultType() {
        return this.resultType;
    }
    
    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
}
