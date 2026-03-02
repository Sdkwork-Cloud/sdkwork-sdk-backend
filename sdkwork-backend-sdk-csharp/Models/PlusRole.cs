using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusRole
    {
        public int? TenantId { get; set; }
        public int? OrganizationId { get; set; }
        public string? DataScope { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? V { get; set; }
        public string? Code { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Status { get; set; }
        public List<PlusPermission>? Permissions { get; set; }
        public List<string>? PermissionCodes { get; set; }
    }
}
