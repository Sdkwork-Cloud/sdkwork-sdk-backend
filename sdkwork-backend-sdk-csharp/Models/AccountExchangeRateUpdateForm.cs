using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AccountExchangeRateUpdateForm
    {
        public double? PointsToCashRate { get; set; }
        public string? Remarks { get; set; }
    }
}
