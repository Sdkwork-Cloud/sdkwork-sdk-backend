using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameGrowthAccountVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? AccountId { get; set; }
        public int? UserId { get; set; }
        public string? AccountType { get; set; }
        public string? GameType { get; set; }
        public string? GameModeCode { get; set; }
        public string? SeasonKey { get; set; }
        public int? CurrentLevelConfigId { get; set; }
        public int? CurrentLevelNo { get; set; }
        public string? CurrentLevelCode { get; set; }
        public string? CurrentLevelName { get; set; }
        public string? CurrentTitle { get; set; }
        public string? CurrentBadgeCode { get; set; }
        public int? CurrentExp { get; set; }
        public int? TotalExp { get; set; }
        public int? CurrentLevelStartExp { get; set; }
        public int? NextLevelRequiredExp { get; set; }
        public int? ExpToNextLevel { get; set; }
        public double? ProgressPercent { get; set; }
        public int? PeakLevelNo { get; set; }
        public int? PeakExp { get; set; }
        public int? LevelUpCount { get; set; }
        public int? RewardClaimedCount { get; set; }
        public string? LastGainAt { get; set; }
        public string? LastLevelUpAt { get; set; }
        public string? LastResetAt { get; set; }
        public bool? Active { get; set; }
        public int? LastClaimedLevelNo { get; set; }
        public string? LastRewardClaimedAt { get; set; }
        public string? LastRewardIssuedAt { get; set; }
        public string? LastClaimedRewardLevelCode { get; set; }
        public string? LastClaimedRewardLevelName { get; set; }
        public Dictionary<string, object>? LastClaimedRewardSummary { get; set; }
        public Dictionary<string, object>? LastClaimedRewardConfig { get; set; }
        public Dictionary<string, object>? ExtData { get; set; }
    }
}
