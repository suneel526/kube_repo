package com.booking.recruitment.hotel.service.impl;

import com.booking.recruitment.hotel.dto.RatingReportDto;
import com.booking.recruitment.hotel.model.Hotel;
import com.booking.recruitment.hotel.service.CityService;
import com.booking.recruitment.hotel.service.HotelService;
import com.booking.recruitment.hotel.service.RatingService;
import com.booking.recruitment.hotel.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class DefaultSearchService implements SearchService {
  private final CityService cityService;

  @Autowired
  DefaultSearchService(CityService cityService) {
    this.cityService = cityService;
  }

  @Override
  public List<Hotel> getTopHotels(Long cityId, Long count) {
    return null;
  }
}
