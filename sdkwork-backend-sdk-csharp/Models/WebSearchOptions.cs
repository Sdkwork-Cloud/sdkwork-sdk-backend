using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class WebSearchOptions
    {
        public string? SearchContextSize { get; set; }
        public UserLocation? UserLocation { get; set; }
    }
}
