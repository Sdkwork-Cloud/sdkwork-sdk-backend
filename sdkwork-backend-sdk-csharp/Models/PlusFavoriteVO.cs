using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusFavoriteVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
        public int? FolderId { get; set; }
        public string? Remark { get; set; }
        public string? Tags { get; set; }
        public int? SortWeight { get; set; }
        public string? Title { get; set; }
        public ImageMediaResource? Image { get; set; }
        public bool? IsPrivate { get; set; }
        public string? Status { get; set; }
        public int? ViewCount { get; set; }
        public string? LastViewedAt { get; set; }
    }
}
