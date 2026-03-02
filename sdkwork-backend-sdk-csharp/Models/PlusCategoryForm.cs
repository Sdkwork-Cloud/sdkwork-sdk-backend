using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusCategoryForm
    {
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Type { get; set; }
        public string? Icon { get; set; }
        public int? SortWeight { get; set; }
        public int? ParentId { get; set; }
        public List<string>? Path { get; set; }
        public int? Visible { get; set; }
        public string? Status { get; set; }
    }
}
