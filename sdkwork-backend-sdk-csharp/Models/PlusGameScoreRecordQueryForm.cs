using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameScoreRecordQueryForm
    {
        public int? Id { get; set; }
        public string? CreatedAtFrom { get; set; }
        public string? CreatedAtTo { get; set; }
        public int? UserId { get; set; }
        public string? GameType { get; set; }
        public string? ChangeType { get; set; }
        public int? TournamentId { get; set; }
        public int? RoomId { get; set; }
        public int? MatchId { get; set; }
        public int? LeaderboardId { get; set; }
        public string? BizNo { get; set; }
        public int? OperatorUserId { get; set; }
    }
}
