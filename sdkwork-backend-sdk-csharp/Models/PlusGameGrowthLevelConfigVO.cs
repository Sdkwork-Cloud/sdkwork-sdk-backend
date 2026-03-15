using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameGrowthLevelConfigVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? ConfigId { get; set; }
        public string? AccountType { get; set; }
        public string? GameType { get; set; }
        public string? GameModeCode { get; set; }
        public string? SeasonKey { get; set; }
        public int? LevelNo { get; set; }
        public string? LevelCode { get; set; }
        public string? LevelName { get; set; }
        public string? Title { get; set; }
        public string? BadgeCode { get; set; }
        public string? IconUrl { get; set; }
        public int? RequiredExp { get; set; }
        public int? ExpStartValue { get; set; }
        public int? ExpEndValue { get; set; }
        public int? WinExpReward { get; set; }
        public int? LoseExpReward { get; set; }
        public int? DrawExpReward { get; set; }
        public int? EscapeExpPenalty { get; set; }
        public string? Status { get; set; }
        public bool? Visible { get; set; }
        public string? Description { get; set; }
        public Dictionary<string, object>? RewardConfig { get; set; }
        public Dictionary<string, object>? BenefitConfig { get; set; }
        public Dictionary<string, object>? ExtData { get; set; }
    }
}
