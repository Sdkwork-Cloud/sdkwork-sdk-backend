using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusApiKeyVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? Name { get; set; }
        public string? KeyValue { get; set; }
        public string? MaskedKeyValue { get; set; }
        public string? Type { get; set; }
        public string? Status { get; set; }
        public string? ExpireTime { get; set; }
        public string? Description { get; set; }
        public string? LastUsedTime { get; set; }
    }
}
