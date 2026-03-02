using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusCommentsReplyForm
    {
        public string? Content { get; set; }
        public int? UserId { get; set; }
    }
}
