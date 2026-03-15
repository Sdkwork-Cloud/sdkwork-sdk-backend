using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameMatchManageForm
    {
        public string? Status { get; set; }
        public int? CurrentRoundNo { get; set; }
        public int? MaxRoundCount { get; set; }
        public int? CurrentTurnSeatNo { get; set; }
        public int? DealerSeatNo { get; set; }
        public int? WinnerSeatNo { get; set; }
        public int? WinnerUserId { get; set; }
        public bool? LeaderboardEligible { get; set; }
        public bool? ValidForStats { get; set; }
        public bool? ResultConfirmed { get; set; }
        public bool? AbnormalFinished { get; set; }
        public string? InvalidReason { get; set; }
    }
}
