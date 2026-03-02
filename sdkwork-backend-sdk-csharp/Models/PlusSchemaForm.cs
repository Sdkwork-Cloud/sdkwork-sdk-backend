using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusSchemaForm
    {
        public string? Name { get; set; }
        public string? Description { get; set; }
        public int? Status { get; set; }
        public int? TableCount { get; set; }
        public string? LastSyncTime { get; set; }
        public bool? IsDefault { get; set; }
        public int? DatasourceId { get; set; }
    }
}
