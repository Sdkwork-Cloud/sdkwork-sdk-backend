using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusPptSlide
    {
        public string? Id { get; set; }
        public List<PPTBaseElement>? Elements { get; set; }
        public List<PPTNote>? Notes { get; set; }
        public string? Remark { get; set; }
        public PPTSlideBackground? Background { get; set; }
        public List<PPTAnimation>? Animations { get; set; }
        public PPTTurningMode? TurningMode { get; set; }
        public PPTSectionTag? SectionTag { get; set; }
        public PPTSlideType? Type { get; set; }
        public PlusPptPayload? Payload { get; set; }
    }
}
