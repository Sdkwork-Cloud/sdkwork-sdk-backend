using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusCategoryVO
    {
        public string? ParentUuid { get; set; }
        public PlusTreeParentMetadata? ParentMetadata { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Type { get; set; }
        public string? Icon { get; set; }
        public int? SortWeight { get; set; }
        public int? ParentId { get; set; }
        public List<string>? Path { get; set; }
        public int? Visible { get; set; }
        public string? Status { get; set; }
        public List<PlusCategoryVO>? Children { get; set; }
        public TagsContent? Tags { get; set; }
        public List<int>? AttributeIds { get; set; }
    }
}
