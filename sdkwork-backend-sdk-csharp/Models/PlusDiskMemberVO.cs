using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusDiskMemberVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? V { get; set; }
        public int? DiskId { get; set; }
        public int? UserId { get; set; }
        public DiskPermission? Permission { get; set; }
        public string? Remark { get; set; }
        public bool? IsOwner { get; set; }
    }
}
