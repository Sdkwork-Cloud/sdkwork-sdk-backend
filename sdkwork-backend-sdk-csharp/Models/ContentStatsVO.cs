using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ContentStatsVO
    {
        public int? WordCount { get; set; }
        public int? ChapterCount { get; set; }
        public int? FileSize { get; set; }
    }
}
