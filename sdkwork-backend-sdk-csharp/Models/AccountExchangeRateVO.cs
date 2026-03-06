using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AccountExchangeRateVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? ConfigKey { get; set; }
        public double? PointsToCashRate { get; set; }
        public string? Remarks { get; set; }
    }
}
