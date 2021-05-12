package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.SectorService;
import kodlamaio.northwind.dataAccess.abstracts.SectorDao;
import kodlamaio.northwind.entities.concretes.Sector;

@Service
public class SectorManager implements SectorService {
	private SectorDao sectorDao;

	@Override
	public List<Sector> getAll(){
		return this.sectorDao.findAll();
	}
	@Autowired
	public SectorManager(SectorDao sectorDao) {
		this.sectorDao=sectorDao;
	}
}
