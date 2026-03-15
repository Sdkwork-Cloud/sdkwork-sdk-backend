using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusKnowledgeBaseForm
    {
        public string? Name { get; set; }
        public int? DiskId { get; set; }
        public string? Channel { get; set; }
        public string? ChannelId { get; set; }
        public int? ProjectId { get; set; }
        public string? Description { get; set; }
    }
}
