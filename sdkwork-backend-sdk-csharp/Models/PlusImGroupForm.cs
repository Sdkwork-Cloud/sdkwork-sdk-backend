using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusImGroupForm
    {
        public string? Name { get; set; }
        public string? Description { get; set; }
        public ImageMediaResource? Avatar { get; set; }
        public string? Announcement { get; set; }
        public int? MemberCount { get; set; }
        public int? MaxMembers { get; set; }
        public int? CreatorId { get; set; }
        public string? Type { get; set; }
        public string? Status { get; set; }
        public bool? AllowMemberInvite { get; set; }
        public bool? RequireApproval { get; set; }
    }
}
