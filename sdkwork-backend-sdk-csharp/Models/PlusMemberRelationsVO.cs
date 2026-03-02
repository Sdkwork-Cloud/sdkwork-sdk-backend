using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusMemberRelationsVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? MemberId { get; set; }
        public string? Owner { get; set; }
        public int? OwnerId { get; set; }
        public string? Type { get; set; }
        public int? ParentId { get; set; }
        public int? TargetId { get; set; }
        public bool? IsPrimary { get; set; }
        public bool? IsActive { get; set; }
        public string? EffectiveAt { get; set; }
        public string? ExpiredAt { get; set; }
        public int? SortOrder { get; set; }
        public string? Remark { get; set; }
    }
}
