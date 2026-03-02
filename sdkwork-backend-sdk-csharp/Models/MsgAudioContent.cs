using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class MsgAudioContent
    {
        public string? Content { get; set; }
        public AudioMediaResource? Resource { get; set; }
    }
}
