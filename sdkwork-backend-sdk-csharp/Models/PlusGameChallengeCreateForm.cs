using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameChallengeCreateForm
    {
        public int? ChallengerUserId { get; set; }
        public int? TargetUserId { get; set; }
        public string? GameType { get; set; }
        public string? GameModeCode { get; set; }
        public int? StakeScore { get; set; }
        public string? SourceType { get; set; }
        public int? ArenaId { get; set; }
        public int? LeaderboardId { get; set; }
        public string? Reason { get; set; }
    }
}
