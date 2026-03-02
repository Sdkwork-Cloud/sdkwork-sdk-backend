using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusRolePermissionVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? RoleId { get; set; }
        public string? RoleUuid { get; set; }
        public int? PermissionId { get; set; }
        public string? PermissionUuid { get; set; }
        public bool? Enabled { get; set; }
        public string? Description { get; set; }
        public int? OperatorId { get; set; }
        public string? Status { get; set; }
    }
}
