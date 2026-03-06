using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusNotesPublishArticleForm
    {
        public int? NoteId { get; set; }
        public string? NoteUuid { get; set; }
        public string? Title { get; set; }
        public string? Content { get; set; }
        public string? Digest { get; set; }
        public string? Author { get; set; }
        public string? ThumbMediaId { get; set; }
        public string? ContentSourceUrl { get; set; }
        public int? ShowCoverPic { get; set; }
        public int? NeedOpenComment { get; set; }
        public int? OnlyFansCanComment { get; set; }
    }
}
