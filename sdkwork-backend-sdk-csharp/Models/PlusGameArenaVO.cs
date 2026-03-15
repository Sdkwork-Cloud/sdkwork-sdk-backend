using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameArenaVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? ArenaId { get; set; }
        public string? ArenaNo { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? GameType { get; set; }
        public string? GameModeCode { get; set; }
        public string? Status { get; set; }
        public int? OwnerUserId { get; set; }
        public int? CurrentChampionUserId { get; set; }
        public int? CurrentChallengeId { get; set; }
        public int? StakeScore { get; set; }
        public int? TotalChallengeCount { get; set; }
        public int? SuccessfulDefenseCount { get; set; }
        public int? FailedDefenseCount { get; set; }
        public int? CurrentDefenseStreak { get; set; }
        public int? BestDefenseStreak { get; set; }
        public int? TotalRewardScore { get; set; }
        public int? RoomId { get; set; }
        public int? MatchId { get; set; }
        public string? OpenedAt { get; set; }
        public string? LastChallengeAt { get; set; }
        public string? LastSettledAt { get; set; }
        public string? ClosedAt { get; set; }
    }
}
