using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusNotesMediaDraftForm
    {
        public int? UserId { get; set; }
        public string? Platform { get; set; }
        public string? Product { get; set; }
        public List<PlusNotesPublishArticleForm>? Articles { get; set; }
    }
}
