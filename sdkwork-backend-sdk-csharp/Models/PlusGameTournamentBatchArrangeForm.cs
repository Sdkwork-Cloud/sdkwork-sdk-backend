using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameTournamentBatchArrangeForm
    {
        public List<int>? UserIds { get; set; }
        public List<PlusGameTournamentBatchArrangePlayerForm>? ArrangePlayers { get; set; }
        public int? SeedNoStart { get; set; }
        public int? TeamNoStart { get; set; }
        public int? GroupSize { get; set; }
        public bool? OverwriteExistingSeedNo { get; set; }
        public bool? OverwriteExistingTeamNo { get; set; }
    }
}
