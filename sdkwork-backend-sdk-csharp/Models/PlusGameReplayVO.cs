using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameReplayVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? ReplayId { get; set; }
        public string? ReplayNo { get; set; }
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
        public string? Title { get; set; }
        public string? Status { get; set; }
        public bool? PublicVisible { get; set; }
        public bool? AllowShare { get; set; }
        public int? DurationSeconds { get; set; }
        public int? ActionCount { get; set; }
        public int? KeyFrameCount { get; set; }
        public string? StorageKey { get; set; }
        public string? CoverUrl { get; set; }
        public Dictionary<string, object>? BoardSnapshot { get; set; }
        public Dictionary<string, object>? KeyFrames { get; set; }
        public string? StartedAt { get; set; }
        public string? EndedAt { get; set; }
        public string? ExpiredAt { get; set; }
    }
}
