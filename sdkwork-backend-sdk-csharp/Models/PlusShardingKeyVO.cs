using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusShardingKeyVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? ShardingKey { get; set; }
        public int? TenantId { get; set; }
        public string? Owner { get; set; }
        public int? OwnerId { get; set; }
        public string? Status { get; set; }
        public string? Description { get; set; }
    }
}
