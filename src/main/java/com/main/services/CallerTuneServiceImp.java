package com.main.services;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.main.entity.CallerTuneInfo;
import com.main.repository.ICallerTuneRepository;
 

@Service("docService")
public class CallerTuneServiceImp implements ICallerTuneService
{
	@Autowired
	private ICallerTuneRepository repo;

	@Override
	public String saveCallerTune(CallerTuneInfo callerTune) 
	{
	        
		return "Record is inserted with id-"+repo.save(callerTune).getTuneId();
	}

	@Override
	public String updateCallerTuneById(Integer id, String tuneName, String movieName)
	{
		      Optional<CallerTuneInfo> opt = repo.findById(id);
		      String msg = null;
		      if(opt.isPresent())
		      {
		    	  CallerTuneInfo c = opt.get();
		    	  c.setTuneName("Chhati vitare ding dong");
		    	  c.setMovieName("Pilata Bigidigala");
		    	  repo.save(c);
		    	  msg = "Record is updated with id-"+id;
		      }
		      else
		      {
		    	  msg = "We are not found with this id-"+id;
		      }
		      
		return msg;
	}

	@Override
	public Optional<CallerTuneInfo> getCallerTuneInfoById(Integer id) 
	{
		  Optional<CallerTuneInfo> opt = repo.findById(id);
		   
		return opt;
	}

	@Override
	public String removeCallerTuneInfo(Integer id)
	{
		String msg = null;
		if(repo.findById(id).get().getTuneId()==id)
		{
			repo.deleteById(id);
			msg = "Record is deleted with id-"+id;
		}
		else
			msg = "Record is not existed with this id-"+id;
		
		return msg;
	}

	 
}
