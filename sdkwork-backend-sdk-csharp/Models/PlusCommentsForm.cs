using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusCommentsForm
    {
        public string? Content { get; set; }
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
        public string? Status { get; set; }
        public int? Rating { get; set; }
        public int? Likes { get; set; }
        public int? ReplyCount { get; set; }
        public bool? IsTop { get; set; }
        public string? IpAddress { get; set; }
        public string? DeviceInfo { get; set; }
        public int? ParentId { get; set; }
        public string? ParentUuid { get; set; }
        public int? UserId { get; set; }
        public PlusTreeParentMetadata? ParentMetadata { get; set; }
    }
}
