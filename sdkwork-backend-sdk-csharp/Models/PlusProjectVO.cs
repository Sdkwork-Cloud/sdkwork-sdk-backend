using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusProjectVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? Name { get; set; }
        public string? Code { get; set; }
        public string? Description { get; set; }
        public string? Status { get; set; }
        public int? LeaderId { get; set; }
        public string? StartTime { get; set; }
        public string? EndTime { get; set; }
        public int? BudgetAmount { get; set; }
        public bool? IsDeleted { get; set; }
    }
}
