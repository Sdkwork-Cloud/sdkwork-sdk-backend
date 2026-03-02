using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PageableObject
    {
        public int? Offset { get; set; }
        public SortObject? Sort { get; set; }
        public bool? Paged { get; set; }
        public int? PageNumber { get; set; }
        public int? PageSize { get; set; }
        public bool? Unpaged { get; set; }
    }
}
