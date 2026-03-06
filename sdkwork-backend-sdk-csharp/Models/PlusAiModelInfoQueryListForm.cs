using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAiModelInfoQueryListForm
    {
        public int? Id { get; set; }
        public string? CreatedAtFrom { get; set; }
        public string? CreatedAtTo { get; set; }
        public string? Keyword { get; set; }
        public string? Channel { get; set; }
        public string? ModelType { get; set; }
        public string? Status { get; set; }
        public string? Family { get; set; }
        public bool? OpenSource { get; set; }
    }
}
