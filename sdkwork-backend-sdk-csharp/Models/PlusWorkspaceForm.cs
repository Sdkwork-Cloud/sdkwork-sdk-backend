using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusWorkspaceForm
    {
        public string? Name { get; set; }
        public string? Code { get; set; }
        public string? Title { get; set; }
        public string? Description { get; set; }
        public string? Icon { get; set; }
        public string? Color { get; set; }
        public string? Type { get; set; }
        public string? Status { get; set; }
        public int? OwnerId { get; set; }
        public int? LeaderId { get; set; }
        public string? StartTime { get; set; }
        public string? EndTime { get; set; }
        public int? MaxMembers { get; set; }
        public int? CurrentMembers { get; set; }
        public int? MaxStorage { get; set; }
        public int? UsedStorage { get; set; }
        public string? Settings { get; set; }
        public bool? IsDeleted { get; set; }
        public bool? IsPublic { get; set; }
        public bool? IsTemplate { get; set; }
    }
}
