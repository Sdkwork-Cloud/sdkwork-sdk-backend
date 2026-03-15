using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameRoomSeatManageForm
    {
        public int? UserId { get; set; }
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
    }
}
