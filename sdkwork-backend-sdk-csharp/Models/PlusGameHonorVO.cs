using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameHonorVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? HonorId { get; set; }
        public int? UserId { get; set; }
        public string? GameType { get; set; }
        public string? SeasonKey { get; set; }
        public string? SourceType { get; set; }
        public int? SourceId { get; set; }
        public int? LeaderboardId { get; set; }
        public int? TournamentId { get; set; }
        public string? PeriodType { get; set; }
        public string? RankingType { get; set; }
        public string? Status { get; set; }
        public int? ClubId { get; set; }
        public string? RegionCode { get; set; }
        public string? Title { get; set; }
        public string? Subtitle { get; set; }
        public string? Description { get; set; }
        public string? BadgeCode { get; set; }
        public string? IconUrl { get; set; }
        public int? RankNo { get; set; }
        public double? ScoreValue { get; set; }
        public bool? WallVisible { get; set; }
        public string? GrantedAt { get; set; }
        public string? ExpiredAt { get; set; }
    }
}
