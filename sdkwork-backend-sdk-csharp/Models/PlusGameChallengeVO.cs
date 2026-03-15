using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameChallengeVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? ChallengeId { get; set; }
        public string? ChallengeNo { get; set; }
        public int? ArenaId { get; set; }
        public string? SourceType { get; set; }
        public string? GameType { get; set; }
        public string? GameModeCode { get; set; }
        public string? Status { get; set; }
        public int? ChallengerUserId { get; set; }
        public int? TargetUserId { get; set; }
        public int? WinnerUserId { get; set; }
        public int? LoserUserId { get; set; }
        public int? StakeScore { get; set; }
        public int? ChallengerStakeLocked { get; set; }
        public int? TargetStakeLocked { get; set; }
        public int? LeaderboardId { get; set; }
        public int? RoomId { get; set; }
        public int? MatchId { get; set; }
        public string? Reason { get; set; }
        public string? ChallengedAt { get; set; }
        public string? AcceptedAt { get; set; }
        public string? SettledAt { get; set; }
        public string? ExpiredAt { get; set; }
        public string? CanceledAt { get; set; }
    }
}
