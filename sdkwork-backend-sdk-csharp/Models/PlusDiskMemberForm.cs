using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusDiskMemberForm
    {
        public int? DiskId { get; set; }
        public int? UserId { get; set; }
        public DiskPermission? Permission { get; set; }
        public string? Remark { get; set; }
        public bool? IsOwner { get; set; }
    }
}
