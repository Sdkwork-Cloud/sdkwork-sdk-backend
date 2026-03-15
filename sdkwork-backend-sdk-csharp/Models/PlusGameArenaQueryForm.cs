using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameArenaQueryForm
    {
        public int? Id { get; set; }
        public string? CreatedAtFrom { get; set; }
        public string? CreatedAtTo { get; set; }
        public int? OwnerUserId { get; set; }
        public int? CurrentChampionUserId { get; set; }
        public string? GameType { get; set; }
        public string? GameModeCode { get; set; }
        public string? Status { get; set; }
    }
}
