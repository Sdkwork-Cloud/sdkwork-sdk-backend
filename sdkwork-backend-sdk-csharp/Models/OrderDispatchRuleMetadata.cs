using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class OrderDispatchRuleMetadata
    {
        public Dictionary<string, int>? RatingConcurrentLimits { get; set; }
        public List<string>? AllowedRatingLevels { get; set; }
    }
}
