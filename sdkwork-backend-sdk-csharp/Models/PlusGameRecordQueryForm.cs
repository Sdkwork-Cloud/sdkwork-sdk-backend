using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameRecordQueryForm
    {
        public int? Id { get; set; }
        public string? CreatedAtFrom { get; set; }
        public string? CreatedAtTo { get; set; }
        public int? UserId { get; set; }
        public int? RoomId { get; set; }
        public int? MatchId { get; set; }
        public int? TournamentId { get; set; }
        public int? ClubId { get; set; }
        public int? SeatNo { get; set; }
        public bool? Winner { get; set; }
        public bool? Escaped { get; set; }
        public string? GameType { get; set; }
        public string? GameModeCode { get; set; }
        public string? ResultType { get; set; }
    }
}
