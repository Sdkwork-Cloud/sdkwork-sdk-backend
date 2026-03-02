using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ChatMessageQueryListForm
    {
        public int? Id { get; set; }
        public string? CreatedAtFrom { get; set; }
        public string? CreatedAtTo { get; set; }
        public int? ConversationId { get; set; }
        public string? ConversationUuid { get; set; }
        public string? LastSyncMessageId { get; set; }
    }
}
