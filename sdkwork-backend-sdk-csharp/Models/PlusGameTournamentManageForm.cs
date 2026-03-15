using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameTournamentManageForm
    {
        public string? Status { get; set; }
        public string? SignUpStartAt { get; set; }
        public string? SignUpEndAt { get; set; }
        public string? StartAt { get; set; }
        public string? EndAt { get; set; }
        public int? WinnerUserId { get; set; }
        public int? WinnerClubId { get; set; }
    }
}
