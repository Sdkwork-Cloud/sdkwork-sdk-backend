using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusChannelAccountForm
    {
        public string? Name { get; set; }
        public string? Channel { get; set; }
        public ChannelConfigInfo? Configs { get; set; }
        public string? Status { get; set; }
        public string? Description { get; set; }
    }
}
