using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ChannelResourceInfo
    {
        public List<ChannelResourceItem>? Items { get; set; }
    }
}
