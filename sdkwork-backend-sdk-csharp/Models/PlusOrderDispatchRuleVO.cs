using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusOrderDispatchRuleVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? TaskCode { get; set; }
        public string? TaskName { get; set; }
        public bool? Enabled { get; set; }
        public bool? AllowGrab { get; set; }
        public bool? AllowAssign { get; set; }
        public int? DefaultTaskConcurrentLimit { get; set; }
        public OrderDispatchRuleMetadata? Metadata { get; set; }
    }
}
