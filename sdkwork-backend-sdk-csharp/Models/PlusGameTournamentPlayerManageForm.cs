using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameTournamentPlayerManageForm
    {
        public string? Status { get; set; }
        public int? SeedNo { get; set; }
        public int? RankNo { get; set; }
        public int? TeamNo { get; set; }
        public double? ScoreValue { get; set; }
        public int? TotalMatchCount { get; set; }
        public int? WinCount { get; set; }
        public int? LoseCount { get; set; }
    }
}
