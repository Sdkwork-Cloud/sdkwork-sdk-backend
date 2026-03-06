using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusProjectObject
    {
        public string? Name { get; set; }
        public string? Id { get; set; }
        public string? Type { get; set; }
        public string? Owner { get; set; }
        public string? LastModifiedTime { get; set; }
        public string? Version { get; set; }
        public TagsContent? Tags { get; set; }
        public string? Description { get; set; }
        public string? Title { get; set; }
        public string? CreatedAt { get; set; }
        public int? OwnerId { get; set; }
        public string? Uuid { get; set; }
        public int? DiskId { get; set; }
        public string? Author { get; set; }
        public List<PlusFileObject>? Files { get; set; }
        public string? ScreenType { get; set; }
    }
}
