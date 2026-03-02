using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ChannelConfigInfo
    {
        public string? Uuid { get; set; }
        public List<ModelConfig>? Accounts { get; set; }
    }
}
