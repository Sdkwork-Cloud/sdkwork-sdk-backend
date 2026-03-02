using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class MsgMusicContent
    {
        public string? Content { get; set; }
        public MusicMediaResource? Resource { get; set; }
        public string? Title { get; set; }
        public string? Artist { get; set; }
        public string? Album { get; set; }
        public int? Duration { get; set; }
    }
}
