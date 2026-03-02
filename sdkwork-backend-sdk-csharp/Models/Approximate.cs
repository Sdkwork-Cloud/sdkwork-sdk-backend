using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class Approximate
    {
        public string? City { get; set; }
        public string? Country { get; set; }
        public string? Region { get; set; }
        public string? Timezone { get; set; }
    }
}
