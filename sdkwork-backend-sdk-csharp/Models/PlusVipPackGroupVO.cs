using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusVipPackGroupVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? AppId { get; set; }
        public string? Name { get; set; }
        public string? Description { get; set; }
        public int? SortWeight { get; set; }
        public string? Status { get; set; }
        public string? Remark { get; set; }
        public List<PlusVipPackVO>? Packs { get; set; }
    }
}
