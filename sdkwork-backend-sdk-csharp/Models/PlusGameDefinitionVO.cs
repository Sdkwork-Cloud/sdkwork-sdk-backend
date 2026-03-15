using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameDefinitionVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? DefinitionId { get; set; }
        public string? Code { get; set; }
        public string? GameType { get; set; }
        public string? Category { get; set; }
        public string? Name { get; set; }
        public string? Alias { get; set; }
        public string? GameModeCode { get; set; }
        public string? Description { get; set; }
        public string? RuleSummary { get; set; }
        public int? MinPlayers { get; set; }
        public int? MaxPlayers { get; set; }
        public int? SeatCount { get; set; }
        public int? TeamCount { get; set; }
        public int? DefaultRoundCount { get; set; }
        public bool? TurnBased { get; set; }
        public bool? Ranked { get; set; }
        public bool? SupportsSpectator { get; set; }
        public bool? SupportsTrusteeship { get; set; }
        public bool? SupportsRobot { get; set; }
        public bool? SupportsReplay { get; set; }
        public bool? SupportsFriendRoom { get; set; }
        public bool? SupportsTournament { get; set; }
        public bool? SupportsClub { get; set; }
        public bool? SupportsPractice { get; set; }
        public int? DifficultyLevel { get; set; }
        public string? TutorialUrl { get; set; }
        public string? RankingType { get; set; }
        public Dictionary<string, object>? DefaultRuleConfig { get; set; }
        public Dictionary<string, object>? Metadata { get; set; }
        public List<string>? SupportedLeaderboardPeriods { get; set; }
        public bool? Enabled { get; set; }
    }
}
