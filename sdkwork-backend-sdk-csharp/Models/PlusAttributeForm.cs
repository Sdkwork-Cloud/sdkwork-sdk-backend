using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAttributeForm
    {
        public string? Name { get; set; }
        public string? Code { get; set; }
        public string? Description { get; set; }
        public string? Type { get; set; }
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
        public int? CategoryId { get; set; }
        public string? AttributeValue { get; set; }
        public int? SortWeight { get; set; }
        public int? Required { get; set; }
        public string? Status { get; set; }
    }
}
