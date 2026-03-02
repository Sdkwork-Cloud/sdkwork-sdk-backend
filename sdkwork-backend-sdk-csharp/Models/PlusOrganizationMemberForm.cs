using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusOrganizationMemberForm
    {
        public int? UserId { get; set; }
        public string? Owner { get; set; }
        public int? OwnerId { get; set; }
        public bool? IsActive { get; set; }
        public string? JoinedAt { get; set; }
        public string? LeftAt { get; set; }
        public string? Remark { get; set; }
    }
}
