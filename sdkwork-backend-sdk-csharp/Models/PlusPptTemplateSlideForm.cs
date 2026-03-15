using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusPptTemplateSlideForm
    {
        public int? TemplateId { get; set; }
        public int? PageNumber { get; set; }
        public string? LayoutType { get; set; }
        public int? SortOrder { get; set; }
        public bool? IsRequired { get; set; }
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
    }
}
