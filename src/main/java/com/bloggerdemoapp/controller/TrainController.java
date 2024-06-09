package com.bloggerdemoapp.controller;

import com.bloggerdemoapp.entity.Station;
import com.bloggerdemoapp.entity.Train;
import com.bloggerdemoapp.entity.Train_Journey;
import com.bloggerdemoapp.repository.StationRepository;
import com.bloggerdemoapp.repository.TrainRepository;
import com.bloggerdemoapp.repository.Train_JourneyRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/trains")
public class TrainController {
    private Train_JourneyRepository trainJourneyRepository;
    private TrainRepository trainRepository;
    private StationRepository stationRepository;

    public TrainController(Train_JourneyRepository trainJourneyRepository, TrainRepository trainRepository,StationRepository stationRepository) {
        this.trainJourneyRepository = trainJourneyRepository;
        this.trainRepository = trainRepository;
        this.stationRepository = stationRepository;
    }
    @PostMapping
    public Train_Journey saveJourney(
            @RequestParam long trainId,
            @RequestParam long stationId,
            @RequestBody Train_Journey trainJourney
    ){
        Train train = trainRepository.findById(trainId).get();
        Station station = stationRepository.findById(stationId).get();

        trainJourney.setTrain(train);
        trainJourney.setStation(station);

        return trainJourneyRepository.save(trainJourney);

    }

}
