using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusApiSecurityPolicyVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? PolicyCode { get; set; }
        public string? ApiType { get; set; }
        public string? PathPattern { get; set; }
        public string? HttpMethod { get; set; }
        public string? MatchMode { get; set; }
        public string? AuthMode { get; set; }
        public bool? AllowAnonymous { get; set; }
        public string? RequiredRoles { get; set; }
        public string? RequiredPermissions { get; set; }
        public int? Priority { get; set; }
        public bool? Enabled { get; set; }
        public string? Description { get; set; }
    }
}
