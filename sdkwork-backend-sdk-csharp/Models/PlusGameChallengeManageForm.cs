using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameChallengeManageForm
    {
        public string? Status { get; set; }
        public int? WinnerUserId { get; set; }
        public int? RoomId { get; set; }
        public int? MatchId { get; set; }
        public string? Reason { get; set; }
    }
}
