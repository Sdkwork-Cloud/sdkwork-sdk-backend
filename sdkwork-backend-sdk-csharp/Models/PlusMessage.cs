using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusMessage
    {
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? SendAt { get; set; }
        public int? ConversationId { get; set; }
        public string? Type { get; set; }
        public Participant? Sender { get; set; }
        public Participant? Receiver { get; set; }
        public int? GroupId { get; set; }
        public string? MsgId { get; set; }
        public string? ClientMsgId { get; set; }
        public MessageBody? Body { get; set; }
        public Dictionary<string, object>? Metadata { get; set; }
        public string? Content { get; set; }
    }
}
