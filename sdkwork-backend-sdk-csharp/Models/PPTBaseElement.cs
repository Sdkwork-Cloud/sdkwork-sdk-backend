using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PPTBaseElement
    {
        public string? Id { get; set; }
        public int? Left { get; set; }
        public int? Top { get; set; }
        public bool? Lock { get; set; }
        public string? GroupId { get; set; }
        public int? Width { get; set; }
        public int? Height { get; set; }
        public int? Rotate { get; set; }
        public PPTElementLink? Link { get; set; }
        public string? Name { get; set; }
    }
}
