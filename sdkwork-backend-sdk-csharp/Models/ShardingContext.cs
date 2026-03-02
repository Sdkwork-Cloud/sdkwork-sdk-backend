using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ShardingContext
    {
        public string? Platform { get; set; }
        public string? Owner { get; set; }
        public string? ShardingKey { get; set; }
        public int? TenantId { get; set; }
        public int? OrganizationId { get; set; }
        public int? UserId { get; set; }
    }
}
