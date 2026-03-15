using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameScoreRecordVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? RecordId { get; set; }
        public int? UserId { get; set; }
        public string? GameType { get; set; }
        public string? SeasonKey { get; set; }
        public int? TournamentId { get; set; }
        public int? RoomId { get; set; }
        public int? MatchId { get; set; }
        public int? LeaderboardId { get; set; }
        public string? ChangeType { get; set; }
        public string? RankingType { get; set; }
        public string? PeriodType { get; set; }
        public string? ScopeType { get; set; }
        public string? BizNo { get; set; }
        public string? Reason { get; set; }
        public int? ScoreBefore { get; set; }
        public int? ScoreDelta { get; set; }
        public int? ScoreAfter { get; set; }
        public int? RatingBefore { get; set; }
        public int? RatingDelta { get; set; }
        public int? RatingAfter { get; set; }
        public int? ChipsBefore { get; set; }
        public int? ChipsDelta { get; set; }
        public int? ChipsAfter { get; set; }
        public int? OperatorUserId { get; set; }
        public string? OccurredAt { get; set; }
        public Dictionary<string, object>? SettlementData { get; set; }
        public Dictionary<string, object>? ExtData { get; set; }
    }
}
