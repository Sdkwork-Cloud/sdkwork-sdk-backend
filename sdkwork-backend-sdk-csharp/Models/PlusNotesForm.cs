using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusNotesForm
    {
        public int? Id { get; set; }
        public string? Title { get; set; }
        public string? Content { get; set; }
        public int? UserId { get; set; }
        public int? CategoryId { get; set; }
        public string? Tags { get; set; }
        public string? AccessScope { get; set; }
        public string? Password { get; set; }
        public ImageMediaResource? CoverImage { get; set; }
        public string? Status { get; set; }
        public string? Remark { get; set; }
        public int? DiskId { get; set; }
        public int? ParentId { get; set; }
        public string? Type { get; set; }
        public TagsContent? TagsAsTagsContent { get; set; }
    }
}
