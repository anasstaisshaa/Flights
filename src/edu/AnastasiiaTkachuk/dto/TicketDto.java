package edu.AnastasiiaTkachuk.dto;

import lombok.Builder;
import lombok.Value;

import java.util.Objects;

@Value
public class TicketDto {
    Long id;
    Long flightId;
    String seatNo;

}
