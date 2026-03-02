using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class MsgVideoContent
    {
        public string? Content { get; set; }
        public VideoMediaResource? Resource { get; set; }
    }
}
