package com.main.services;

import java.util.List;
import java.util.Optional;

import com.main.entity.CallerTuneInfo;
 
 
 

public interface ICallerTuneService
{
	 public String saveCallerTune(CallerTuneInfo callerTune); 
	 public String updateCallerTuneById(Integer id, String tuneName, String movieName);
	 public Optional<CallerTuneInfo> getCallerTuneInfoById(Integer id);
	 public String removeCallerTuneInfo(Integer id);
}
