package com.main.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.main.entity.CallerTuneInfo;
 
public interface ICallerTuneRepository extends JpaRepository<CallerTuneInfo, Integer>
{
     
}
