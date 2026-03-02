using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusUserForm
    {
        public string? Username { get; set; }
        public string? Password { get; set; }
        public string? Salt { get; set; }
        public string? Email { get; set; }
        public string? Phone { get; set; }
        public string? Status { get; set; }
        public List<int>? RoleIds { get; set; }
    }
}
