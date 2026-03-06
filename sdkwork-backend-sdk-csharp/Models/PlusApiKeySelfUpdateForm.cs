using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusApiKeySelfUpdateForm
    {
        public string? Name { get; set; }
        public string? ExpireTime { get; set; }
        public bool? ClearExpireTime { get; set; }
        public string? Description { get; set; }
    }
}
