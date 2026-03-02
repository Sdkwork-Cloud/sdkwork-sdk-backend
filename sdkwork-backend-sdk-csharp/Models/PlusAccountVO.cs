using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAccountVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? UserId { get; set; }
        public double? AvailableBalance { get; set; }
        public double? FrozenBalance { get; set; }
        public int? AvailablePoints { get; set; }
        public int? FrozenPoints { get; set; }
        public string? Status { get; set; }
        public List<PlusAccountHistoryVO>? HistoryList { get; set; }
    }
}
