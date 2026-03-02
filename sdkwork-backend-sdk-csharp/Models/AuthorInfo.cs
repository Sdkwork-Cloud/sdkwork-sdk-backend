using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AuthorInfo
    {
        public int? Id { get; set; }
        public ImageMediaResource? FaceImage { get; set; }
        public string? Name { get; set; }
        public string? Email { get; set; }
        public string? Bio { get; set; }
        public string? Website { get; set; }
    }
}
