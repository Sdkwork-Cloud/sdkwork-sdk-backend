using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameRoomQueryForm
    {
        public int? Id { get; set; }
        public string? CreatedAtFrom { get; set; }
        public string? CreatedAtTo { get; set; }
        public int? UserId { get; set; }
        public int? DefinitionId { get; set; }
        public string? GameType { get; set; }
        public string? GameModeCode { get; set; }
        public string? SeasonKey { get; set; }
        public string? RoomNo { get; set; }
        public string? RoomNoLike { get; set; }
        public string? NameLike { get; set; }
        public string? RoomType { get; set; }
        public string? Status { get; set; }
        public string? Visibility { get; set; }
        public bool? Ranked { get; set; }
        public bool? AllowSpectator { get; set; }
        public bool? LeaderboardEligible { get; set; }
        public bool? ReplayEnabled { get; set; }
        public int? ClubId { get; set; }
        public int? TournamentId { get; set; }
        public string? RegionCode { get; set; }
        public int? CurrentMatchId { get; set; }
    }
}
