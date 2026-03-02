using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusVipBenefitForm
    {
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? BenefitKey { get; set; }
        public string? Type { get; set; }
    }
}
