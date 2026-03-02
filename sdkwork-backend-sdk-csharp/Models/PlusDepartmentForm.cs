using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusDepartmentForm
    {
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Owner { get; set; }
        public int? OwnerId { get; set; }
        public string? Code { get; set; }
        public int? SortOrder { get; set; }
        public bool? IsActive { get; set; }
        public int? ParentId { get; set; }
    }
}
