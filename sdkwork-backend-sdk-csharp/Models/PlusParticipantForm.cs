using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusParticipantForm
    {
        public string? Type { get; set; }
        public string? Name { get; set; }
        public ImageMediaResource? Face { get; set; }
        public int? UserId { get; set; }
        public int? AgentId { get; set; }
        public string? Role { get; set; }
        public string? ContextType { get; set; }
        public int? ContextId { get; set; }
        public int? ConversationId { get; set; }
        public string? GroupType { get; set; }
        public string? ConversationType { get; set; }
        public bool? IsCreator { get; set; }
        public bool? IsOnline { get; set; }
        public string? LastActiveTime { get; set; }
        public bool? IsTemporary { get; set; }
    }
}
