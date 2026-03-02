using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusFileObject
    {
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? DiskId { get; set; }
        public string? Name { get; set; }
        public int? Size { get; set; }
        public string? Path { get; set; }
        public string? RelativePath { get; set; }
        public string? Type { get; set; }
        public string? Extension { get; set; }
        public string? LastModifiedTime { get; set; }
        public string? CreatedAt { get; set; }
        public string? VersionId { get; set; }
        public string? Description { get; set; }
        public string? ProjectUuid { get; set; }
        public int? ProjectId { get; set; }
        public string? Owner { get; set; }
        public int? OwnerId { get; set; }
        public string? Author { get; set; }
        public string? Prompt { get; set; }
        public string? Content { get; set; }
        public TagsContent? Tags { get; set; }
        public bool? Readonly { get; set; }
        public List<string>? Permission { get; set; }
        public int? ReferenceFileId { get; set; }
        public List<PlusFileObject>? Children { get; set; }
    }
}
