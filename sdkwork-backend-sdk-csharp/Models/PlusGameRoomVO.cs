using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameRoomVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? RoomId { get; set; }
        public int? UserId { get; set; }
        public int? DefinitionId { get; set; }
        public string? GameType { get; set; }
        public string? GameModeCode { get; set; }
        public string? SeasonKey { get; set; }
        public string? RoomNo { get; set; }
        public string? Name { get; set; }
        public string? RoomType { get; set; }
        public string? Status { get; set; }
        public string? Visibility { get; set; }
        public int? SeatCount { get; set; }
        public int? CurrentPlayerCount { get; set; }
        public int? MinStartPlayerCount { get; set; }
        public int? HostSeatNo { get; set; }
        public int? ClubId { get; set; }
        public int? TournamentId { get; set; }
        public string? RegionCode { get; set; }
        public int? CurrentMatchId { get; set; }
        public int? CurrentRoundNo { get; set; }
        public int? PlannedRoundCount { get; set; }
        public int? FinishedRoundCount { get; set; }
        public bool? Ranked { get; set; }
        public bool? AllowSpectator { get; set; }
        public bool? AllowRobot { get; set; }
        public bool? AllowTrusteeship { get; set; }
        public bool? LeaderboardEligible { get; set; }
        public bool? ReplayEnabled { get; set; }
        public int? SpectatorCount { get; set; }
        public string? InviteCode { get; set; }
        public Dictionary<string, object>? RuleConfig { get; set; }
        public Dictionary<string, object>? ExtData { get; set; }
        public string? StartedAt { get; set; }
        public string? EndedAt { get; set; }
        public string? LastActiveAt { get; set; }
    }
}
