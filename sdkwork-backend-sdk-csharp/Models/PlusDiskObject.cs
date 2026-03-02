using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusDiskObject
    {
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? Owner { get; set; }
        public int? OwnerId { get; set; }
        public string? Name { get; set; }
        public string? Type { get; set; }
        public string? Description { get; set; }
        public int? DiskSize { get; set; }
        public int? UsedSize { get; set; }
    }
}
