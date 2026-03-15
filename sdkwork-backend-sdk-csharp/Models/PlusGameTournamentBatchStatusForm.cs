using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameTournamentBatchStatusForm
    {
        public List<int>? UserIds { get; set; }
        public List<PlusGameTournamentBatchStatusPlayerForm>? PlayerItems { get; set; }
        public string? Status { get; set; }
        public int? StartRankNo { get; set; }
    }
}
