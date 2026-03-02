using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PromptTokensDetails
    {
        public int? CachedTokens { get; set; }
        public int? AudioTokens { get; set; }
    }
}
