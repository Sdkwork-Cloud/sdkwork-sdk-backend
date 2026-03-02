using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusPptTemplateVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public ImageMediaResourceList? CoverImages { get; set; }
        public string? Type { get; set; }
        public string? Status { get; set; }
        public int? AuthorId { get; set; }
        public string? AuthorName { get; set; }
        public PlusPptTemplateTags? Tags { get; set; }
        public PlusPptTemplateMeta? Meta { get; set; }
        public List<PlusPptTemplateSlideVO>? Slides { get; set; }
    }
}
