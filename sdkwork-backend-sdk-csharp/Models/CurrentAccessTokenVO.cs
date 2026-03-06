using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class CurrentAccessTokenVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? AppId { get; set; }
        public string? AppName { get; set; }
        public string? Platform { get; set; }
        public int? TenantId { get; set; }
        public int? OrganizationId { get; set; }
        public TokenResult? TenantAccessToken { get; set; }
        public TokenResult? OrganizationAccessToken { get; set; }
    }
}
