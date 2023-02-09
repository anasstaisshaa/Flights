package edu.AnastasiiaTkachuk.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public final class FlightDto {
    Long id;
    String description;

}
