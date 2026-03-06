using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAgentSkillFeatureForm
    {
        public bool? Featured { get; set; }
        public int? RecommendWeight { get; set; }
    }
}
