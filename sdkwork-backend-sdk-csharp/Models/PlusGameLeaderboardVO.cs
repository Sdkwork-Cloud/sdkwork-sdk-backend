using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameLeaderboardVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? LeaderboardId { get; set; }
        public string? LeaderboardNo { get; set; }
        public string? Name { get; set; }
        public string? ShortName { get; set; }
        public string? GameType { get; set; }
        public string? GameModeCode { get; set; }
        public string? RankingType { get; set; }
        public string? PeriodType { get; set; }
        public string? ScopeType { get; set; }
        public int? ScopeOwnerId { get; set; }
        public string? ScopeName { get; set; }
        public string? SeasonKey { get; set; }
        public int? ClubId { get; set; }
        public int? TournamentId { get; set; }
        public string? RegionCode { get; set; }
        public string? Status { get; set; }
        public bool? RankedOnly { get; set; }
        public bool? IncludeFriendRoom { get; set; }
        public bool? IncludeTournamentRoom { get; set; }
        public bool? IncludeClubRoom { get; set; }
        public int? MinMatchCount { get; set; }
        public int? MinWinRateMatchCount { get; set; }
        public int? TotalParticipantCount { get; set; }
        public string? PeriodStartAt { get; set; }
        public string? PeriodEndAt { get; set; }
        public string? PublishedAt { get; set; }
        public string? SettledAt { get; set; }
        public List<PlusGameLeaderboardEntryVO>? Entries { get; set; }
    }
}
