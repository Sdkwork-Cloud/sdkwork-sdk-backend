using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameMatchQueryForm
    {
        public int? Id { get; set; }
        public string? CreatedAtFrom { get; set; }
        public string? CreatedAtTo { get; set; }
        public int? DefinitionId { get; set; }
        public int? RoomId { get; set; }
        public string? GameType { get; set; }
        public string? GameModeCode { get; set; }
        public string? SeasonKey { get; set; }
        public string? MatchNo { get; set; }
        public string? MatchNoLike { get; set; }
        public string? RoomType { get; set; }
        public string? Status { get; set; }
        public bool? Ranked { get; set; }
        public int? ClubId { get; set; }
        public int? TournamentId { get; set; }
        public string? RegionCode { get; set; }
        public int? WinnerUserId { get; set; }
        public int? ReplayId { get; set; }
        public bool? LeaderboardEligible { get; set; }
        public bool? ValidForStats { get; set; }
        public bool? ResultConfirmed { get; set; }
        public bool? AbnormalFinished { get; set; }
    }
}
