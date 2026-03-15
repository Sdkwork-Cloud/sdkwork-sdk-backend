using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameTournamentBatchStatusPlayerForm
    {
        public int? UserId { get; set; }
        public string? Status { get; set; }
        public int? RankNo { get; set; }
        public double? ScoreValue { get; set; }
        public int? TotalMatchCount { get; set; }
        public int? WinCount { get; set; }
        public int? LoseCount { get; set; }
    }
}
