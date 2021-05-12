package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.SectorService;
import kodlamaio.northwind.entities.concretes.Sector;

@RestController
@RequestMapping("/api/sectors")
public class SectorController {
	private SectorService sectorService;
	@Autowired
	public SectorController(SectorService sectorService) {
		super();
		this.sectorService=sectorService;
	}
	@GetMapping("/getall")
	public List<Sector> getAll(){
		return this.sectorService.getAll();
	}
}
