using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusPermissionVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? Name { get; set; }
        public string? Code { get; set; }
        public string? Description { get; set; }
        public string? Status { get; set; }
        public int? SortOrder { get; set; }
        public string? ResourceUrl { get; set; }
        public string? HttpMethod { get; set; }
    }
}
