using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameTournamentBatchArrangePlayerForm
    {
        public int? UserId { get; set; }
        public int? SeedNo { get; set; }
        public int? TeamNo { get; set; }
    }
}
