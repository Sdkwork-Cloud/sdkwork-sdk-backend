using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusFileForm
    {
        public string? Name { get; set; }
        public string? Path { get; set; }
        public string? ObjectKey { get; set; }
        public int? Size { get; set; }
        public string? ContentType { get; set; }
        public string? Extension { get; set; }
        public string? StorageClass { get; set; }
        public string? VersionId { get; set; }
        public FileMediaResource? Resource { get; set; }
        public string? UploadTime { get; set; }
        public string? LastAccessTime { get; set; }
        public string? Description { get; set; }
        public TagsContent? Tags { get; set; }
        public string? FileType { get; set; }
        public string? FileCategory { get; set; }
        public bool? IsPublic { get; set; }
        public string? Status { get; set; }
        public int? ParentId { get; set; }
        public string? Etag { get; set; }
    }
}
