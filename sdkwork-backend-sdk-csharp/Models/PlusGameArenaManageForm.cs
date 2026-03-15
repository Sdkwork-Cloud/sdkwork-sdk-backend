using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameArenaManageForm
    {
        public int? OwnerUserId { get; set; }
        public int? CurrentChampionUserId { get; set; }
        public string? GameType { get; set; }
        public string? GameModeCode { get; set; }
        public string? Status { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public int? StakeScore { get; set; }
        public int? RoomId { get; set; }
        public int? MatchId { get; set; }
        public string? Reason { get; set; }
    }
}
