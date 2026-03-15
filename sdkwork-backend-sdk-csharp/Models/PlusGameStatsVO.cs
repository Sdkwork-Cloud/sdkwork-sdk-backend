using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameStatsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? StatsId { get; set; }
        public int? UserId { get; set; }
        public string? GameType { get; set; }
        public string? GameModeCode { get; set; }
        public string? SeasonKey { get; set; }
        public string? ScopeType { get; set; }
        public int? ScopeOwnerId { get; set; }
        public int? ClubId { get; set; }
        public string? RegionCode { get; set; }
        public string? NicknameSnapshot { get; set; }
        public string? AvatarUrl { get; set; }
        public string? RankingType { get; set; }
        public int? TotalMatchCount { get; set; }
        public int? WinCount { get; set; }
        public int? LoseCount { get; set; }
        public int? DrawCount { get; set; }
        public int? EscapeCount { get; set; }
        public int? TotalRoundCount { get; set; }
        public int? TotalActionCount { get; set; }
        public int? TotalMoveCount { get; set; }
        public int? TotalDurationSeconds { get; set; }
        public int? Score { get; set; }
        public int? RatingScore { get; set; }
        public int? ChipsBalance { get; set; }
        public int? ProfitAmount { get; set; }
        public double? WinRate { get; set; }
        public int? CurrentWinStreak { get; set; }
        public int? BestWinStreak { get; set; }
        public int? HighestRatingScore { get; set; }
        public int? BestRankNo { get; set; }
        public int? BestDailyRankNo { get; set; }
        public int? BestWeeklyRankNo { get; set; }
        public int? BestMonthlyRankNo { get; set; }
        public int? BestQuarterlyRankNo { get; set; }
        public int? BestYearlyRankNo { get; set; }
        public int? HonorCount { get; set; }
        public int? LeaderboardPosition { get; set; }
        public string? LastMatchAt { get; set; }
        public int? ChallengeTotalCount { get; set; }
        public int? ChallengeWinCount { get; set; }
        public int? ChallengeLoseCount { get; set; }
        public int? ArenaAttackWinCount { get; set; }
        public int? ArenaDefenseWinCount { get; set; }
        public int? ArenaDefenseLoseCount { get; set; }
        public int? ArenaBestDefenseStreak { get; set; }
    }
}
