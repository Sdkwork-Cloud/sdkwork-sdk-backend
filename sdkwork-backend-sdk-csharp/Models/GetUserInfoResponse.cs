using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class GetUserInfoResponse
    {
        public string? UserId { get; set; }
        public string? OpenId { get; set; }
        public string? UnionId { get; set; }
        public string? Username { get; set; }
        public string? Email { get; set; }
        public bool? EmailVerified { get; set; }
        public string? FullName { get; set; }
        public string? AvatarUrl { get; set; }
        public string? Gender { get; set; }
        public string? Nickname { get; set; }
        public int? Sex { get; set; }
        public string? City { get; set; }
        public string? Province { get; set; }
        public string? Country { get; set; }
        public List<string>? Privileges { get; set; }
        public string? Bio { get; set; }
        public string? Blog { get; set; }
        public string? Location { get; set; }
        public string? Company { get; set; }
        public string? FirstName { get; set; }
        public string? LastName { get; set; }
        public string? Locale { get; set; }
        public string? Mobile { get; set; }
        public string? JobTitle { get; set; }
        public string? OfficeLocation { get; set; }
    }
}
