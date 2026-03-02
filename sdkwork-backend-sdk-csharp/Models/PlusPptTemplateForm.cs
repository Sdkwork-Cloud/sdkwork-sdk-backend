using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusPptTemplateForm
    {
        public string? Title { get; set; }
        public string? Description { get; set; }
        public ImageMediaResourceList? CoverImages { get; set; }
        public string? Type { get; set; }
        public string? Status { get; set; }
        public int? AuthorId { get; set; }
        public string? AuthorName { get; set; }
        public PlusPptTemplateTags? Tags { get; set; }
        public PlusPptTemplateMeta? Meta { get; set; }
        public List<PlusPptTemplateSlide>? Slides { get; set; }
    }
}
