using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameTournamentVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? TournamentId { get; set; }
        public string? TournamentNo { get; set; }
        public string? Name { get; set; }
        public string? ShortName { get; set; }
        public string? Description { get; set; }
        public string? GameType { get; set; }
        public string? GameModeCode { get; set; }
        public string? TournamentType { get; set; }
        public string? Status { get; set; }
        public int? OrganizerUserId { get; set; }
        public int? ClubId { get; set; }
        public string? SeasonKey { get; set; }
        public string? RegionCode { get; set; }
        public int? MinPlayerCount { get; set; }
        public int? MaxPlayerCount { get; set; }
        public int? TeamSize { get; set; }
        public bool? RegistrationRequired { get; set; }
        public bool? Ranked { get; set; }
        public bool? ReplayEnabled { get; set; }
        public string? SignUpStartAt { get; set; }
        public string? SignUpEndAt { get; set; }
        public string? StartAt { get; set; }
        public string? EndAt { get; set; }
        public int? WinnerUserId { get; set; }
        public int? WinnerClubId { get; set; }
        public int? TotalParticipantCount { get; set; }
        public int? TotalMatchCount { get; set; }
        public int? RegisteredCount { get; set; }
        public int? CheckedInCount { get; set; }
        public int? PlayingCount { get; set; }
        public int? AdvancedCount { get; set; }
        public int? EliminatedCount { get; set; }
        public int? FinishedCount { get; set; }
        public int? WithdrawnCount { get; set; }
    }
}
