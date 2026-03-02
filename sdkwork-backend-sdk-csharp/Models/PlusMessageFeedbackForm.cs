using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusMessageFeedbackForm
    {
        public string? Id { get; set; }
        public string? ConversationId { get; set; }
        public string? Rating { get; set; }
    }
}
