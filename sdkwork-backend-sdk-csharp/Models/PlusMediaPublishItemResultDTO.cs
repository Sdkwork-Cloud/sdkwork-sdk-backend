using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusMediaPublishItemResultDTO
    {
        public int? RecordId { get; set; }
        public int? NoteId { get; set; }
        public string? NoteUuid { get; set; }
        public string? Title { get; set; }
        public int? ArticleIndex { get; set; }
        public bool? Success { get; set; }
        public int? Errcode { get; set; }
        public string? Errmsg { get; set; }
        public string? DraftMediaId { get; set; }
        public string? PublishId { get; set; }
        public string? ArticleId { get; set; }
    }
}
