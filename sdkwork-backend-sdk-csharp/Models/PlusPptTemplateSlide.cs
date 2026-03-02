using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusPptTemplateSlide
    {
        public int? TenantId { get; set; }
        public int? OrganizationId { get; set; }
        public string? DataScope { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? V { get; set; }
        public int? TemplateId { get; set; }
        public PlusPptTemplate? PptTemplate { get; set; }
        public PPTSlideType? Type { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public int? SortOrder { get; set; }
        public string? LayoutType { get; set; }
        public PlusPptSlide? SlideConfig { get; set; }
        public PlusPptPayload? Payload { get; set; }
        public PPTTurningMode? PptturningMode { get; set; }
    }
}
