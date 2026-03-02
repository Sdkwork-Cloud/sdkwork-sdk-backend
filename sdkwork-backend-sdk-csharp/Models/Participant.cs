using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class Participant
    {
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? OpenId { get; set; }
        public string? UnionId { get; set; }
        public string? Name { get; set; }
        public ImageMediaResource? Face { get; set; }
        public int? DeviceId { get; set; }
        public string? DeviceUuid { get; set; }
        public bool? Device { get; set; }
    }
}
