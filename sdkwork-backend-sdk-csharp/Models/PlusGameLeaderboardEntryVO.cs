using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameLeaderboardEntryVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? EntryId { get; set; }
        public int? LeaderboardId { get; set; }
        public int? UserId { get; set; }
        public string? RankingType { get; set; }
        public string? PeriodType { get; set; }
        public string? ScopeType { get; set; }
        public int? ScopeOwnerId { get; set; }
        public string? SeasonKey { get; set; }
        public string? NicknameSnapshot { get; set; }
        public string? AvatarUrl { get; set; }
        public int? RankNo { get; set; }
        public int? PreviousRankNo { get; set; }
        public int? PeakRankNo { get; set; }
        public string? Status { get; set; }
        public double? ScoreValue { get; set; }
        public double? ScoreDelta { get; set; }
        public double? TieBreakerValue { get; set; }
        public string? DisplayValue { get; set; }
        public int? TotalMatchCount { get; set; }
        public int? WinCount { get; set; }
        public int? LoseCount { get; set; }
        public int? DrawCount { get; set; }
        public int? StreakCount { get; set; }
        public bool? RewardGranted { get; set; }
        public string? RewardIssuedAt { get; set; }
        public string? BadgeCode { get; set; }
    }
}
