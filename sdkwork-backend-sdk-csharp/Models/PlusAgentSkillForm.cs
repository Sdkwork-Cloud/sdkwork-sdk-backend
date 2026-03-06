using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAgentSkillForm
    {
        public int? UserId { get; set; }
        public string? SkillKey { get; set; }
        public string? Name { get; set; }
        public string? Summary { get; set; }
        public string? Description { get; set; }
        public string? Icon { get; set; }
        public string? CoverImage { get; set; }
        public int? CategoryId { get; set; }
        public int? PackageId { get; set; }
        public string? Provider { get; set; }
        public string? Version { get; set; }
        public string? Runtime { get; set; }
        public string? Entrypoint { get; set; }
        public string? ManifestUrl { get; set; }
        public string? RepositoryUrl { get; set; }
        public string? HomepageUrl { get; set; }
        public string? DocumentationUrl { get; set; }
        public string? LicenseName { get; set; }
        public string? SourceType { get; set; }
        public string? Visibility { get; set; }
        public bool? Enabled { get; set; }
        public double? Price { get; set; }
        public string? Currency { get; set; }
        public List<string>? Tags { get; set; }
        public List<string>? Capabilities { get; set; }
        public Dictionary<string, object>? ConfigSchema { get; set; }
        public Dictionary<string, object>? DefaultConfig { get; set; }
    }
}
