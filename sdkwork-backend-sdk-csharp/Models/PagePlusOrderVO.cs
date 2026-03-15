using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PagePlusOrderVO
    {
        public int? TotalElements { get; set; }
        public int? TotalPages { get; set; }
        public int? Size { get; set; }
        public List<PlusOrderVO>? Content { get; set; }
        public int? Number { get; set; }
        public int? NumberOfElements { get; set; }
        public SortObject? Sort { get; set; }
        public PageableObject? Pageable { get; set; }
        public bool? First { get; set; }
        public bool? Last { get; set; }
        public bool? Empty { get; set; }
    }
}
