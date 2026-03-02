using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusDatasourceForm
    {
        public string? Name { get; set; }
        public int? Type { get; set; }
        public int? Status { get; set; }
        public string? Description { get; set; }
        public DatasourceConfig? ConnectionConfig { get; set; }
        public string? Url { get; set; }
        public string? Owner { get; set; }
        public string? LastConnectedAt { get; set; }
        public int? ConnectionTimeout { get; set; }
        public TagsContent? Tags { get; set; }
        public string? DbVersion { get; set; }
        public int? SecurityLevel { get; set; }
        public int? AccessCount { get; set; }
        public string? Icon { get; set; }
        public string? Color { get; set; }
    }
}
