using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameRoomSeatVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? SeatId { get; set; }
        public int? RoomId { get; set; }
        public int? DefinitionId { get; set; }
        public string? GameType { get; set; }
        public int? UserId { get; set; }
        public int? SeatNo { get; set; }
        public string? Status { get; set; }
        public string? PlayerType { get; set; }
        public string? NicknameSnapshot { get; set; }
        public string? AvatarUrl { get; set; }
        public string? JoinSource { get; set; }
        public int? TeamNo { get; set; }
        public bool? Ready { get; set; }
        public bool? Trusteeship { get; set; }
        public bool? Spectator { get; set; }
        public int? RoomScore { get; set; }
        public int? Chips { get; set; }
        public int? EliminatedRankNo { get; set; }
        public string? JoinedAt { get; set; }
        public string? EliminatedAt { get; set; }
        public string? LeftAt { get; set; }
        public Dictionary<string, object>? HandSnapshot { get; set; }
    }
}
