using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusOrganizationMemberVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? UserId { get; set; }
        public string? Owner { get; set; }
        public int? OwnerId { get; set; }
        public bool? IsActive { get; set; }
        public string? JoinedAt { get; set; }
        public string? LeftAt { get; set; }
        public string? Remark { get; set; }
        public List<int>? DepartmentIds { get; set; }
        public List<int>? PositionIds { get; set; }
        public List<int>? RoleIds { get; set; }
        public int? PrimaryDepartmentId { get; set; }
        public int? PrimaryPositionId { get; set; }
        public bool? Valid { get; set; }
    }
}
