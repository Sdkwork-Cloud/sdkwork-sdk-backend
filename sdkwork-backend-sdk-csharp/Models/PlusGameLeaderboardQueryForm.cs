using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameLeaderboardQueryForm
    {
        public int? Id { get; set; }
        public string? CreatedAtFrom { get; set; }
        public string? CreatedAtTo { get; set; }
        public string? GameType { get; set; }
        public string? GameModeCode { get; set; }
        public string? SeasonKey { get; set; }
        public int? ScopeOwnerId { get; set; }
        public string? RankingType { get; set; }
        public string? PeriodType { get; set; }
        public string? ScopeType { get; set; }
    }
}
