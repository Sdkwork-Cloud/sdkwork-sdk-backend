using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusFeedsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? UserId { get; set; }
        public string? Title { get; set; }
        public string? Summary { get; set; }
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
        public ImageMediaResourceList? CoverImages { get; set; }
        public AssetMediaResourceList? ResourceList { get; set; }
        public AuthorInfo? Author { get; set; }
        public string? Source { get; set; }
        public string? PublishTime { get; set; }
        public TagsContent? Tags { get; set; }
        public string? Status { get; set; }
        public int? ViewCount { get; set; }
        public int? LikeCount { get; set; }
        public int? CommentCount { get; set; }
    }
}
