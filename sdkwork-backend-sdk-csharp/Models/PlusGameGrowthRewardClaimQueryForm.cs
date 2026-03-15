using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameGrowthRewardClaimQueryForm
    {
        public int? AccountId { get; set; }
        public int? UserId { get; set; }
        public string? AccountType { get; set; }
        public string? GameType { get; set; }
        public string? GameModeCode { get; set; }
        public string? SeasonKey { get; set; }
    }
}
