using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameActionRecordVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? ActionId { get; set; }
        public int? RoomId { get; set; }
        public int? MatchId { get; set; }
        public int? RoundId { get; set; }
        public string? GameType { get; set; }
        public string? RoomType { get; set; }
        public int? ReplayId { get; set; }
        public int? TournamentId { get; set; }
        public int? PlayerUserId { get; set; }
        public int? SeatNo { get; set; }
        public string? PlayerType { get; set; }
        public int? SeqNo { get; set; }
        public int? TurnNo { get; set; }
        public string? PhaseName { get; set; }
        public string? ActionType { get; set; }
        public string? ActionCode { get; set; }
        public string? Notation { get; set; }
        public int? TargetSeatNo { get; set; }
        public string? SourcePosition { get; set; }
        public string? TargetPosition { get; set; }
        public int? ConsumeMillis { get; set; }
        public bool? ValidAction { get; set; }
        public bool? SystemAction { get; set; }
        public bool? TimeoutAction { get; set; }
        public string? ActionAt { get; set; }
        public Dictionary<string, object>? ActionPayload { get; set; }
        public Dictionary<string, object>? BeforeState { get; set; }
        public Dictionary<string, object>? AfterState { get; set; }
    }
}
