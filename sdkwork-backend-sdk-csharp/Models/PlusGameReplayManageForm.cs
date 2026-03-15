using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameReplayManageForm
    {
        public string? Title { get; set; }
        public bool? PublicVisible { get; set; }
        public bool? AllowShare { get; set; }
        public string? Status { get; set; }
        public string? CoverUrl { get; set; }
        public string? ExpiredAt { get; set; }
    }
}
