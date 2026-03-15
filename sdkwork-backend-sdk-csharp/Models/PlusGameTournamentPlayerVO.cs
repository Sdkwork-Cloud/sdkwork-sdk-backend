using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameTournamentPlayerVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? PlayerId { get; set; }
        public int? TournamentId { get; set; }
        public int? UserId { get; set; }
        public string? GameType { get; set; }
        public int? ClubId { get; set; }
        public int? TeamNo { get; set; }
        public string? Status { get; set; }
        public int? SeedNo { get; set; }
        public int? RankNo { get; set; }
        public string? NicknameSnapshot { get; set; }
        public string? AvatarUrl { get; set; }
        public double? ScoreValue { get; set; }
        public int? TotalMatchCount { get; set; }
        public int? WinCount { get; set; }
        public int? LoseCount { get; set; }
        public string? RegisteredAt { get; set; }
        public string? CheckedInAt { get; set; }
        public string? FinishedAt { get; set; }
    }
}
