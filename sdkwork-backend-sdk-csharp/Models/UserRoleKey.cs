using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class UserRoleKey
    {
        public int? UserId { get; set; }
        public int? RoleId { get; set; }
    }
}
