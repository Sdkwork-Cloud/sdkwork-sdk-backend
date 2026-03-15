using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameMatchVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? MatchId { get; set; }
        public int? DefinitionId { get; set; }
        public int? RoomId { get; set; }
        public string? GameType { get; set; }
        public string? GameModeCode { get; set; }
        public string? SeasonKey { get; set; }
        public string? MatchNo { get; set; }
        public string? RoomType { get; set; }
        public string? Status { get; set; }
        public bool? Ranked { get; set; }
        public int? TotalPlayerCount { get; set; }
        public int? ClubId { get; set; }
        public int? TournamentId { get; set; }
        public string? RegionCode { get; set; }
        public int? CurrentRoundNo { get; set; }
        public int? MaxRoundCount { get; set; }
        public int? CurrentTurnSeatNo { get; set; }
        public int? DealerSeatNo { get; set; }
        public int? WinnerSeatNo { get; set; }
        public int? WinnerUserId { get; set; }
        public int? ReplayId { get; set; }
        public int? ActionCount { get; set; }
        public int? MoveCount { get; set; }
        public bool? LeaderboardEligible { get; set; }
        public bool? ValidForStats { get; set; }
        public bool? ResultConfirmed { get; set; }
        public bool? AbnormalFinished { get; set; }
        public string? InvalidReason { get; set; }
        public string? StartedAt { get; set; }
        public string? SettledAt { get; set; }
        public string? EndedAt { get; set; }
        public int? DurationSeconds { get; set; }
    }
}
