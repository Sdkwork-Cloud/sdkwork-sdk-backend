using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusCollectionVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Type { get; set; }
        public int? ContentId { get; set; }
        public string? CoverImage { get; set; }
        public bool? IsPublic { get; set; }
        public bool? IsPinned { get; set; }
        public int? Sort { get; set; }
        public int? ItemCount { get; set; }
        public int? ViewCount { get; set; }
        public int? FavoriteCount { get; set; }
        public string? LastUpdatedAt { get; set; }
        public int? ParentId { get; set; }
        public List<int>? ChildrenIds { get; set; }
    }
}
