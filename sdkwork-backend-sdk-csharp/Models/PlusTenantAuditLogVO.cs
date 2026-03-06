using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusTenantAuditLogVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public int? TenantId { get; set; }
        public string? Action { get; set; }
        public string? Module { get; set; }
        public string? Operator { get; set; }
        public string? Description { get; set; }
        public string? Result { get; set; }
        public string? CreateTime { get; set; }
        public string? Ip { get; set; }
    }
}
