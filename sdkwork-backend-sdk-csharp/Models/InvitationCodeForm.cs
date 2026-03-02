using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class InvitationCodeForm
    {
        public string? Code { get; set; }
        public int? CreatorUserId { get; set; }
        public string? Status { get; set; }
        public string? ExpireTime { get; set; }
        public int? UsageLimit { get; set; }
        public int? UsedCount { get; set; }
    }
}
