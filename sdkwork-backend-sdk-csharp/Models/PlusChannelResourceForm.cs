using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusChannelResourceForm
    {
        public string? Resource { get; set; }
        public string? Channel { get; set; }
        public int? ChannelAccountId { get; set; }
    }
}
