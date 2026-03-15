using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameChallengeQueryForm
    {
        public int? Id { get; set; }
        public string? CreatedAtFrom { get; set; }
        public string? CreatedAtTo { get; set; }
        public int? ChallengerUserId { get; set; }
        public int? TargetUserId { get; set; }
        public int? ArenaId { get; set; }
        public int? WinnerUserId { get; set; }
        public string? GameType { get; set; }
        public string? Status { get; set; }
        public string? SourceType { get; set; }
    }
}
