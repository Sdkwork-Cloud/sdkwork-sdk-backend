using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameReplayQueryForm
    {
        public int? Id { get; set; }
        public string? CreatedAtFrom { get; set; }
        public string? CreatedAtTo { get; set; }
        public int? RoomId { get; set; }
        public int? MatchId { get; set; }
        public string? GameType { get; set; }
        public string? RoomType { get; set; }
        public string? GameModeCode { get; set; }
        public string? SeasonKey { get; set; }
        public int? ClubId { get; set; }
        public int? TournamentId { get; set; }
        public string? RegionCode { get; set; }
        public int? OwnerUserId { get; set; }
        public string? TitleLike { get; set; }
        public string? Status { get; set; }
        public bool? PublicVisible { get; set; }
        public bool? AllowShare { get; set; }
    }
}
