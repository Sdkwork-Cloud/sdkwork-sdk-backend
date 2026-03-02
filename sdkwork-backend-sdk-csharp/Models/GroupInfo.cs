using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class GroupInfo
    {
        public string? Id { get; set; }
        public string? Object { get; set; }
        public int? Created { get; set; }
        public string? Model { get; set; }
        public string? SystemFingerprint { get; set; }
        public ChatCompletionMetadata? Metadata { get; set; }
        public PlusAgent? Agent { get; set; }
    }
}
