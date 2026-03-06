using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusImMessageQueryForm
    {
        public int? Id { get; set; }
        public string? CreatedAtFrom { get; set; }
        public string? CreatedAtTo { get; set; }
        public int? ConversationId { get; set; }
        public int? SenderId { get; set; }
        public int? ReceiverId { get; set; }
        public int? GroupId { get; set; }
        public string? Type { get; set; }
    }
}
