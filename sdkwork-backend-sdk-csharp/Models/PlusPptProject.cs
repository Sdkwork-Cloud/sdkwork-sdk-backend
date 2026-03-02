using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusPptProject
    {
        public string? Id { get; set; }
        public string? Uuid { get; set; }
        public string? Type { get; set; }
        public string? ScreenType { get; set; }
        public string? Name { get; set; }
        public string? Title { get; set; }
        public string? Owner { get; set; }
        public int? OwnerId { get; set; }
        public int? DiskId { get; set; }
        public List<PlusFileObject>? Files { get; set; }
        public string? Author { get; set; }
        public string? CreatedAt { get; set; }
        public string? LastModifiedTime { get; set; }
        public string? Version { get; set; }
        public string? Prompt { get; set; }
        public string? Description { get; set; }
        public TagsContent? Tags { get; set; }
        public double? Width { get; set; }
        public double? Height { get; set; }
        public List<PlusPptSlide>? Slides { get; set; }
        public PlusPptTheme? Theme { get; set; }
        public PlusPptContext? Context { get; set; }
        public string? Subtitle { get; set; }
        public bool? IncludePageNumbers { get; set; }
        public bool? IncludeFooter { get; set; }
        public string? FooterText { get; set; }
        public string? ExportFormat { get; set; }
    }
}
