using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusShopForm
    {
        public string? Name { get; set; }
        public string? Description { get; set; }
        public ImageMediaResource? Logo { get; set; }
        public ImageMediaResource? Cover { get; set; }
        public string? ContactPhone { get; set; }
        public string? ContactEmail { get; set; }
        public GeoPoint? Location { get; set; }
        public string? Address { get; set; }
        public string? LicenseNumber { get; set; }
        public List<string>? Tags { get; set; }
        public string? Status { get; set; }
        public string? BusinessHours { get; set; }
    }
}
