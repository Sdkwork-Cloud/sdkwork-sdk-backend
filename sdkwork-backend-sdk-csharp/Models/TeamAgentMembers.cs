using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class TeamAgentMembers
    {
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? Type { get; set; }
        public string? BizType { get; set; }
        public string? Description { get; set; }
        public List<object>? Agents { get; set; }
    }
}
