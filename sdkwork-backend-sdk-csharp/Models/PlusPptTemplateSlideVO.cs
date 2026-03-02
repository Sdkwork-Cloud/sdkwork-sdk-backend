using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusPptTemplateSlideVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? TemplateId { get; set; }
        public string? SectionTitle { get; set; }
        public string? SectionContent { get; set; }
        public int? PageNumber { get; set; }
        public string? LayoutType { get; set; }
        public string? BackgroundImage { get; set; }
        public int? SortOrder { get; set; }
        public bool? IsRequired { get; set; }
    }
}
