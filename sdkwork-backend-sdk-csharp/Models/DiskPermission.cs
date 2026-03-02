using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class DiskPermission
    {
        public List<string>? Permissions { get; set; }
        public List<string>? PermissionSet { get; set; }
    }
}
