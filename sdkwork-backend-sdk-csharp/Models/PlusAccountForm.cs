using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAccountForm
    {
        public int? UserId { get; set; }
        public double? AvailableBalance { get; set; }
        public double? FrozenBalance { get; set; }
        public int? AvailablePoints { get; set; }
        public int? FrozenPoints { get; set; }
        public string? Status { get; set; }
    }
}
