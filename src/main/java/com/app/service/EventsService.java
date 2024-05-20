package com.app.service;

import java.util.List;

import com.app.Exception.RestaurantException;
import com.app.model.Events;
import org.springframework.stereotype.Service;

@Service
public interface EventsService {
	
	public Events createEvent(Events event,Long restaurantId) throws RestaurantException;
	
	public List<Events> findAllEvent();
	
	public List<Events> findRestaurantsEvent(Long id);
	
	public void deleteEvent(Long id) throws Exception;
	
	public Events findById(Long id) throws Exception;

}
