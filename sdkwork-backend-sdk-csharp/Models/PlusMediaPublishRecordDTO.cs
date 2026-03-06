using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusMediaPublishRecordDTO
    {
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Version { get; set; }
        public string? BatchId { get; set; }
        public int? UserId { get; set; }
        public int? NoteId { get; set; }
        public string? NoteUuid { get; set; }
        public string? NoteTitle { get; set; }
        public string? Platform { get; set; }
        public string? Action { get; set; }
        public string? Status { get; set; }
        public string? DraftMediaId { get; set; }
        public string? PublishId { get; set; }
        public string? ArticleId { get; set; }
        public int? ArticleIndex { get; set; }
        public int? Errcode { get; set; }
        public string? Errmsg { get; set; }
        public Dictionary<string, object>? RequestPayload { get; set; }
        public Dictionary<string, object>? ResponsePayload { get; set; }
        public string? StartedAt { get; set; }
        public string? FinishedAt { get; set; }
    }
}
