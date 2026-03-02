using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PPTNoteReply
    {
        public string? Id { get; set; }
        public string? Content { get; set; }
        public int? Time { get; set; }
        public string? User { get; set; }
    }
}
