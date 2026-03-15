using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameActionRecordQueryForm
    {
        public int? Id { get; set; }
        public string? CreatedAtFrom { get; set; }
        public string? CreatedAtTo { get; set; }
        public int? RoomId { get; set; }
        public int? MatchId { get; set; }
        public int? PlayerUserId { get; set; }
        public string? ActionType { get; set; }
        public string? ActionCode { get; set; }
    }
}
