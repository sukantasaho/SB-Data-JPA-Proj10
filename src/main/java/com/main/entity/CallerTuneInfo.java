package com.main.entity;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class CallerTuneInfo
{
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="TUNED_ID")
     private Integer tuneId;
	 
	 @NonNull
	 @Column(name="TUNE_NAME")
	 private String tuneName;
	 
	 @NonNull
	 @Column(name="MOVIE_NAME")
     private String movieName;
	 
	 @Version
	 @Column(name="UPDATE_COUNT")
	 private Integer countUpdated;
	 
 
	 
	 @Column(name="CREATED_DATE")
	 @CreationTimestamp
     private LocalDateTime createdDate;
	 
	 @Column(name="LAST_MODIFIED")
	 @UpdateTimestamp
     private LocalDateTime lastModified;
	 
	  
}
