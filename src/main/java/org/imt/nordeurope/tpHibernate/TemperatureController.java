package org.imt.nordeurope.tpHibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.List;

@Controller
public class TemperatureController {

    @Autowired
    private TemperatureRepository tempetureRepository;
    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private RegionRepository regionRepository;
    @Autowired
    private EntityManager entityManager;




    /*@GetMapping(value = { "/" }, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Temperature>> temperatureAll() {
        List< Temperature > result = entityManager.createQuery("from Temperature", Temperature.class).getResultList();
        for (Temperature temperature : result) {
            System.out.println("Temperature (" + temperature.getId() + " : " + temperature.getCountryName() + " : " + temperature.getTemperatureValue());
        }
        return new ResponseEntity<List<Temperature>>(result, HttpStatus.OK);
    }
*/


    /*@GetMapping(value = { "/byName" }, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> temperatureByName() {
        return new ResponseEntity<String>(repo.findByCountry("France").getCountryName(), HttpStatus.OK);
    }*/

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    @RequestMapping(value = { "/countriesList" }, method = RequestMethod.GET)
    public String countriesList(Model model){
        List<Country> countries = countryRepository.findAll();
        model.addAttribute("countries",countries);
        return "coutriesList";
    }
    @RequestMapping(value = { "/createRegion" }, method = RequestMethod.GET)
    public String createRegion(Model model){
        model.addAttribute("countries",countryRepository.findAll());
        return "createRegion";
    }
    @RequestMapping(value = { "/saveNewRegion" }, method = RequestMethod.GET)
    public String saveNewRegion(@RequestParam(name="name")String name,@RequestParam(name="temperature")String temperature,@RequestParam(name="countryName")String countryName ){
        Region region = new Region();
        Temperature temp = new Temperature();
        temp.setValue(Integer.parseInt(temperature));
        tempetureRepository.save(temp);
        temp.setRegion(region);
        region.setTemperature(temp);
        region.setName(name);
        Country country = countryRepository.findByName(countryName);
        region.setCountry(country);
        regionRepository.save(region);
        country.addRegion(region);
        countryRepository.save(country);
        return"index";
    }

    @RequestMapping(value = { "/showRegion" }, method = RequestMethod.GET)
    public String showRegion(Model model,@RequestParam(name="countryName")String countryName){
        model.addAttribute("countryName",countryName);
        model.addAttribute("regions",regionRepository.findRegionByCountry_Name(countryName));
        return "showRegion";
    }

    @RequestMapping(value = { "/goToDeleteRegion" }, method = RequestMethod.GET)
    public String goToDeleteRegion(Model model){
        model.addAttribute("regions",regionRepository.findAll());
        return "deleteRegion";
    }
    @RequestMapping(value = { "/doDeleteRegion" }, method = RequestMethod.GET)
    public String goToDeleteRegion(Model model ,@RequestParam(name="regionName")String regionName){
        Region region = regionRepository.findByName(regionName);
        Country country = region.getCountry();
        country.removeRegion(region);
        countryRepository.save(country);
        regionRepository.delete(region);
        model.addAttribute("regions",regionRepository.findAll());
        return "deleteRegion";
    }
    @RequestMapping(value = { "/goToEditTemperature" }, method = RequestMethod.GET)
    public String goToEditTemperature(Model model){
        model.addAttribute("regions",regionRepository.findAll());
        return "editTemperature";
    }
    @RequestMapping(value = { "/doEditTemperature" }, method = RequestMethod.GET)
    public String doEditTemperature(Model model ,@RequestParam(name="regionName")String regionName,@RequestParam(name="temperature")String temperature){

        Temperature temp = tempetureRepository.findTemperatureByRegion_Name(regionName);
        temp.setValue(Integer.parseInt(temperature));
        tempetureRepository.save(temp);
        model.addAttribute("regions",regionRepository.findAll());
        return "editTemperature";
    }
    @RequestMapping(value = { "/displayCountryWithRegionTempAbove12" }, method = RequestMethod.GET)
    public String displayCountryWithRegionTempAbove12(Model model){

        model.addAttribute("countries",tempetureRepository.findAll());
        return "editTemperature";
    }


}