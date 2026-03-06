using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class FileTreeNodeVO
    {
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? Name { get; set; }
        public string? Type { get; set; }
        public bool? IsDirectory { get; set; }
        public string? Path { get; set; }
        public string? RelativePath { get; set; }
        public int? Size { get; set; }
        public string? Content { get; set; }
        public int? ParentId { get; set; }
        public List<FileTreeNodeVO>? Children { get; set; }
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Extension { get; set; }
        public string? Description { get; set; }
        public bool? ReadOnly { get; set; }
    }
}
