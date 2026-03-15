using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameStatsQueryForm
    {
        public int? UserId { get; set; }
        public string? GameType { get; set; }
        public string? GameModeCode { get; set; }
        public string? SeasonKey { get; set; }
        public string? ScopeType { get; set; }
        public int? ScopeOwnerId { get; set; }
    }
}
