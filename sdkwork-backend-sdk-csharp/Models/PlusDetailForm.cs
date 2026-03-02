using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusDetailForm
    {
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
        public DetailContent? Content { get; set; }
    }
}
