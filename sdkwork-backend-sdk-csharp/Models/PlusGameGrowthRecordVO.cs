using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameGrowthRecordVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? RecordId { get; set; }
        public int? UserId { get; set; }
        public string? AccountType { get; set; }
        public string? GameType { get; set; }
        public string? GameModeCode { get; set; }
        public string? SeasonKey { get; set; }
        public int? RoomId { get; set; }
        public int? MatchId { get; set; }
        public int? TournamentId { get; set; }
        public string? SourceType { get; set; }
        public string? BizNo { get; set; }
        public string? Reason { get; set; }
        public int? ExpBefore { get; set; }
        public int? ExpDelta { get; set; }
        public int? ExpAfter { get; set; }
        public int? TotalExpBefore { get; set; }
        public int? TotalExpDelta { get; set; }
        public int? TotalExpAfter { get; set; }
        public int? LevelConfigIdBefore { get; set; }
        public int? LevelConfigIdAfter { get; set; }
        public int? LevelNoBefore { get; set; }
        public int? LevelNoAfter { get; set; }
        public string? LevelCodeBefore { get; set; }
        public string? LevelCodeAfter { get; set; }
        public bool? LevelUp { get; set; }
        public int? OperatorUserId { get; set; }
        public string? OccurredAt { get; set; }
        public Dictionary<string, object>? SettlementData { get; set; }
        public Dictionary<string, object>? ExtData { get; set; }
    }
}
