using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AppInstallPackage
    {
        public string? Id { get; set; }
        public string? Name { get; set; }
        public string? SourceType { get; set; }
        public string? PackageFormat { get; set; }
        public string? Platform { get; set; }
        public string? Url { get; set; }
        public string? RepositoryUrl { get; set; }
        public string? Branch { get; set; }
        public string? Tag { get; set; }
        public string? CommitId { get; set; }
        public string? ChecksumAlgorithm { get; set; }
        public string? Checksum { get; set; }
        public string? Architecture { get; set; }
        public int? SizeBytes { get; set; }
        public bool? Enabled { get; set; }
    }
}
