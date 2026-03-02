using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class SortObject
    {
        public bool? Empty { get; set; }
        public bool? Sorted { get; set; }
        public bool? Unsorted { get; set; }
    }
}
