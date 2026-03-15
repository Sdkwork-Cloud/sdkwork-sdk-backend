using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameRecordVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? RecordId { get; set; }
        public int? RoomId { get; set; }
        public int? MatchId { get; set; }
        public int? UserId { get; set; }
        public string? GameType { get; set; }
        public string? GameModeCode { get; set; }
        public string? SeasonKey { get; set; }
        public int? ClubId { get; set; }
        public int? TournamentId { get; set; }
        public string? RegionCode { get; set; }
        public int? SeatNo { get; set; }
        public int? TeamNo { get; set; }
        public string? ResultType { get; set; }
        public int? RankNo { get; set; }
        public string? NicknameSnapshot { get; set; }
        public string? AvatarUrl { get; set; }
        public bool? Winner { get; set; }
        public bool? Escaped { get; set; }
        public bool? LeaderboardEligible { get; set; }
        public int? ActionCount { get; set; }
        public int? MoveCount { get; set; }
        public int? ScoreBefore { get; set; }
        public int? ScoreDelta { get; set; }
        public int? ScoreAfter { get; set; }
        public int? RatingBefore { get; set; }
        public int? RatingDelta { get; set; }
        public int? RatingAfter { get; set; }
        public int? ChipsBefore { get; set; }
        public int? ChipsDelta { get; set; }
        public int? ChipsAfter { get; set; }
        public string? JoinedAt { get; set; }
        public string? FinishedAt { get; set; }
        public int? BestRankSnapshot { get; set; }
        public Dictionary<string, object>? SettlementData { get; set; }
        public Dictionary<string, object>? HonorSnapshot { get; set; }
    }
}
