using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusApiKeyForm
    {
        public string? Name { get; set; }
        public string? KeyValue { get; set; }
        public string? Type { get; set; }
        public string? Status { get; set; }
        public string? ExpireTime { get; set; }
        public string? Description { get; set; }
    }
}
