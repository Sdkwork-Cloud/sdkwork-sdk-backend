using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameGrowthRewardClaimVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? AccountId { get; set; }
        public int? UserId { get; set; }
        public string? AccountType { get; set; }
        public string? GameType { get; set; }
        public string? GameModeCode { get; set; }
        public string? SeasonKey { get; set; }
        public int? CurrentLevelNo { get; set; }
        public int? LevelNo { get; set; }
        public string? LevelCode { get; set; }
        public string? LevelName { get; set; }
        public string? Title { get; set; }
        public string? BadgeCode { get; set; }
        public string? ClaimedAt { get; set; }
        public string? RewardIssuedAt { get; set; }
        public int? OperatorUserId { get; set; }
        public Dictionary<string, object>? RewardConfig { get; set; }
        public Dictionary<string, object>? RewardSummary { get; set; }
    }
}
