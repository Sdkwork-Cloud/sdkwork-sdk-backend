using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAgentSkillBatchReviewForm
    {
        public List<int>? SkillIds { get; set; }
        public string? Comment { get; set; }
    }
}
