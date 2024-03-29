package com.capstone.smutaxi.entity;

import com.capstone.smutaxi.dto.responses.rally.RallyInformationDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.FetchType.*;

@Entity
@Getter
@Setter
@Table(name = "rally_details")
public class RallyDetail {

    @Id
    @Column(name = "rally_detail_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime startTime;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime endTime;

    private String location;

    //집회 규모
    private String rallyScale;

    //집회 관할군
    private String locationDetail;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "rally_information_id" )
    private RallyInformation rallyInformation;

    public RallyInformationDto.RallyDetailsDto toRallyDetailsDto() {
        RallyInformationDto.RallyDetailsDto rallyDetailsDto = new RallyInformationDto.RallyDetailsDto();
        rallyDetailsDto.setStartTime(this.startTime);
        rallyDetailsDto.setEndTime(this.endTime);
        rallyDetailsDto.setLocation(this.location);
        rallyDetailsDto.setRallyScale(this.rallyScale);
        rallyDetailsDto.setLocationDetail(this.locationDetail);
        return rallyDetailsDto;
    }
}
