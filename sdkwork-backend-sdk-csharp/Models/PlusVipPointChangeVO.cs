using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusVipPointChangeVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? UserId { get; set; }
        public string? ChangeType { get; set; }
        public int? ChangeAmount { get; set; }
        public int? BeforeBalance { get; set; }
        public int? AfterBalance { get; set; }
        public int? SourceId { get; set; }
        public string? SourceType { get; set; }
        public string? Remark { get; set; }
    }
}
