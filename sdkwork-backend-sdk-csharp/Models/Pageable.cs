using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class Pageable
    {
        public int? Page { get; set; }
        public int? Size { get; set; }
        public List<string>? Sort { get; set; }
    }
}
