using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusTenantForm
    {
        public string? Name { get; set; }
        public string? Code { get; set; }
        public string? Status { get; set; }
        public string? Description { get; set; }
        public int? AdminUserId { get; set; }
        public string? ExpireTime { get; set; }
        public InstallAppList? InstallAppList { get; set; }
    }
}
