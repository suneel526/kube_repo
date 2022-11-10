package com.booking.recruitment.hotel.controller;

import com.booking.recruitment.hotel.dto.RatingReportDto;
import com.booking.recruitment.hotel.model.Hotel;
import com.booking.recruitment.hotel.service.RatingService;
import com.booking.recruitment.hotel.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {
  private final Long topHotelCount = 3L;
  private final SearchService searchService ;

  @Autowired
  public SearchController(SearchService searchService) {
    this.searchService = searchService;
  }

  @GetMapping(value = "/{cityId}")
  @ResponseStatus(HttpStatus.OK)
  public List<Hotel> getSearchByCity(@PathVariable Long cityId) {
    return searchService.getTopHotels(cityId, topHotelCount);
  }
}
