using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusNotesMediaPublishDraftForm
    {
        public int? UserId { get; set; }
        public string? Platform { get; set; }
        public string? Product { get; set; }
        public string? DraftMediaId { get; set; }
    }
}
