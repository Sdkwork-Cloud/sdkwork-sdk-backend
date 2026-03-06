using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusMediaPublishResultDTO
    {
        public string? BatchId { get; set; }
        public string? Platform { get; set; }
        public string? Action { get; set; }
        public bool? Success { get; set; }
        public int? Errcode { get; set; }
        public string? Errmsg { get; set; }
        public string? DraftMediaId { get; set; }
        public string? PublishId { get; set; }
        public string? ArticleId { get; set; }
        public object? PreviewData { get; set; }
        public List<PlusMediaPublishItemResultDTO>? Items { get; set; }
    }
}
