using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusMemberLevelVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public int? CardId { get; set; }
        public string? LevelName { get; set; }
        public int? RequiredPoints { get; set; }
        public string? Description { get; set; }
        public string? Status { get; set; }
    }
}
