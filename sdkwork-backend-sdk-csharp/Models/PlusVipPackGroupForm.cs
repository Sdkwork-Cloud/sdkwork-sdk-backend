using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusVipPackGroupForm
    {
        public int? AppId { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public int? SortWeight { get; set; }
        public string? Status { get; set; }
        public string? Remark { get; set; }
    }
}
